package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassVtiger {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("http://localhost:8888/");
    driver.findElement(By.name("user_name")).sendKeys("admin");
    driver.findElement(By.name("user_password")).sendKeys("password");
    driver.findElement(By.id("submitButton")).click();
    WebElement ele = driver.findElement(By.cssSelector("[src*='themes/softed/images/u']"));
    Actions act=new Actions(driver);
    act.moveToElement(ele).perform();
    //normal
    driver.findElement(By.linkText("Sign Out")).click();
    //using mouse
    WebElement signout1 = driver.findElement(By.linkText("Sign Out"));
    act.click(signout1).perform();
    
	}

}
