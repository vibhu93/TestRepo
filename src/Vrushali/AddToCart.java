package Vrushali;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {
	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vrushali Erande\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

		// using webdriver manager to open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> list = driver.findElements(By.xpath("//p[@class=\"product-price\"]"));
		for (int i = 0; i <= list.size() - 1; i++) {
			int grtprice = Integer.parseInt(list.get(i).getText());
			if (grtprice > 100) {
				List<WebElement> Actbtns = driver.findElements(By.xpath("//div[@class='product-action']/button"));
				Actbtns.get(i).click();
			}
		}
	}
}
