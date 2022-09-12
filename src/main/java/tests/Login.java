package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login{
	
	

	@Test()
	public void login() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("http://localhost:7104/");
		driver.findElement(By.xpath("//span[contains(text(),'use your account')]/following-sibling::input[@type='username']")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("//span[contains(text(),'use your account')]/following-sibling::input[@type='password']")).sendKeys("tester@123");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.close();
		
	}
	
	
}
