package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Util.DriverConnection;

public class CareerCenter_001 {
		/**
		 * @param args
		 * @throws InterruptedException
		 */
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
			
//		WebElement RF = driver.findElement(By.xpath("//*[@id=\"homeCarousel\"]/div/div/div/div/a"));
//		RF.click();
//			Thread.sleep(1000);
//			WebElement FirstName = driver.findElement(By.name("first_name"));
//			FirstName.clear();
//			Thread.sleep(1000);
//			FirstName.sendKeys("Aditi");
//		
//			WebElement LastName = driver.findElement(By.name("last_name"));
//			LastName.clear();
//			Thread.sleep(1000);
//			LastName.sendKeys("Suthar");
//			
//			WebElement number = driver.findElement(By.id("referMobile"));
//			number.sendKeys("9265058360");
//			
//			WebElement clname = driver.findElement(By.id("referCollegeName"));
//			clname.sendKeys("SARDAR PATEL UNIVERSITY");
//			
//			WebElement education = driver.findElement(By.id("referEducation"));
//			Select dropdown = new Select(education);
//			dropdown.selectByIndex(3);
//			
//			WebElement submit = driver.findElement(By.id("referFriendSubmit"));
//			submit.click();
//			Thread.sleep(2000);
			
			WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[2]"));
			dropdown1.click();
			Thread.sleep(1000);
			
			//Personal Details
			WebElement PD = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[1]/a"));
			PD.click();
			Thread.sleep(2000);
			
//			WebElement salution = driver.findElement(By.id("select2-salutation-container"));
//			salution.click();
//			Thread.sleep(2000);
//			
//			WebElement salution1 = driver.findElement(By.id("select2-salutation-container"));
//			salution1.click();
//			
//			WebElement fn = driver.findElement(By.id("firstName"));
//			fn.clear();
//			Thread.sleep(2000);
//			fn.sendKeys("test");
//			
//			WebElement ln = driver.findElement(By.id("lastName"));
//			ln.clear();
//			Thread.sleep(1000);
//			ln.sendKeys("demo");
//			
//			WebElement e1 = driver.findElement(By.id("email"));
//			e1.clear();
//			Thread.sleep(1000);
//			e1.sendKeys("test@gmail.com");
			
		/*	WebElement p1 = driver.findElement(By.id("mobile"));
			p1.clear();
			Thread.sleep(1000);
			p1.sendKeys("9090909090");
			
			WebElement p2 = driver.findElement(By.id("phone"));
			p2.clear();
			Thread.sleep(1000);
			p2.sendKeys("0003456789"); */
			
//			WebElement ld = driver.findElement(By.id("linkedin_id"));
//			ld.clear();
//			Thread.sleep(1000);
//			ld.sendKeys("demoweb.com");
//			
//			WebElement ig = driver.findElement(By.id("instagram_id"));
//			ig.clear();
//			Thread.sleep(1000);
//			ig.sendKeys("instagram.com");
			
			//scroll
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
			
			Thread.sleep(2000);
			//gender drop down
//			WebElement gender = driver.findElement(By.id("select2-gender-results"));
//			gender.click();
//			Thread.sleep(1000);
			
			
	/*		WebElement gender = driver.findElement(By.id("select2-gender-result-6ggx-Male"));
			gender.click();
			Thread.sleep(2000);
			
			WebElement gender1 = driver.findElement(By.id("select2-gender-result-6ggx-Male"));
			gender1.click(); */
			
		/*	WebElement status = driver.findElement(By.xpath("//*[@id=\"select2-maritalStatus-container\"]"));
			status.click();
			Thread.sleep(1000);
			status.clear();
			Thread.sleep(2000);
			status.findElement(By.xpath("//*[@id=\"select2-maritalStatus-container\"]"));
			status.click();
			*/
			
			//calender
			
			/* WebElement bd = driver.findElement(By.name("birthdate"));
			bd.click();
			Thread.sleep(2000);
			bd.clear(); */
			
//			WebElement fn = driver.findElement(By.id("fatherName"));
//			fn.clear();
//			fn.sendKeys("demo");
//			
//			WebElement mn1 = driver.findElement(By.id("motherName"));
//			mn1.clear();
//			mn1.sendKeys("test");
//			
//			WebElement gu = driver.findElement(By.name("guardian_name"));
//			gu.clear();
//			Thread.sleep(1000);
//			gu.sendKeys("Demo");
			//dropdown 
		/*	WebElement relegion = driver.findElement(By.id("select2-religion-container"));
			relegion.click();
			
			Thread.sleep(1000);
			relegion.clear();
			
			Thread.sleep(1000);
			relegion.click(); */
			//dropdown
//			WebElement cg = driver.findElement(By.id("select2-category-container"));
//			cg.click();
//			
//			Thread.sleep(1000);
//			cg.clear();
//			
//			Thread.sleep(1000);
//			cg.findElement(By.id("select2-category-result-4tv4-OBC"));
//			cg.click();
			
			JavascriptExecutor js1= (JavascriptExecutor)driver;
			js1.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
			//dropdown
//			WebElement dl = driver.findElement(By.id("select2-disability-container"));
//			dl.click();
//			
//			Thread.sleep(1000);
//			dl.clear();
//			
//			Thread.sleep(1000);
//			dl.findElement(By.id("18"));
//			dl.click();
//			dropdown
//			WebElement ic = driver.findElement(By.id("select2-idType-container"));
//			ic.click();
//			
//			Thread.sleep(1000);
//			ic.clear();
//			
//			Thread.sleep(1000);
//			ic.findElement(By.id("select2-idType-result-37fj-Voter ID Card"));
//			ic.click();
			
		/*	WebElement id = driver.findElement(By.name("id_no"));
			id.clear();
			Thread.sleep(1000);
			id.sendKeys("3679 8778 7230"); */
//			 dropdown
//			WebElement el = driver.findElement(By.id("select2-educationLevel-container"));
//			el.click();
//			
//			Thread.sleep(1000);
//			el.clear();
//			
//			Thread.sleep(1000);
//			el.findElement(By.id("select2-educationLevel-result-5cdh-Graduate"));
//			el.click();
			
//			WebElement address = driver.findElement(By.id("address"));
//			address.clear();
//			address.sendKeys("Maninagar, Ahmedabad");
//			
//			WebElement pincode = driver.findElement(By.id("pincode"));
//			pincode.clear();
//			pincode.sendKeys("387340");
			
//			WebElement country = driver.findElement(By.id("select2-country-container"));
//			country.click();
			
//			Thread.sleep(1000);
//			country.clear();
//			
//			Thread.sleep(1000);
//			country.findElement(By.id("29"));
//			country.click();
//		
			JavascriptExecutor js2= (JavascriptExecutor)driver;
			js2.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);		
			
//			WebElement state = driver.findElement(By.id("select2-state-container"));
//			state.click();
//			
//			Thread.sleep(1000);
//			state.clear();
//			
//			Thread.sleep(1000);
//			state.findElement(By.id(""));
//			state.click();
//			
//			WebElement district = driver.findElement(By.id("select2-district-container"));
//			district.click();
//			
//			Thread.sleep(1000);
//			district.clear();
//			
//			Thread.sleep(1000);
//			district.findElement(By.id(""));
//			district.click();
			
//			WebElement city  = driver.findElement(By.id("select2-city-container"));
//			city .click();
//			
//			Thread.sleep(1000);
//			city .clear();
//			
//			Thread.sleep(1000);
//			city .findElement(By.id(""));
//			city .click();
			
	//		WebElement training status  = driver.findElement(By.id("select2-trainingStatus-container"));
//			training status .click();
//			
//			Thread.sleep(1000);
//			training status .clear();
//			
//			Thread.sleep(1000);
//			training status .findElement(By.id(""));
//			training status .click();
			
			WebElement adfrontp = driver.findElement(By.id("aadharFront"));
			adfrontp.sendKeys("");

			WebElement adbackp = driver.findElement(By.id("aadharFront"));
			adbackp.sendKeys("");
		
			
			
			}

}
