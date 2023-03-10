package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id ("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limit");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Venkatesa");
	driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Test Leaf");
	driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("USD 4000000");
	WebElement cs = driver.findElement(By.name("industryEnumId"));
	Select cs1=new Select (cs);
	cs1.selectByValue("IND_SOFTWARE");
	WebElement own = driver.findElement(By.name("ownershipEnumId"));
	Select own1 = new Select(own);
	own1.selectByVisibleText("S-Corporation");
	WebElement sor = driver.findElement(By.id("dataSourceId"));
	Select sor1 = new Select (sor);
	sor1.selectByValue("LEAD_EMPLOYEE");
	WebElement mark = driver.findElement(By.id("marketingCampaignId"));
	Select mark1 = new Select (mark);
	mark1.selectByIndex(6);
	WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select state1 = new Select (state);
	state1.selectByValue("TX");
	driver.findElement(By.xpath("//input[@name='smallSubmit']")).click();
	
	
	
	
	
	

	}

}
