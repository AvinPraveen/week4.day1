package Week4.day1;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoom2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(1000);
		driver.findElementById("pushDenied").click();
		// driver.findElementByXPath("//div[@class='leftNavigationLeftContainer expandDiv']/ul/li[7]/a/span").click();;
		WebElement men = driver.findElementByXPath("//div[@class='leftNavigationLeftContainer expandDiv']/ul/li[7]/a/span");
		
		//driver.findElementByXPath("//*[@id=\"category6Data\"]/div[2]/div/div/p[3]/a/span").click();
		WebElement items = driver.findElementByXPath("//*[@id=\"category6Data\"]/div[2]/div/div/p[3]/a/span");
		//Thread.sleep(1000);
		
		
		  Actions builder=new Actions(driver);
		  //builder.clickAndHold(men).moveToElement(items).release().perform();
		  builder.moveToElement(men).moveToElement(items).click().perform();
		
		 
		//builder.contextClick(element);
	}

}
