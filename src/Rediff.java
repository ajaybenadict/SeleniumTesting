import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("Hello Rediff");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Vaada");
		driver.findElement(By.cssSelector("input[value*='Sign']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='div_login_error']/b")).getText());
	}

}
