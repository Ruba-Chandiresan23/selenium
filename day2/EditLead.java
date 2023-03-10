package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id ("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("Ruba");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("ExpressSolution")) {
		System.out.println("Yes");
	}
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Ruba Enterprises");
	driver.findElement(By.name("submitButton")).click();
	driver.close();
	
	
	
	
	

	
	
    

	}

}
