package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricbuzz {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.cricbuzz.com/live-cricket-scorecard/75633/aus-vs-ban-43rd-match-icc-cricket-world-cup-2023");
    String PN=" Towhid Hridoy ";
    String text = driver.findElement(By.xpath("//a[.='"+PN+"']/ancestor::div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']")).getText();
    System.out.println(text);
    driver.close();
	}

}
