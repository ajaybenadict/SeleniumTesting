import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String[] neededItems = {"Cucumber","Beetroot","Pumpkin"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2500);
		addItems(driver,neededItems);
		//driver.close();
		
		

	}

	private static void addItems(WebDriver driver, String[] neededItems) {
		// TODO Auto-generated method stub
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++) {
			
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List<String> itemsNeededList = Arrays.asList(neededItems);
			
			if(itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==neededItems.length) {
					break;
				}
			}
		}
	}
	
}
