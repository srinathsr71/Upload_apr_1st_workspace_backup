package Assingnment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop {
	WebDriver driver;

		public static void main(String[] args) throws  InterruptedException {
			WebDriverManager.edgedriver().setup();
		    EdgeDriver driver = new EdgeDriver();
		    driver.get("https://jqueryui.com/selectmenu");
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
//		    vin.switchTo().frame(0).findElements(By.xpath("//*[@action='#']"));
//		  vin.findElement(By.xpath("//*[@id='speed-button']")).click();
//		  //"//span[@class='ui-selectmenu-text']"
//		Thread.sleep(5000);
//		WebElement arj = (WebElement) vin.findElements(By.xpath("//*[@id='speed']"));
//		Select select = new Select((WebElement) arj);
//		select.selectByIndex(4);
		    driver.switchTo().frame(0);
		    driver.findElement(By.id("speed-button")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.id("ui-id-4")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.cssSelector("#salutation-button > .ui-selectmenu-text")).click();
		    driver.findElement(By.id("ui-id-7")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.cssSelector("#number-button > .ui-selectmenu-text")).click();
		    Thread.sleep(6000);
		    driver.findElement(By.id("ui-id-16")).click();

}
}
		