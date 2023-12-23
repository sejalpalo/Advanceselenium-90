package Section3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleOrMulitiselect3 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("file:///C:/Users/Manoj%20Panda/Desktop/movies.html");
    WebElement ele = driver.findElement(By.id("movies"));
    Select se=new Select(ele);
    boolean element = se.isMultiple();
    System.out.println(element);
   List<WebElement> Allselect = se.getOptions();
   for(WebElement r:Allselect) {
    r.click();
	}
   //print the first selected option
    WebElement elements = se.getFirstSelectedOption();
    String first = elements.getText();
    System.out.println(first);
    
    //print all the selected options
    List<WebElement> Allselopt = se.getAllSelectedOptions();
    for(WebElement e:Allselopt) {
    	System.out.println(e.getText());
    	
    }
    
    //String first = se.getFirstSelectedOption().getText();
   // System.out.println(first);
    
    //second selected option
    for(int i=0;i<Allselopt.size();i++) {
    	if(i==1) {
    		System.out.println(Allselopt.get(i).getText());
    	}
    	
    }
   
   

}
}


