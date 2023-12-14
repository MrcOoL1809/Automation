package Junit_Assignment.Junit;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

@RunWith(Parameterized.class)
public class Question_14 {
		
	String email;
	String password;
	
	public Question_14(String email,String password) {
		this.email=email;
		this.password=password;
		
	}
	
	static WebDriver driver;
	
	@BeforeClass
	// for opening every combination in single chrome driver
	public static void brforeClass() {
		String url  = "https://www.facebook.com"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
	}
//	@AfterClass
//	public static void afterClass() {
//		driver.close();
//	}
	
	@Test
	public void FBlogin() throws InterruptedException {
		
		
// For opening in new chrome driver with each new combination
		
//		WebDriver driver = new DriverConnnection().getDriver();
//		driver.get("https://www.facebook.com/");
		
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		Thread.sleep(1000);
		
		WebElement passwordEle = driver.findElement(By.id("pass"));
		passwordEle.clear();
		passwordEle.sendKeys(password);
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
	
	@Parameters
	public static List<Object[]> getData() throws InterruptedException {
		Object[][] obj = new Object[4][2];
		
		obj[0][0] = "eclipscorrect@gmail.com";
		obj[0][1] = "eclipscorrect@123";
		Thread.sleep(2000);
		
		obj[1][0] = "selenium123incorrect@gmail.com";
		obj[1][1] = "seleniumcorrect@456";
		Thread.sleep(2000);
		
		obj[2][0] = "hello123correct@gmail.com";
		obj[2][1] = "hello23incorrect@123";
		Thread.sleep(2000);
		
		obj[3][0] = "0909090900";
		obj[3][1] = "correctPassword";
		
		return Arrays.asList(obj);
		
		
	}
}

