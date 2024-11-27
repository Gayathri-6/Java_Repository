package class36_dropdownValidation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Validation2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
//		Select state=new Select(driver.findElement(ById.id("state")));
//		List<WebElement> statelist=state.getOptions();
//		List<String> expectedlist=Arrays.asList("Bihar","Goa","Haryana");	
//		boolean allstatus=false;
//		for(WebElement a:statelist) {
//			boolean status=false;
//			String stat=a.getText();
//			System.out.println("states from the list--"+stat);
//			
//			for(String b:expectedlist) {
//			   if (b.equals(stat)) {
//				System.out.println("okk---"+b+" "+stat);
//				status=true;
//				break;
//			}
//		}
//if(!status) {
//	allstatus=false;
//}
//	}
//		if(allstatus) {
//			System.out.println("done");
//		}
//		else
//		{
//			System.out.println("not done");
//		}

}
}