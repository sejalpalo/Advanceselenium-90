package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooksignup {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.facebook.com/signup");
    WebElement ele = driver.findElement(By.name("birthday_day"));
    Select se=new Select(ele);
    se.selectByIndex(1);
   // se.selectByValue("2");
    //se.selectByVisibleText("2");
    WebElement element = driver.findElement(By.name("birthday_month"));
    Select se1=new Select(element); 
    //se1.selectByValue("6");
   se1.selectByVisibleText("Jun");
   // se1.selectByIndex(5);
   WebElement element1 = driver.findElement(By.name("birthday_year"));
   Select se2=new Select(element1);
  // se2.selectByValue("1997");
   se2.selectByVisibleText("1997");
   
    
	}

}



