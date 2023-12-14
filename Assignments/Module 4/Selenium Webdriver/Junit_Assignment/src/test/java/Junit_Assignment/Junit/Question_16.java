package Junit_Assignment.Junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Util.DriverConnection;

public class Question_16 {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		String url  = "https://mail.google.com/"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		}
		@Test
		public void login() throws InterruptedException {
					
			WebElement email = driver.findElement(By.name("identifier"));
			email.sendKeys("mr.cool183009@gmail.com");
			Thread.sleep(3000);
			
			WebElement nextbutton = driver.findElement(By.id("identifierNext"));
			nextbutton.click();
			Thread.sleep(6000);
			
			WebElement pass = driver.findElement(By.name("Passwd"));
			pass.sendKeys("12345");
			Thread.sleep(2000);
			
			WebElement nextpass = driver.findElement(By.id("passwordNext"));
			nextpass.click();
			Thread.sleep(6000);
		}
		
		@AfterTest
		public void afterTest()  {
			
			driver.close();
		
		}

}
