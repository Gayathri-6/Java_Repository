package class34_handledropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectClass {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Select state=new Select(driver.findElement(By.id("state")));
		//System.out.println("11  "+state);
		
	//	state.selectByIndex(2);
	//	state.selectByValue("Goa");
		
		//System.out.println("22   "+state.selectByIndex(2););
		String statenew=state.getFirstSelectedOption().getText();
		System.out.println("city-->"+statenew);
		List<WebElement> allstatval=state.getOptions();
		for(WebElement ele:allstatval) {
			
			System.out.println("cities--"+ele.getText());
			String city=ele.getText();
			
			if (city.equals("Bihar")) {
				state.selectByVisibleText("Bihar");
				
				System.out.println("city found");
				break;
			}
			
			
		}

	}

}
