package class43_FluentWaits;// Defines the package name for the class

import java.time.Duration; // Importing Duration class to specify timeouts for the wait

import org.openqa.selenium.By; // Importing By class to locate elements on the page
import org.openqa.selenium.NoSuchElementException; // Importing exception to handle cases where elements are not found
import org.openqa.selenium.WebDriver; // Importing WebDriver interface from Selenium
import org.openqa.selenium.WebElement; // Importing WebElement interface to represent HTML elements
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait; // Importing FluentWait to implement custom wait strategies
import org.openqa.selenium.support.ui.Wait; // Importing Wait interface for FluentWait

import com.google.common.base.Function; // Importing Function interface for FluentWait logic

//import helper.Utility; // Importing Utility class, assumed to be a custom helper class for browser setup

public class FluentWaitExample {

	public static void main(String[] args) {

		// Start the browser and navigate to the specified URL
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
				
		// Click the button to start the timer using XPath locator
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		// Create a FluentWait instance with a timeout of 10 seconds and a polling interval of 200 milliseconds
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10)) // Wait for a maximum of 10 seconds
			       .pollingEvery(Duration.ofMillis(200)) // Check for the condition every 200 milliseconds
			       .ignoring(NoSuchElementException.class); // Ignore NoSuchElementException during polling

		// Wait until the text 'WebDriver' is found within the target element
		wait.until(new Function<WebDriver, WebElement>() 
		{
		     // Apply function to check if the element's text contains 'WebDriver'
		     public WebElement apply(WebDriver driver) 
		     {
		    	 // Locate the paragraph element with ID 'demo'
		    	 WebElement element = driver.findElement(By.xpath("//p[@id='demo']"));
		    	 
		    	 // Get the current text of the element
		    	 String text = element.getText();
		        
		    	 // If the text contains 'WebDriver', print it and return the element
		    	 if (text.contains("WebDriver")) 
		    	 {
		    		 System.out.println("Found Text: " + text);
		    		 return element;
		    	 } 
		    	 else 
		    	 { 
		    		 // Otherwise, print the current text and continue waiting
		    		 System.out.println("Waiting for text - Current text value is: " + text);
		    		 return null; // Returning null allows FluentWait to continue waiting
		    	 }
		     }
		});
	}
}
