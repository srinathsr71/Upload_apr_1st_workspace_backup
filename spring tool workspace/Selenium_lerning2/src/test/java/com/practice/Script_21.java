package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_21 {
	WebDriver driver;
	String url="https://www.ironspider.ca/forms/checkradio.htm";

	
@BeforeTest
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
}

@Test
public void test1() {
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	List<WebElement> ki = driver.findElements(By.name("color"));
	int p = ki.size();
	System.out.println(p);
	System.out.println("My favourite colors are:");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	for (int i = 0; i < p; i++) {
		System.out.println(ki.get(i).getAttribute("value"));
	}
}
@Test
public void test2() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("browser")));
	List<WebElement> kie =driver.findElements(By.name("browser"));
	int po = kie.size();
	System.out.println(po);
	System.out.println("your current web browser is:");
	for (WebElement browser : kie) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    String text = (String) js.executeScript("return arguments[0].nextSibling.textContent.trim()", browser);
	    System.out.println(text);
	    //This line uses the executeScript method to run a JavaScript code snippet. 
	    //The code snippet accesses the next sibling of the provided radio button element 
	    //(arguments[0]) and retrieves its text content using textContent. 
	    //The trim() method is then applied to remove any leading or trailing whitespaces. 
	    //The result is cast to a String and returned.
	    //the purpose of this code is to loop through a list of radio buttons (kie), extract 
	    //the text content of the next sibling element using JavaScript, and print the extracted text.
	}
}	
}
	
	
	
	
	
	
	
	
	
	
	
	









