package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("window.location=arguments[0]", "https://the-internet.herokuapp.com/upload");
	      driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Manoj Panda\\Documents\\Sejal_Palo_resume.docx");
	}

}
