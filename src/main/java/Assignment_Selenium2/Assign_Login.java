package Assignment_Selenium2;


import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_Login {

	public static void main(String[] args) {
		
////////////////////////////chrome browser////////////////////////////////////////////////
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver.quit();
				
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("Lakmalisvg@gmail.com");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver.quit();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("testuser@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver.quit();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin89@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("mukesh123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver.quit();
		
		
///////////////////////////Edge browser////////////////////////////////////////////////		
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://freelance-learn-automation.vercel.app/login");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver1.quit();
		
			
		driver1.get("https://freelance-learn-automation.vercel.app/login");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("Lakmalisvg@gmail.com");
		driver1.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver1.quit(); 

		driver1.get("https://freelance-learn-automation.vercel.app/login");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("testuser@123");
		driver1.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver1.quit();
				
		driver1.get("https://freelance-learn-automation.vercel.app/login");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin89@gmail.com");
		driver1.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("mukesh123");
		driver1.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver1.quit();
		
///////////////////////////Firefox browser////////////////////////////////////////////////			
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://freelance-learn-automation.vercel.app/login");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver2.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver2.quit();
				
		driver2.get("https://freelance-learn-automation.vercel.app/login");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver2.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("Lakmalisvg@gmail.com");
		driver2.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver2.quit();
		
		driver2.get("https://freelance-learn-automation.vercel.app/login");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver2.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("testuser@123");
		driver2.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver2.quit();
		
		driver2.get("https://freelance-learn-automation.vercel.app/login");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver2.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin89@gmail.com");
		driver2.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("mukesh123");
		driver2.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver2.quit();
		
		
	}

}
