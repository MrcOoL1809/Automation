package Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Util.DriverConnection;

public class Demo_Form {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/automation-practice-form"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
	    WebElement fn = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
	    fn.sendKeys("DEMO");
	    
	    WebElement sn = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
	    sn.sendKeys("TEST");
	    
	    WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
	    email.sendKeys("demo@gmail.com");
	    
	    Thread.sleep(2000);
	    
	    WebElement radio = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
	    radio.click();
	    
	    driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9898765678");	
    	Thread.sleep(2000);
	    
    	WebElement cal = driver.findElement(By.id("dateOfBirthInput"));
		cal.click();
		WebElement month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		month.click();
		Select month1 = new Select((WebElement) month);
		month1.selectByIndex(8);
	    Thread.sleep(1000);
	    
		WebElement year = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		year.click();
		Select year1 = new Select((WebElement) year);
		year1.selectByValue("2001");
		
		WebElement date = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[6]/div[1]"));
		date.click();
		
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
		sub.click();
		Thread.sleep(1000);
	    sub.sendKeys("MATHS");
	    sub.click();
	    Actions action = new Actions(driver);
	    
        Thread.sleep(2000);
		
		action.click(sub)
		      .keyDown(Keys.SHIFT)
		      .sendKeys(Keys.ARROW_DOWN)
			  .sendKeys(Keys.ENTER)
			  .build()
			  .perform();
		Thread.sleep(2000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("//label[text()='Music']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Ahmedabad");
		
		WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
		state.click();
	    Actions action1 = new Actions(driver);
	    
        Thread.sleep(2000);
		
		action1.click(state)
		      .sendKeys(Keys.ARROW_DOWN)
		      .sendKeys(Keys.ARROW_DOWN)
			  .sendKeys(Keys.ENTER)
			  .build()
			  .perform();
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]"));
		city.click();
	    Actions action2 = new Actions(driver);
	  
        Thread.sleep(2000);
		
		action2.click(city)
		      .sendKeys(Keys.ARROW_DOWN)
		      .sendKeys(Keys.ARROW_DOWN)
			  .sendKeys(Keys.ENTER)
			  .build()
			  .perform();
		
		 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	            FileUtils.copyFile(screenshot, new File("c:\\\\ScreenShot\\\\ss\\\\form.png"));
	        } catch (IOException e) {
	        }
		
	}
}
