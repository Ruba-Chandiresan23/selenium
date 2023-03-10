package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
	ChromeDriver driver =  new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Ruba Rani");
	driver.findElement(By.name("lastname")).sendKeys("Chandiresan");
	driver.findElement(By.name("reg_email__")).sendKeys("rnvkruba@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("Kaushal@1");
	WebElement ear = driver.findElement(By.id("year"));
	Select ear1 = new Select (ear);
	ear1.selectByIndex(41);
	WebElement mon = driver.findElement(By.id("month"));
	Select mon1 = new Select (mon);
	mon1.selectByIndex(10);
	WebElement bd = driver.findElement(By.id("day"));
	Select bd1 = new Select (bd);
	bd1.selectByIndex(22);
	driver.findElement(By.linkText("Female")).click();
	driver.close();
	
	
	
	
	
	
	
	
	
	
	

	}

}
