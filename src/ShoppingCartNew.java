import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ShoppingCartNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,5);
		String[] neededVeggies = {"Beans","Carrot","Brinjal"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(2500);
		addNeededVeggies(driver,neededVeggies);
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	}

	private static void addNeededVeggies(WebDriver driver, String[] neededVeggies) {
		List<WebElement> veggies=driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<veggies.size();i++) {
			int j=0;
			String[] neededItems =veggies.get(i).getText().split("-");
			String newName = neededItems[0].trim();
			List<String> itemsNeeded = Arrays.asList(neededVeggies);
			if(itemsNeeded.contains(newName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==neededVeggies.length) {
					break;
				}
			}
		}
		
	}

}
