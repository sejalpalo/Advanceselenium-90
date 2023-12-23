package Section3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class hightlight {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.location=arguments[0]","https://practicetestautomation.com/practice-test-login/");
    WebElement ele = driver.findElement(By.name("username"));
    //highlight username textfield
    js.executeScript("arguments[0].style.border='3px solid blue'", ele);
    //screenshot
    TakesScreenshot ts = (TakesScreenshot)driver;
     File source = ts.getScreenshotAs(OutputType.FILE);
     File dest=new File("./screenshot/"+"highlight"+".png");
     Files.copy(source, dest);
	}
                                                                                      
}
