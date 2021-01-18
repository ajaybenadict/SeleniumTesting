import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetEndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"))
				.click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"))
				.sendKeys("chen");
		Thread.sleep(2000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT"))
				.sendKeys("mum");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		Select s = new Select(driver.findElement(By.xpath(
				"//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT']")));
		s.selectByIndex(4);
		Thread.sleep(2000);
		Select child = new Select(driver.findElement(By.xpath(
				"//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD']")));
		child.selectByValue("3");
		Thread.sleep(2000);

		Select currency = new Select(driver
				.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
		currency.selectByVisibleText("AED");
		Thread.sleep(2000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
		// driver.close();
	}

}
