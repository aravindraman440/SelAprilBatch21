package week2.day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Email {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
	driver.findElementById("password").sendKeys("leaf@12");
	driver.findElementByXPath("//button[@class='btn btn-primary']").click();
	//get tittle page
	String title = driver.getTitle();
	System.out.println(title);
	//click logout
	driver.findElementByLinkText("Log Out").click();
}
}
