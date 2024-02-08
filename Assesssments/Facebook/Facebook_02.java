package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

public class Facebook_02 {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		
		WebElement FP = driver.findElement(By.partialLinkText("Forgotten password?"));
		FP.click();
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("identify_email"));
		email.sendKeys("prerakraval1809@gmail.com");
		
		WebElement st = driver.findElement(By.id("did_submit"));
		st.click();
		Thread.sleep(2000);
		
//		LOG IN WITH PASSWORD
		
//		WebElement lp = driver.findElement(By.partialLinkText("Log in with password"));
//		lp.click();
//		
//		WebElement pass1 = driver.findElement(By.name("pass"));
//		pass1.sendKeys("prerak@1671");
//		
//		WebElement login1 = driver.findElement(By.name("login"));
//		login1.click();
		
//      TRY ANOTHER WAY
		WebElement TRY = driver.findElement(By.partialLinkText("Try another way"));
		TRY.click();
		
		Thread.sleep(2000);
		
//		WebElement radio1 = driver.findElement(By.name("recover_method"));
//		radio1.click();
		
//		WebElement radio2 = driver.findElement(By.id("send_email"));
//		radio2.click();
		
		WebElement radio3 = driver.findElement(By.id("send_push_to_session_login"));
		radio3.click();
		
//		WebElement radio4 = driver.findElement(By.id("password_login"));
//		radio4.click();
//		
		Thread.sleep(3000);
		
		WebElement conti = driver.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button"));
		conti.click();
		
	}
}
