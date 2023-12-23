package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class olympic2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		List<WebElement> ele = driver.findElements(By.xpath("(//span[@class='styles__CountryName-sc-fehzzg-6 jYXabZ'])[position()<6]"));
		List<WebElement> element = driver.findElements(By.xpath("(//div[@title='Gold'])[position()<6]"));
		List<WebElement> elements = driver.findElements(By.xpath("(//div[@title='Silver'])[position()<6]"));
		List<WebElement> element2 = driver.findElements(By.xpath("(//div[@title='Bronze'])[position()<6]"));
        for(int i=0;i<ele.size();i++) {
        	String country = ele.get(i).getText();
        	String gold=element.get(i).getText();
        	String sliver = elements.get(i).getText();
        	String bronze = element2.get(i).getText();
        	System.out.print(country);
        	System.out.print(" "+gold);
        	System.out.print(" "+sliver);
        	System.out.println(" "+bronze);
        	//another way
        	//System.out.println(ele.get(i).getText()+" "+element.get(i).getText()+" "+elements.get(i).getText()+" "+element2.get(i).getText());
        	
        }
		driver.close();
	}

		
	}


