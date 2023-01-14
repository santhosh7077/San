package org.hcl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class AtoZ {

	public static void main(String[] args) throws IOException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement down = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].scrollIntoView(true)",down);
	TakesScreenshot screenshot= (TakesScreenshot) driver;
	File src = screenshot.getScreenshotAs(OutputType.FILE);
	File ds= new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\sk\\san.png");
	FileUtils.copyFile(src, ds);  
	
	
	
	}

}
