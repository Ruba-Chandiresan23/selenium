package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='phone']")).click();
	driver.findElement(By.name("phoneNumber")).sendKeys("914312458525");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	Thread.sleep(2000);
	String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
	System.out.println(text);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.linkText("Delete")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.name("id")).sendKeys(text);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	Thread.sleep(2000);
    String text2 = driver.findElement(By.className("x-paging-info")).getText();
    if(text2.contains("null")) {
    	System.out.println("Record id deleted");
    }
    
			
			
			
			
			
			
			
	
	
	
	
	}

}
