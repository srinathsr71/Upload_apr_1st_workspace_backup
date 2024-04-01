package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datadriven {
	WebDriver driver;
	//String url1="https://demo.guru99.com/V4/";
	//String url2="https://omayo.blogspot.com/";
	String url3="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	ExtentHtmlReporter htmlreport;
	ExtentReports extentreport;
	ExtentTest te;
	ArrayList<String> ah,ah1; 
	  Set<String> tabs,tabs2;
@BeforeTest
public void bt() throws InterruptedException {
	htmlreport=new ExtentHtmlReporter("repo.html");
	extentreport=new ExtentReports();
	extentreport.attachReporter(htmlreport);
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.get(url3);
}
@Test
public void test1() throws IOException, InterruptedException {
	
	te=extentreport.createTest("My first test");
	File fg=new File("C://Users//Admin//Documents//data.xlsx");
	FileInputStream fh=new FileInputStream(fg);
	XSSFWorkbook gh=new XSSFWorkbook(fh);
	XSSFSheet jf=gh.getSheet("Sheet1");
	int dg=jf.getLastRowNum();
	System.out.println(dg);
	for(int i=1;i<=dg;i++) {
		String nh=jf.getRow(i).getCell(0).getStringCellValue();
		te.info("the username is " +nh);
		String pa=jf.getRow(i).getCell(1).getStringCellValue();
		te.info("the pasword is " + pa);
		Thread.sleep(6000);
		driver.findElement(By.name("username")).sendKeys(nh);
		driver.findElement(By.name("password")).sendKeys(pa);
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		((JavascriptExecutor) driver).executeScript("window.open('https://demo.guru99.com/V4/')");
		//driver.get(url1);
	   tabs = new HashSet<String>();
	    
	    tabs = driver.getWindowHandles();
		ah=new ArrayList(tabs);
		int as=ah.size();
		driver.switchTo().window(ah.get(1));
		Thread.sleep(6000);
		for(int j=2;j<=dg;j++) {
			String kh=jf.getRow(j).getCell(0).getStringCellValue();
			te.info("the username is " +kh);
			String oa=jf.getRow(j).getCell(1).getStringCellValue();
			te.info("the pasword is " + oa);
			Thread.sleep(6000);
			driver.findElement(By.name("uid")).sendKeys(kh);
			te.info("the username is entered " +kh);
			driver.findElement(By.name("password")).sendKeys(oa);
			te.info("the Password is entered " +oa);
			driver.findElement(By.name("btnLogin")).click();
			te.info("the login button is clicked");
			Thread.sleep(6000);
			break;
		}
		break;
	}
	
	
	Thread.sleep(6000);
	//driver.switchTo().window(ah.get(2));
	((JavascriptExecutor) driver).executeScript("window.open('https://omayo.blogspot.com/')");
	//driver.get(url2);
	   tabs2 = new HashSet<String>();
	    
	    tabs2 = driver.getWindowHandles();
		ah1=new ArrayList(tabs2);
		int asr=ah1.size();
		System.out.println(asr);
	driver.switchTo().window(ah1.get(2));
	WebElement er=driver.findElement(By.xpath("//*[@id='drop1']"));
	er.click();
	Select t=new Select(er);
	t.selectByValue("jkl");
	driver.findElement(By.linkText("Selenium143")).click();
	te.info("link1 is clicked");
	driver.navigate().back();
	Thread.sleep(6000);
	driver.findElement(By.partialLinkText("Selen")).click();
	te.info("link2 is clicked");
	driver.navigate().back();
	Thread.sleep(6000);
}
	
	
@Test
public void test2() {
	
	driver.quit();
}
	
	
}



