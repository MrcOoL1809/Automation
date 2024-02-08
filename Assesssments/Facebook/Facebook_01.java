package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

public class Facebook_01 {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mr.cool183009@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1809@3009");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
}
