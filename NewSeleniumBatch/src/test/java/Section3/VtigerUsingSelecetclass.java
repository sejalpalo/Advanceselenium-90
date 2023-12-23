package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VtigerUsingSelecetclass {

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
    //banking dropdown link 
    WebElement ele = driver.findElement(By.name("industry"));
    Select se=new Select(ele);
   // se.selectByIndex(2);
    //select by value
    //se.selectByValue("Banking");
    //select by visibletext
    se.selectByVisibleText("Banking");
	}

}
