package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
	  driver.get("http://leaftaps.com/opentaps/control/login");
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //2. Enter UserName and Password Using Id Locator
	  driver.findElementById("username").sendKeys("Demosalesmanager");
	  driver.findElementById("password").sendKeys("crmsfa");
	 // 3. Click on Login Button using Class Locator
	 driver.findElementByClassName("decorativeSubmit").click();
	 // 4. Click on CRM/SFA Link
	 driver.findElementByLinkText("CRM/SFA").click();
	 // 5. Click on contacts Button
	 driver.findElementByLinkText("Contacts").click();
	 // 6. Click on Create Contact
	  driver.findElementByLinkText("Create Contact").click();
	 // 7. Enter FirstName Field Using id Locator
	 driver.findElementById("firstNameField").sendKeys("Aravind");
	 //8. Enter LastName Field Using id Locator
	 driver.findElementById("lastNameField").sendKeys("R");
	 // 9. Enter FirstName(Local) Field Using id Locator
	 driver.findElementById("createContactForm_firstNameLocal").sendKeys("AravindRaman");
	 //10. Enter LastName(Local) Field Using id Locator
	  driver.findElementById("createContactForm_lastNameLocal").sendKeys("Raman");
	 //11. Enter Department Field Using any Locator of Your Choice
	 driver.findElementById("createContactForm_departmentName").sendKeys("Computer");
	 //12. Enter Description Field Using any Locator of your choice 
	driver.findElementById("createContactForm_description").sendKeys("Quality Assurance Automation Engineer"); 
	 // 13. Enter your email in the E-mail address Field using the locator of your choice
	 driver.findElementById("createContactForm_primaryEmail").sendKeys("aravindraman440@gmail.com"); 
	 //14. Select State/Province as NewYork Using Visible Text
	driver.findElementById("createContactForm_generalStateProvinceGeoId");
	 WebElement selectEle = driver.findElementByXPath("//option[text()='New York']/.."); 
	 Select select =new Select(selectEle);
	 select.selectByVisibleText("New York");
	 // 15. Click on Create Contact
	 driver.findElementByClassName("smallSubmit").click();
	 // 16. Click on edit button 
	  driver.findElementByLinkText("Edit").click();
	 // 17. Clear the Description Field using .clear
	Thread.sleep(3000);
	  WebElement name = driver.findElementByXPath("(//textarea[@class='inputBox'])[1]");
	 name.clear();
	 name.sendKeys("Cleared");
	 //18. Fill ImportantNote Field with Any text
	  driver.findElementById("updateContactForm_importantNote").sendKeys(" the importtant note to check their automate the program");
	 // 19. Click on update button using Xpath locator
	  driver.findElementByXPath("//input[@value='Update']/..").click();
	 // 20. Get the Title of Resulting Page.
 String title = driver.getTitle();
 System.out.println("title:"+title);
 driver.close();
}
}
