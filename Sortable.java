package Week4.day1;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
	 driver.switchTo().frame(0);

		
		WebElement item = driver.findElementByXPath("//ul[@id='sortable']//li[1]");
		
		Point location = driver.findElementByXPath("//ul[@id='sortable']//li[4]").getLocation();
		int x = location.getX();
		int y= location.getY();
		Actions built =new Actions(driver);
	
		built.dragAndDropBy(item, x, y).perform();
		
	}

}
