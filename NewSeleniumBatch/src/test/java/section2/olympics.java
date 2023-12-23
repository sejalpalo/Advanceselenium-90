package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class olympics {

	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
    List<WebElement> ele = driver.findElements(By.xpath("//span[@class='styles__CountryName-sc-fehzzg-6 jYXabZ']"));
	List<WebElement> element = driver.findElements(By.xpath("//div[@title='Gold']"));
	List<WebElement> elements = driver.findElements(By.xpath("//div[@title='Silver']"));
	List<WebElement> element2 = driver.findElements(By.xpath("//div[@title='Bronze']"));
	for(int i=0;i<ele.size();i++) {
    	String country = ele.get(i).getText();
    	String gold=element.get(i).getText();
    	String sliver = elements.get(i).getText();
    	String bronze = element2.get(i).getText();
    	System.out.print(country);
    	System.out.print(" "+gold);
    	System.out.print(" "+sliver);
    	System.out.println(" "+bronze);
	}

}
}
