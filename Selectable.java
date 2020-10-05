package Week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li");
		WebElement item2 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		
		Actions build=new Actions(driver);
		
		build.clickAndHold(item1).moveToElement(item2).release().perform();

	}

}
