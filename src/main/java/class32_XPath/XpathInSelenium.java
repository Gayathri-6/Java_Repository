package class32_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathInSelenium {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.findElement(By.xpath("//*[@id=\"email1\"]")).sendKeys("Lakmalisvg@gmail.com");
		
		
////////relative xpath		
//		//*[@id="email1"]
		
////////absolute xpath		
//		/html/body/div/div/div[2]/div/div[2]/form/div/input[1]

	}

}
