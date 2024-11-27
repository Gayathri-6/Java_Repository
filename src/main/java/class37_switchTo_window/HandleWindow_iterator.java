package class37_switchTo_window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow_iterator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("parentwindow--"+parentwindow);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@id='login_container']//a[contains(@href,'youtube')]")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		Iterator<String> itr=allwindows.iterator();
		
		while(itr.hasNext()) {
			String handle=itr.next();
			{
				driver.switchTo().window(handle);
			
			if (driver.getTitle().contains("YouTube")) {
				
				System.out.println("child window found-youtube");
				driver.close();
			}
			
			driver.switchTo().window(parentwindow);
			
			Thread.sleep(5000);
				
			}	
				
				
			}
			
			
		}
	}


