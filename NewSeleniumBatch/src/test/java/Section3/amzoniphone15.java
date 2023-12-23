package Section3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzoniphone15 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.amazon.in/s?k=iphone+15&crid=1EWWPS2FW7HGE&sprefix=%2Caps%2C258&ref=nb_sb_ss_recent_1_0_recent");
    
   String ele = driver.findElement(By.xpath("//u[.='+4 colors/patterns']/ancestor::span[@class='a-declarative']//span[.='Apple iPhone 15 (128 GB) - Blue']")).getText();
    System.out.println(ele);
	}

}
