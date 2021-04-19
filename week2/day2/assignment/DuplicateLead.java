package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
public static void main(String[] args) {
	
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
	
	
	//8	Click on Email
	 driver.findElementByLinkText("Email").click();
	//9	Enter Email
	 driver.findElementByClassName("emailAddress").sendKeys("aravindraman440@gmail.com");
	//10	Click find leads button
	
		 driver.findElementByLinkText("Find Leads").click();
		// 11 Click on first resulting lead

		 driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
			//12	Click First Resulting lead
		 String text = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		 System.out.println(text);
		 String replaceAll = text.replaceAll("[^A-z],[^a-z]", "");
		 System.out.println(replaceAll);
		
	//13	Click Duplicate Lead
		 driver.findElementByLinkText("Duplicate Lead").click();
	//14	Verify the title as 'Duplicate Lead'
		 String title = driver.getTitle();
		 System.out.println(title);
	//15	Click Create Lead
	driver.findElementByXPath("//input[@name='submitButton']").click();
	//16	Confirm the duplicated lead name is same as captured name
	 String text2 = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
	 System.out.println(text2);
	 String replaceAll2 = text.replaceAll("[^A-z],[^a-z]", "");
	 System.out.println(replaceAll2);
	 if(replaceAll.equals(replaceAll2))
		 System.out.println("text is same");
	 else
		 System.out.println("duplicateLead not same");
	//17	Close the browser (Do not log out)
	driver.close();
}
}
