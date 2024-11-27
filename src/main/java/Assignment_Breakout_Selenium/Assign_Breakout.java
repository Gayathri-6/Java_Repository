package Assignment_Breakout_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import com.github.javafaker.Faker;

public class Assign_Breakout {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[contains(text(),'New user? Signup')]")).click();
		String url=driver.getCurrentUrl().toString();
		System.out.println("url iss--->"+url);
		
		if(url.contains("signup")){
			
			System.out.println("Valid URL");
			
			Boolean button_stat=driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
			
			System.out.println("button--"+button_stat);
			
			if (button_stat==false) {
				
				System.out.println("Sign up button disable, you can continue");
				Faker faker=new Faker();
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(faker.name().fullName());
				String name=driver.findElement(By.xpath("//input[@placeholder='Name']")).getAttribute("value");
				driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(faker.internet().emailAddress());
				String email=driver.findElement(By.xpath("//input[@placeholder='Email']")).getAttribute("value");
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(faker.internet().password());
				String pswd=driver.findElement(By.xpath("//input[@placeholder='Password']")).getAttribute("value");
				
				System.out.println("name--"+name+" email--"+email+" pswd--"+pswd);
				
				
				driver.findElement(By.xpath("//label[text()='java']")).click();
				driver.findElement(By.xpath("//input[@value='Female']")).click();
				driver.findElement(By.xpath("//select[@id='state']")).sendKeys("Gujarat");
				Select se1=new Select(driver.findElement(By.xpath("//select[@id='hobbies']")));  
				se1.selectByVisibleText("Playing");
				se1.selectByVisibleText("Reading");
				
				Boolean signup_btn = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
				System.out.println("button_signup--"+signup_btn);
				if(signup_btn==true) {
					driver.findElement(By.xpath("//button[@type='submit']")).click();
					Thread.sleep(2000);
					System.out.println("name--"+name+"--email--"+email+"--pwd--"+pswd);
				
					driver.findElement(By.id("email1")).sendKeys(email);
					driver.findElement(By.id("password1")).sendKeys(pswd);
					driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
					
				}
				
				else {
					System.out.println("Sorry sign up button is disabled");
					
				}
				
			}else {
				
				System.out.println("Sign up button enable, you cannot continue");
			}
			
			
			
		}
		else {
			
			System.out.println("Invalid URL");
		}

	}

}
