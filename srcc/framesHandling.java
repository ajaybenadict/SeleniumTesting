import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class framesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		int size = driver.findElements(By.tagName("a")).size();
		
		for (int i=1;i<size;i++) {
			String tobeDone=Keys.chord(Keys.CONTROL,Keys.ENTER);
			driver.findElements(By.tagName("a")).get(i).sendKeys(tobeDone);
		}
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
	}
}
