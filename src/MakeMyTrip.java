import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("MUM");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(2000);
		to.click();
		to.sendKeys("che");
		Thread.sleep(2000);
		int i=1;
		while(i<5) {
			to.sendKeys(Keys.ARROW_DOWN);
			i++;
		}
		
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("toCity")).click();
		System.out.println(driver.findElement(By.xpath("//input[@placeholder='To']")).getText());
		System.out.println("HWELOO");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
