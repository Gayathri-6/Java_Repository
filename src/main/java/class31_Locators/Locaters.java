package class31_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locaters {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email1")).sendKeys("Lakmalisvg@gmail.com");
		driver.findElement(By.name("password1")).sendKeys("Lakmali");
		///driver.findElement(By.tagName("button")).click();
		
		//driver.quit();

	}

}
