import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datadriven {
	WebDriver driver;
	String url1="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String url2="https://practicetestautomation.com/practice-test-login/";
	String url3="https://the-internet.herokuapp.com/";
	@BeforeTest
	public void bt() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(url1);
		driver.manage().window().maximize();
	}
@Test
public void test() throws IOException, InterruptedException {
	File fs=new File("C://Users//Admin//Documents//demodata1.xlsx");
	FileInputStream fg=new FileInputStream(fs);
	XSSFWorkbook xd=new XSSFWorkbook(fg);
	XSSFSheet xs=xd.getSheet("Sheet1");
	int rc=xs.getLastRowNum();
	System.out.println(rc);
	for(int a=1;a<=rc;a++) {
		String username=xs.getRow(a).getCell(0).getStringCellValue();//Admin,student
		System.out.println(username);
		//test.info("the excel sheet first row and first cell value is"+ username);
		String password=xs.getRow(a).getCell(1).getStringCellValue();//admi123,Password123
		System.out.println(password);
		//test.info("the excel sheet first row and second cell value is"+ password);
		Thread.sleep(6000);
		driver.findElement(By.name("username")).sendKeys(username);
		//test.info("the username is entered");
		driver.findElement(By.name("password")).sendKeys(password);
		//test.info("the password is entered");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//test.info("the submit button is clicked");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		for(int b=2;b<=rc;b++) {
			driver.navigate().to(url2);
			String us=xs.getRow(b).getCell(0).getStringCellValue();
			//test.info("the excel sheet second row and third cell value is"+  us);
			String ps=xs.getRow(b).getCell(1).getStringCellValue();
			//test.info("the excel sheet second row and fourth cell value is"+ ps);
			driver.manage().window().maximize();
			Thread.sleep(6000);
			driver.findElement(By.id("username")).sendKeys(us);
			//test.info("the username is entered");
			driver.findElement(By.id("password")).sendKeys(ps);
			//test.info("the Password is entered");
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			//test.info("the login button is clicked");
			Thread.sleep(6000);
			break;
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		for(int c=3;c<=rc;c++) {
			driver.navigate().to(url3);
			//driver.manage().window().maximize();
			Thread.sleep(6000);
			String uss=xs.getRow(c).getCell(0).getStringCellValue();
			//test.info("the excel sheet third row and fivth cell value is"+ uss);
			String pase=xs.getRow(c).getCell(1).getStringCellValue();
			//test.info("the excel sheet third row and sixth cell value is"+ pase);
			System.out.println(uss);
			System.out.println(pase);
			driver.findElement(By.partialLinkText("Basic")).click();
			Thread.sleep(6000);
//			WebDriverWait et=new WebDriverWait(driver,30);
			//et.until(ExpectedConditions.p)
			Alert ar=driver.switchTo().alert();
			ar.sendKeys(uss);
			ar.sendKeys(pase);
			ar.accept();
			break;
		}
		break;
		
	}
	
	driver.close();
	//extent.flush();
	
	
}

}

