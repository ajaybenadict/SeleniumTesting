import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]//label")).click();

		String month = driver
				.findElement(By.xpath("//div[@class='DayPicker-Month']//div[@class='DayPicker-Caption']")).getText();
		
		while (!driver
				.findElement(By.xpath("//div[@class='DayPicker-Month']//div[@class='DayPicker-Caption']")).getText().contains("March")) {

			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			System.out.println(driver.findElement(By.xpath("//div[@class='DayPicker-Month']//div[@class='DayPicker-Caption']")).getText());
		}

		List<WebElement> dates = driver.findElements(By.xpath(
				"//div[@class='DayPicker-Month'][1]//div[@class='DayPicker-Body'][1]//div[@class='DayPicker-Day']"));
		int count = dates.size();
		
		for (int i = 0; i < count; i++) {
			String selection = dates.get(i).getText();
			if (selection.contains("19")) {
				dates.get(i).click();
				break;
			}
		}

	}

}
