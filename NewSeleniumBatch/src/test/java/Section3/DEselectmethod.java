package Section3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DEselectmethod {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("file:///C:/Users/Manoj%20Panda/Desktop/movies.html");
    WebElement ele = driver.findElement(By.id("movies"));
    Select se=new Select(ele);
    System.out.println(se.isMultiple());
    List<WebElement> AllSelected = se.getOptions();
    for(WebElement r:AllSelected) {
    	r.click();
    }
    se.deselectByIndex(2);
     //se.deselectByValue("kgf");//dobut
    se.deselectByVisibleText("kgf");
	}

}



