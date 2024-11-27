package class38_swi_to_win_us_title;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtowin_title {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://freelance-learn-automation.vercel.app/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	String parentwindow=driver.getWindowHandle();
	List<WebElement> allsocialmedialinks=driver.findElements(By.xpath("//div[@class=\"social\"]//div[@class=\"social-btns\"]//a"));
	
    for(WebElement e:allsocialmedialinks) {
    	
    	e.click();
    	
    }
	Set<String> allwindows=driver.getWindowHandles();
	for(String b:allwindows) {
		driver.switchTo().window(b);
		String title=driver.getTitle();
		if(title.contains("LinkedIn")) {
			
			System.out.println("finally found--"+title);
			break;
		}
		else {
			
			System.out.println("still finding--"+title);
		}
	}
     driver.switchTo().window(parentwindow);
	}

}
