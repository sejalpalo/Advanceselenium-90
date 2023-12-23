package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practicetestautomation.com/practice-test-login/");
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
    driver.findElement(By.xpath("//button[@id='submit']")).click();
    //xpath by visible text
    driver.findElement(By.xpath("//button[text()='Submit']")).click();
    driver.findElement(By.xpath("//button[.='Submit']")).click();
    //xpath by contains attribute value
    driver.findElement(By.xpath("//button[contains(@id,'s')]")).click();
    //xpath by contains visible text
    driver.findElement(By.xpath("//button[contains(text(),'S')]")).click();
	}

}
