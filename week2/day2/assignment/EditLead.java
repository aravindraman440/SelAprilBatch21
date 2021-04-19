package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	  //1	Launch the browser
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// 2	Enter the username
	 driver.findElementById("username").sendKeys("Demosalesmanager");
	// 3	Enter the password
	  driver.findElementById("password").sendKeys("crmsfa");
	// 4	Click Login
	 driver.findElementByClassName("decorativeSubmit").click();
	 // 5. Click on CRM/SFA Link
	 driver.findElementByLinkText("CRM/SFA").click();
	 
	// 6	Click Leads link
	 driver.findElementByLinkText("Leads").click();
	// 7	Click Find leads
	 driver.findElementByLinkText("Find Leads").click();
	// 8	Enter first name
	Thread.sleep(5000);
	 WebElement path = driver.findElementByXPath("(//input[@name='firstName'])[3]");
	 path.click();
	 path.sendKeys("Aravind");
	// 9	Click Find leads button
	 driver.findElementByLinkText("Find Leads").click();
	// 10 Click on first resulting lead

	 driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	// 11 Verify title of the page
	 String title = driver.getTitle();
	 System.out.println(title);
	// 12 Click Edit
	 driver.findElementByLinkText("Edit").click();
	// 13 Change the company name
	 Thread.sleep(5000);
	 WebElement name = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
	 name.clear();
	 name.sendKeys("TestLeaf");
	//14 Click Update
	 driver.findElementByClassName("smallSubmit").click();
	//15 Confirm the changed name appears
	 String text = driver.findElementByXPath("//span[text()='Company Name']/following::span").getText();
	 System.out.println(text);
	 if(text.contains("TestLeaf"))
		 System.out.println("text is matching "+text);
	 else
		 System.out.println("text not matcheed"+text);
	// 16 Close the browser (Do not log out)
driver.close();
}
}
