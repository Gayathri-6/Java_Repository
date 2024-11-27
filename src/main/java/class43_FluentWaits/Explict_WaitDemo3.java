package class43_FluentWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Utility;

public class Explict_WaitDemo3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		// Start the browser and navigate to the specified URL
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		// Click the button to enable the disabled input field using XPath locator
		driver.findElement(By.xpath("//input[@value='Show me']")).click();
			
		WebElement element=Utility.waitforWebElemet(driver, By.id("passnew"));
	
			
		// Send keys to the input field after it becomes clickable and enabled
		element.sendKeys("selenium");
		
	}

}
