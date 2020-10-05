package Week4.day1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElementByXPath("//div[@id='draggable']");
		WebElement target = driver.findElementByXPath("//div[@id='droppable']");
		Actions built=new Actions(driver);
		built.dragAndDrop(source, target).release().perform();
		
	}

}
