package class42_Waits;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_InSelenium {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		//pageload wait- page loading
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://freelance-learn-automation.vercel.app/login");
		System.out.println("pageload timeout--"+driver.manage().timeouts().getPageLoadTimeout().getSeconds());
		
		//script wait - running javascript
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(40000));
		System.out.println("script timeout--"+driver.manage().timeouts().getScriptTimeout().getSeconds());
		
		//implicit wait - web elements loading
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("implicit wait--"+driver.manage().timeouts().getImplicitWaitTimeout().getSeconds());
		
/*-------------Explicit wait(wait for specific condition)-------------------------------*/	
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean stat=wait.until(ExpectedConditions.titleContains("Learn"));
		System.out.println("title--"+stat);
		
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("alert-->"+alt);
		
  		boolean stat1=wait.until(ExpectedConditions.textToBe(By.xpath("//*[@placeholder=\"Enter Email\"]"), "Enter Email"));
		System.out.println("text--"+stat1);
		
		
		//find a frame and locate to frame///
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		
		//wait until it clicks//
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type=\"submit\"]")));
		
		//wait for until url contain the given name//
		wait.until(ExpectedConditions.urlContains(""));
		
		//wait for until element visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		
		//wait for until element invisible
		wait.until(ExpectedConditions.invisibilityOfElementLocated(null));
}
}
