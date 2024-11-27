package class37_switchTo_window;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");

		
		String parentwindow=driver.getWindowHandle();
		System.out.println("parentwindow--"+parentwindow);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@id='login_container']//a[contains(@href,'youtube')]")).click();
		
		Set<String> allwindows=driver.getWindowHandles();
		List<String> listofwindows=new ArrayList<String>(allwindows);
		
		String childwindow=listofwindows.get(1);
		
	/*	jumping to windows
	 * 
	 * driver.switchTo().window(listofwindows.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(listofwindows.get(0));
		Thread.sleep(2000);
		driver.switchTo().window(listofwindows.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(listofwindows.get(0));
		Thread.sleep(2000);
		*/
		System.out.println("hiii1  "+childwindow);
		driver.switchTo().window(childwindow);
		
		System.out.println("title  "+driver.getTitle());
		
		if(driver.getTitle().contains("YouTube")) {
			
			System.out.println("child window found-youtube");
			driver.close();
		}
		
		driver.switchTo().window(parentwindow);
		
		Thread.sleep(5000);
		

	}

}
