package Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Util.DriverConnection;

public class Facebook_03 {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);

	WebElement account = driver.findElement(By.partialLinkText("Create new account"));
	account.click();
	Thread.sleep(2000);
	
	WebElement fn = driver.findElement(By.name("firstname"));
	fn.sendKeys("prerak");
	
	WebElement ln = driver.findElement(By.name("lastname"));
	ln.sendKeys("raval");
	
	WebElement email = driver.findElement(By.name("reg_email__"));
	email.sendKeys("mr.cool183009@gmail.com");
	
	Thread.sleep(2000);
	
	WebElement email1 = driver.findElement(By.name("reg_email_confirmation__"));
	email1.sendKeys("mr.cool183009@gmail.com");
	
	WebElement pass = driver.findElement(By.id("password_step_input"));
	pass.sendKeys("1809@3009");
	
	// dropdown 
	
	WebElement day = driver.findElement(By.id("day"));
	Select dropdown = new Select(day);
	dropdown.selectByIndex(29);
	
	WebElement month = driver.findElement(By.id("month"));
	Select dropdown1 = new Select(month);
	dropdown1.selectByIndex(8);
	
	WebElement year = driver.findElement(By.id("year"));
	Select dropdown2 = new Select(year);
	dropdown2.selectByValue("2001");

	// radiobutton
	
	List<WebElement> list = driver.findElements(By.name("sex"));
	System.out.println(list.size());
	list.get(1).click();
	
	WebElement submit = driver.findElement(By.name("websubmit"));
	submit.click();
	
	}
}
