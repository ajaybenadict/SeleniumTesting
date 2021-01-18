import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).click();
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("mum");
		//from.sendKeys(Keys.ARROW_DOWN);
		System.out.println(from.getText());
		List<WebElement> box = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li/div/div//p[@class='font14 appendBottom5 blackText']"));
		int count = box.size();
		System.out.println(count);
		System.out.println(box.get(2).getText());
		
		for(int i=0;i<count;i++) {
			from.sendKeys(Keys.ARROW_DOWN);
			String froms =box.get(i).getText();
			System.out.println(froms);
			if(froms.contains("Mumbai")) {
			from.sendKeys(Keys.ENTER);
				break;
			}
		}
	}

}
