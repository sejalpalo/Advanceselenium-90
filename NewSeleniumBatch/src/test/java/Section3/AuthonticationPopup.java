package Section3;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthonticationPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
