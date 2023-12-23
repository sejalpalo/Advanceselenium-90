package Section3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriusingRobotClass {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //access
    driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQiAmNeqBhD4ARIsADsYfTdXNyZugFt-ImWtBaMLCnUTtOiR7zTuOmlUzU38lx4uN9XDN_iiyjkaAuvFEALw_wcB&gclsrc=aw.ds");
    
    driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
    
    //select
    StringSelection ss=new StringSelection("\"C:\\Users\\Manoj Panda\\Desktop\\sejalpalo_Resume.doc\"");
    
    //copy
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
    
    Robot r=new Robot();
    r.delay(2000);
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_V);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
	}

}
