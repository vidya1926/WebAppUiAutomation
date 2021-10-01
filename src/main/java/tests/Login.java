package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login{
	
	

	@Test()
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:9001/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("tester@123");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.close();
		
	}
	
	
}
