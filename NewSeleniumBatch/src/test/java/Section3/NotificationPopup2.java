package Section3;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopup2 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://licindia.in/");
    driver.findElement(By.className("login1")).click();
    Alert alt = driver.switchTo().alert();
    alt.accept();
    //using id
    String parentId=driver.getWindowHandle();
    Set<String> allId=driver.getWindowHandles();
    for(String r:allId) {
    	if(!(parentId.equals(r))) {
    		driver.switchTo().window(r);
    		
    	}
    }
    
    //using iterator
    Iterator<String> ids = allId.iterator();
    while(ids.hasNext()) {
    	String id = ids.next();
    	if(!(parentId.equals(id))) {
    		driver.switchTo().window(id);
    }
    }
     
    driver.findElement(By.id("da_textfield-1157-inputEl")).sendKeys("sejalpalo");
	}

}


