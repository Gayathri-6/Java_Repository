package class39_switch_to_frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToFrame {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[text()='Account']")).click();
	driver.findElement(By.xpath("//span[text()='Login/ Sign Up']")).click();
	WebElement frameEle=driver.findElement(By.className("signin-module"));
	driver.switchTo().frame(frameEle);
	
	driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("909090");
	//driver.switchTo().defaultContent();
	}

}
