package Vrushali;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintListgr100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vrushali Erande\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> list = driver.findElements(By.xpath("//p[@class=\"product-price\"]"));
		for (int i = 0; i <= list.size() - 1; i++) {
			int grtprice = Integer.parseInt(list.get(i).getText());
			if (grtprice > 100) {
				List<WebElement> productname = driver.findElements(By.xpath("//h4[@class='product-name']"));
				System.out.println(productname.get(i).getText() + "    " + list.get(i).getText());
			}
		}
	}

}
