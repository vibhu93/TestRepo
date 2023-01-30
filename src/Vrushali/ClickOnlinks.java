package Vrushali;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vrushali Erande\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//a"));
		int listSize=list.size();
		for(int i=1;i<=listSize-2;i++) {
			if(!list.get(i).getText().isEmpty()) {
				list.get(i).click();
				Thread.sleep(1000);
				driver.navigate().back();
				}
		}
		System.out.println("Clicked on all links");
	}
}
