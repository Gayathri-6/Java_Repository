package class31_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locaters2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.findElement(By.partialLinkText("New user?")).click();
	//	driver.findElement(By.linkText("New user? Signup")).click();
		driver.findElement(By.tagName("input")).sendKeys("Gayathri");
		driver.findElements(By.tagName("input")).get(1).sendKeys("Lakmalisvg@gmail.com");
		driver.findElements(By.tagName("input")).get(2).sendKeys("Lakmali");
		driver.findElements(By.tagName("input")).get(3).click();
		driver.findElements(By.tagName("input")).get(13).click();
        

		//driver.quit();

	}

}
