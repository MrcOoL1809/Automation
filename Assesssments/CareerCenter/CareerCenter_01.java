package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Util.DriverConnection;

public class CareerCenter_01 {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://careercenter.tops-int.com/"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		
		WebElement mn = driver.findElement(By.id("mobile"));
		mn.sendKeys("9016481722");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("prerak1809");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		login.click();
		
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[2]"));
		dropdown1.click();
		Thread.sleep(1000);
		
		//Eduction Details
//		WebElement PD = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[2]/a"));
//		PD.click();
//		Thread.sleep(2000);
//		
//		WebElement Add = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[3]/a"));
//		Add.click();
		
//		WebElement Degree = driver.findElement(By.id("degree"));
//		Select Degree1 = new Select(Degree);
//		Degree1.selectByIndex(5);
//		
//		WebElement clgname = driver.findElement(By.name("college_name"));
//		clgname.click();
//		clgname.sendKeys("Mangalyatan University");
//		
//		Thread.sleep(2000);
//		
//		WebElement yop = driver.findElement(By.id("passingYear"));
//		yop.click();
//		Thread.sleep(1000);
//		Select yop1 = new Select(yop);
//		yop1.selectByIndex(1);
//		
//		WebElement grades = driver.findElement(By.name("result"));
//		grades.sendKeys("98");
//		
//		WebElement add1 = driver.findElement(By.xpath("//*[@id=\"mobileAddBtnSection-courseEdu\"]/div/input"));
//		add1.click();		
//		
//		WebElement dlt = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/a[2]/i"));
//		dlt.click();
		
		// Change Password
//		WebElement CP = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[3]/a"));
//		CP.click();
//		Thread.sleep(2000);
//		
//		WebElement currentpass = driver.findElement(By.name("current_password"));
//		currentpass.sendKeys("9016481722");
//		Thread.sleep(1000);
//		
//		WebElement newpass = driver.findElement(By.id("new_password"));
//		newpass.sendKeys("0000000000");
//		Thread.sleep(1000);
//		
//		WebElement confirmpass = driver.findElement(By.id("confirm_password"));
//		confirmpass.sendKeys("0000000000");
//		Thread.sleep(1000);
//		
//		WebElement submit = driver.findElement(By.id("changePasswordSubmit"));
//		submit.click();
		
//		WebElement logout = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[4]/a"));
//		logout.click();
//		Thread.sleep(2000);
//		
		
	}

}
