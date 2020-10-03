package Week4.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassDynamicTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.findElementByXPath("//input[@type='checkbox' and @id='chkSelectDateOnly']").click();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms");
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		
		driver.findElementByClassName("icon-shuffle").sendKeys(Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu");
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		int size = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr").size();
		System.out.println(size);
		
		List<WebElement> list = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		Set<WebElement> uniquecount = new HashSet<WebElement>(list);
		
		for (WebElement u : uniquecount ) {
			  System.out.println(u.getText());
			  }
		

	}

}
