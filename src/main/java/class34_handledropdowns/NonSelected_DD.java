package class34_handledropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NonSelected_DD {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.id("//button[@id='menu1']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Tutorials']")).click();

		List<WebElement> alloptions=driver.findElements(By.xpath("//li[@role='presentation']"));
		System.out.println("sss---");
		
		for(WebElement e:alloptions) 
		{
			String name=e.getText();
			System.out.println("sss---"+name);
			if(name.contains("JavaScript")) {
				e.click();
				break;
			}
		}
		
	}

}
