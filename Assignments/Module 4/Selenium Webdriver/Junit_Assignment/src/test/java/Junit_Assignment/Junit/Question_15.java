package Junit_Assignment.Junit;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.DriverConnection;

public class Question_15 {
	@Test
	public void loginFB() throws InterruptedException {
		
		String url  = "https://www.facebook.com"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		
	driver.findElement(By.id("email")).sendKeys("9090909090");
	
	driver.findElement(By.id("pass")).sendKeys("12345678");
	
    driver.findElement(By.name("login")).click();
		
	Thread.sleep(3000);
		
	}
}




