package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Util.DriverConnection;

public class CareerCenter_SideMenu {
	public static void main (String[]args) throws InterruptedException {
	String url = "https://careercenter.tops-int.com/";
	WebDriver driver =  DriverConnection.getDriver();
	driver.get(url);
	
	WebElement mn = driver.findElement(By.id("mobile"));
	mn.sendKeys("9016481722");

	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("prerak1809");
	
	WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
	login.click();
	
	WebElement AS = driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span"));
	AS.click();
	Thread.sleep(1000);
	
	WebElement cd = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[1]/a"));
	cd.click();
	Thread.sleep(3000);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)");
	Thread.sleep(1000);

	WebElement lf = driver.findElement(By.xpath("//*[@id=\"course-course\"]/div/div[1]/div[1]/div/div[1]/div[2]/a[1]"));
	lf.click(); 
	
	Thread.sleep(2000);
	
	
	WebElement hb = driver.findElement(By.xpath("//*[@id=\"course-course\"]/div/div[1]/div[1]/div/div[1]/div[2]/a[2]"));
	hb.click();

	Thread.sleep(1000);
	
	WebElement project = driver.findElement(By.id("viewProject"));
	project.click();
	Thread.sleep(1000);
	WebElement project1 = driver.findElement(By.xpath("//*[@id=\"course-project\"]/div/div[1]/h4/a"));
	project1.click();
	
	Thread.sleep(4000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,400)");
	
	Thread.sleep(1000);
	
 	WebElement feedback = driver.findElement(By.xpath("//*[@id=\"course-course\"]/div/div[2]/div/div/div[2]/a"));
	feedback.click();
	Thread.sleep(3000);
	WebElement feedback1 = driver.findElement(By.xpath("//*[@id=\"moduleFeedbackForm\"]/div[1]/div[2]/div[4]/label/p"));
	feedback1.click();
	Thread.sleep(1000);
	WebElement feedback2 = driver.findElement(By.xpath("//*[@id=\"moduleFeedbackForm\"]/div[2]/div[2]/div[4]/label/p"));
	feedback2.click();
	Thread.sleep(1000);
	WebElement feedback3 = driver.findElement(By.xpath("//*[@id=\"moduleFeedbackForm\"]/div[3]/div[2]/div[3]/label/p"));
	feedback3.click();
	
	
	WebElement va = driver.findElement(By.id("viewAssignment"));
    va.click();
    Thread.sleep(2000);
    WebElement va1 = driver.findElement(By.xpath("//*[@id=\"course-assignment\"]/div/div[1]/h4/a"));
	va1.click();
	
	Thread.sleep(2000);
	
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("window.scrollBy(0,700)");
	
	Thread.sleep(2000);
	
	WebElement vA = driver.findElement(By.id("viewAssessment"));
    vA.click();
    Thread.sleep(2000);
    WebElement vA1 = driver.findElement(By.xpath("//*[@id=\"course-assessment\"]/div/div[1]/h4/a"));
	vA1.click();
	
    Thread.sleep(2000);
	
	JavascriptExecutor js3 = (JavascriptExecutor) driver;
	js3.executeScript("window.scrollBy(0,700)");
	
	Thread.sleep(2000);
	
	WebElement vq = driver.findElement(By.id("viewQuestions"));
    vq.click();
    Thread.sleep(2000);
    WebElement vq1 = driver.findElement(By.xpath("//*[@id=\"course-questions\"]/div/div[1]/h4/a"));
	vq1.click();
	
	JavascriptExecutor js4 = (JavascriptExecutor) driver;
	js4.executeScript("window.scrollBy(0,700)");
	
	Thread.sleep(2000);
	
	 WebElement social = driver.findElement(By.xpath("//*[@id=\"course-course\"]/div/div[4]/div/div[1]/div[3]/a[1]/small"));
	 social.click();
	 Thread.sleep(1000);
	 WebElement cancle = driver.findElement(By.xpath("//*[@id=\"shareCertificate\"]/div/div/div/div[1]/div[2]/button"));
	 cancle.click();
	 JavascriptExecutor js5 = (JavascriptExecutor) driver;
	 js5.executeScript("window.scrollBy(0,700)");
	 Thread.sleep(4000);
	 WebElement dc = driver.findElement(By.xpath("//*[@id=\"course-course\"]/div/div[4]/div/div[1]/div[3]/a[2]/small"));
	 dc.click();
	 Thread.sleep(2000);
	 
	 WebElement attendance = driver.findElement(By.id("course-attendance-tab"));
     attendance.click();
	 
     Thread.sleep(1000);
     
     WebElement acc = driver.findElement(By.id("course-accounts-tab"));
     acc.click();
     Thread.sleep(2000);
     
     JavascriptExecutor js6 = (JavascriptExecutor) driver;
   	 js6.executeScript("window.scrollBy(0,450)");
     
   	 Thread.sleep(2000);
   	 
     WebElement dn1 = driver.findElement(By.xpath("//*[@id=\"course-accounts\"]/div/div/div[3]/div[5]/span/a"));
     dn1.click();
     
     Thread.sleep(1000);
     
     WebElement dn2 = driver.findElement(By.xpath("//*[@id=\"course-accounts\"]/div/div/div[4]/div[5]/span/a"));
     dn2.click();
     
     Thread.sleep(1000);
     
     WebElement dn3 = driver.findElement(By.xpath("//*[@id=\"course-accounts\"]/div/div/div[5]/div[5]/span/a"));
     dn3.click();
     
   	 WebElement pr = driver.findElement(By.id("course-progress-report-tab"));
     pr.click();
   	
	WebElement projects = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[2]/a"));
	projects.click();
	Thread.sleep(2000);
	

	WebElement AS1 = driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span"));
	AS1.click();
	Thread.sleep(1000);
	
	WebElement assignment = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[3]/a"));
	assignment.click();
	Thread.sleep(2000);

	WebElement AS2 = driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span"));
	AS2.click();
	Thread.sleep(1000);
	
   //assesment
	
	WebElement assesment = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[4]/a"));
	assesment.click();
	Thread.sleep(2000);

	WebElement AS3 = driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span"));
	AS3.click();
	Thread.sleep(1000);
	
  // Interview Question
	
	WebElement IQ = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[5]/a"));
	IQ.click();
	Thread.sleep(2000);
	
	//Certificate
	
	WebElement cf = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[2]/a"));
	cf.click();
	Thread.sleep(2000);
	
	//Account
	WebElement ac = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[3]/a"));
	ac.click();
	Thread.sleep(2000);
	
	//Resume Builder
	WebElement rb = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[4]/a"));
	rb.click();
	Thread.sleep(2000);
	
	//job tracker
	WebElement jt = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[5]/a"));
	jt.click();
	Thread.sleep(2000);
	
	// upload review
	WebElement ur = driver.findElement(By.linkText("Upload Reviews"));
	ur.click();
	Thread.sleep(2000);
	
	//Reward
	WebElement rw = driver.findElement(By.linkText("Rewards"));
	rw.click();
	Thread.sleep(2000);
	
	//Refer a friend
	
	WebElement rf = driver.findElement(By.linkText("Refer a Friend"));
	rf.click();
	Thread.sleep(2000);
	
	//events
	Thread.sleep(1000);
	WebElement events = driver.findElement(By.linkText("Events"));
	events.click();
	Thread.sleep(2000);
	 
     
	
	}
}
