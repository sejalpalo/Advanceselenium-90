package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPostion {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.youtube.com/");
    driver.manage().window().maximize();
    String title=driver.getTitle();
    System.out.println(title);
    String url=driver.getCurrentUrl();
    System.out.println(url);
    //set size
    driver.manage().window().setSize(new Dimension(200,300));
    //get  size
    Dimension d=driver.manage().window().getSize();
    System.out.println(d);
    //set position
    driver.manage().window().setPosition(new Point(500,300));
    //get position
    Point p=driver.manage().window().getPosition();
    System.out.println(p);
    //full screen
    driver.manage().window().fullscreen();
    driver.manage().window().minimize();
    driver.quit();
    
    
	}

}
