package Week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Avin");
		alert.accept();
		
		String text = driver.findElementById("demo").getText();
		System.out.println(text);
		if(text.contains("Avin"))
		{System.out.println("pass");}
		else
		{
			System.out.println("fail");
		}
			
			
		
			
		
	

		
		
	}

}
