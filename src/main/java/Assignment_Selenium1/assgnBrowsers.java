package Assignment_Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assgnBrowsers {

	public static void main(String[] args) {
		
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://www.selenium.dev/");
		String title1=driver1.getTitle();
		
		if (title1.equals("Selenium")){
			
			System.out.println("Title is Selenium");
						
		}
		//driver1.quit();
		
		WebDriver driver2= new FirefoxDriver();
		driver2.get("https://www.selenium.dev/");
		String title2=driver2.getTitle();
		
		if (title2.equals("Selenium")){
			
			System.out.println("Title is Selenium");
			
			}
		//driver2.quit();
		
		WebDriver driver3= new EdgeDriver();
		driver3.get("https://www.selenium.dev/");
		String title3=driver3.getTitle();
		
		if (title3.equals("Selenium")){
			
			System.out.println("Title is Selenium");
						
		}
		//driver3.quit();

	}

}
