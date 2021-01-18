import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assignmentNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]")).getText());
		String option = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[2]")).getText();
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		s.selectByVisibleText(option);
		
		driver.findElement(By.xpath("//input[@id='name']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(option);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().equals(option);
		Assert.assertTrue(driver.switchTo().alert().getText().contains(option));
		driver.switchTo().alert().accept();
		
	}

}
