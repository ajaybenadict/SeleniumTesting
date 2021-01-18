import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;



public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		Select s= new Select(driver.findElement(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT']")));
		s.selectByValue("4");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "4 Adult");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXG']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='marketDate_2']//div[@class='left']//span[@id='spclearDate']")).getAttribute("style"));
		driver.findElement(By.id("RoundTrip")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='marketDate_2']//div[@class='left']//span[@id='spclearDate']")).getAttribute("style"));
		if(driver.findElement(By.xpath("//div[@id='marketDate_2']//div[@class='left']//span[@id='spclearDate']")).getAttribute("style").contains("block")) {
			System.out.println("block");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("none");
			Assert.assertTrue(false);
		}
		driver.close();
	}

}
