import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.xpath("//a[@class='h-c-button h-c-header__cta-li-link h-c-header__cta-li-link--primary']")).click();
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String Parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("hello");
	}

}
