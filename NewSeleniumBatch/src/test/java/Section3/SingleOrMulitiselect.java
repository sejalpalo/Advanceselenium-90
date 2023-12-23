package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleOrMulitiselect {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("file:///C:/Users/Manoj%20Panda/Desktop/movies.html");
    //check the dropdown is multiselect or not
    WebElement ele = driver.findElement(By.id("movies"));
    Select se=new Select(ele);
    boolean text = se.isMultiple();
    System.out.println(text);
    
    
	}

}
