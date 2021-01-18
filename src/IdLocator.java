import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IdLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("Ajay");
		driver.findElement(By.name("pass")).sendKeys("125616545");
//		driver.findElement(By.linkText("Forgot account?")).click();
//		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
//		driver.close();

	}

}
