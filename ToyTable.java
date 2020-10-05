package Week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToyTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		
		  List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		 int rowsize = rows.size();
		 List<WebElement> colums = driver.findElementsByXPath("//table[@id='table_id']//tr/th");
		 int columnsize = colums.size();
		 System.out.println("The count size of columns"+columnsize);
		 
		 System.out.println("the count size of rows : "+rowsize);
		 List<Integer> lst = new ArrayList();
		 
		 int intRowNumber_VitalTask =0;
		 for (int i = 2; i <=rowsize; i++) {
				
			  //for (int j = 1; j <= columnsize; j++)
			 
				   WebElement element2 = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[2]");
				   
				   String text2 = element2.getText();
				   
				   System.out.print(text2+" ");
				   
				  String str_OnlyNum = text2.replaceAll("[^0-9]", "");
				  
				 int int_Percent =  Integer.parseInt(str_OnlyNum);
				 
				lst.add(int_Percent);
				
			
		}
		 
		 Collections.sort(lst);
		 
		 System.out.println("Smallest : "+lst.get(0));
		 
		 
		 driver.findElementByXPath("//td[text()='"+lst.get(0)+"%']/parent::tr//td[3]/input").click();
		 //to get the first best number 
		 driver.findElementByXPath("//td[text()='"+lst.get(lst.size()-1)+"%']/parent::tr//td[3]/input").click();
		 
		  
	}
}
