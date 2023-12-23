package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationZoneusingXpath {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
    //multiple attribute
    WebElement ele = driver.findElement(By.xpath("//p[@name='a' and @id='a']"));
          String text = ele.getText();
           System.out.println(text);
    //xpath by index
    String text1 = driver.findElement(By.xpath("(//p[@name='a'])[1]")).getText();
    System.out.println(text1);
    //xpath using postion()
    String text2 = driver.findElement(By.xpath("(//p[@name='a'])[position()=1]")).getText();
    System.out.println(text2);
    
	}

}
