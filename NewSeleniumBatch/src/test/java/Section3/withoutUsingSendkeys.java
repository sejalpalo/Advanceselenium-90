package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutUsingSendkeys {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.location=arguments[0]","https://practicetestautomation.com/practice-test-login/");
    js.executeScript("document.getElementById('username').value='student';");
    js.executeScript("document.getElementsByName('password')[0].value='Password123'");
    //submit
    WebElement ele = driver.findElement(By.cssSelector("[id='submit']"));
    js.executeScript("arguments[0].click()",ele);

}
}


