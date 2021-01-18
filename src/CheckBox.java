import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
		Assert.assertTrue(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).isSelected());
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"));
		
		source.click();
		System.out.println(source.getText());
		source.sendKeys("chenn");
		Thread.sleep(2000);
		
		
		System.out.println(source.getText());
		System.out.println("source.getText()");
	}

}
