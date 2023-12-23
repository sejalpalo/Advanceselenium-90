package Section3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VitigerAnotherExample {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("http://localhost:8888/");
    driver.findElement(By.name("user_name")).sendKeys("admin");
    driver.findElement(By.name("user_password")).sendKeys("password");
    driver.findElement(By.id("submitButton")).click();
    driver.findElement(By.linkText("Organizations")).click();
    driver.findElement(By.cssSelector("[title*='Cr']")).click();
    //using getoptions
     WebElement ele = driver.findElement(By.name("industry"));
     Select se=new Select(ele);
    List<WebElement> alloptions = se.getOptions();
    //to known the size
    int size=alloptions.size();
    System.out.println(size);
    for(WebElement r:alloptions) {
    	//print all the text
    	System.out.println(r.getText());
    	if(r.getText().equalsIgnoreCase("education")) {
    		r.click();
    	}
    }
    
    
    
    
	}

}
