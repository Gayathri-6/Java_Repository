package class30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		String title=driver.getTitle();
		System.out.println("title is-->"+title);
		
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		driver.quit();

	}

}
