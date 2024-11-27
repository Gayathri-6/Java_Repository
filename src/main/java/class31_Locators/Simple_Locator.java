package class31_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Locator {

	public static void main(String[] args) {

     WebDriver driver=new ChromeDriver();
     driver.get("https://freelance-learn-automation.vercel.app/login");
     
     WebElement user=driver.findElement(By.id("email1"));
     user.sendKeys("Lakmalisvg@gmail.com");
     user.clear();
     user.sendKeys("Lakmalisvg@gmail.com");
     System.out.println(user.isDisplayed());
     System.out.println(user.isEnabled());
     System.out.println(user.isSelected());

	}

}
