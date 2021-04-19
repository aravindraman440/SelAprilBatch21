package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
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
	
		//8	Click on Phone
	 driver.findElementByLinkText("Phone").click();
		//9	Enter phone number
	 driver.findElementByName("phoneNumber").sendKeys("9");
		//10	Click find leads button
	 driver.findElementByLinkText("Find Leads").click();
		//11	Capture lead ID of First Resulting lead
	 driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		//12	Click First Resulting lead
	 String text = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
	 System.out.println(text);
	 String replaceAll = text.replaceAll("[^0-9]", "");
	 System.out.println(replaceAll);
		//13	Click Delete
	 driver.findElementByLinkText("Delete").click();
		//14	Click Find leads
	 driver.findElementByLinkText("Find Leads").click();
		//15	Enter captured lead ID
	 driver.findElementByXPath("//input[@name='id']").sendKeys(replaceAll);
		//16	Click find leads button
	 driver.findElementByLinkText("Find Leads").click();
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	 String text2 = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
		//18	Close the browser (Do not log out)
 driver.close();
	}
}


