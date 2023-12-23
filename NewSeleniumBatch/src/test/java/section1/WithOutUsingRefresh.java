package section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutUsingRefresh {

	public static void main(String[] args) throws Throwable {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.amazon.in/");
     Thread.sleep(4000);
     //without using refresh method
     driver.get(driver.getCurrentUrl());
     Thread.sleep(4000);
     driver.close();
	}

}
