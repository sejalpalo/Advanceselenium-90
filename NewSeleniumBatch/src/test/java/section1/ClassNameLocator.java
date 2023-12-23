package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://practicetestautomation.com/practice-test-login/");
    driver.findElement(By.id("username")).sendKeys("student");
    WebElement ele = driver.findElement(By.name("password"));
    ele.sendKeys("Password123");
    WebElement element = driver.findElement(By.className("btn"));
    element.click();
	}

}
