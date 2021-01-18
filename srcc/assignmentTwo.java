import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int number = driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println(number);
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
		System.out.println(driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th")).size());
		System.out.println(list.get(1).getText());
		driver.close();
		//System.out.println(.get(i).getText());
		
	}

}
