package Assignment_Selenium4;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign_E2EScenario {
	static WebDriver driver;
	static Actions actions;

	public static void main(String[] args) throws InterruptedException {
		String uname = "admin@email.com";
		String psw = "admin@123";
		String course_name = "Selenium With Python";
		String course_desc = "Selenium With Python";
		String course_instrct = "Mukesh Otwani";
		String course_fee = "2000";
		String course_categry = "Selenium";
		String path = "C:\\test.png";

		callBrowser("Chrome");
		Login(uname, psw);

		actions = new Actions(driver);
		WebElement hoverElement = driver.findElement(By.xpath("//div[span='Manage']"));
		actions.moveToElement(hoverElement).perform();

		driver.findElement(By.xpath("//a[@href='/course/manage']")).click();
		driver.findElement(By.xpath("//button[contains(.,'Add New Course')]")).click();

		Thread.sleep(Duration.ofMillis(1000));
		enterData(path, course_name, course_desc, course_instrct, course_fee, course_categry);

		Thread.sleep(Duration.ofMillis(1000));
		searchDelete(course_name);
		singedout();
		driver.quit();

	}

	public static void callBrowser(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		}

		else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("Sorry.This browser is not support..");

		}

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
	}

	public static void Login(String uname, String psw) {
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys(psw);
		driver.findElement(By.xpath("//button[contains(.,'Sign in')]")).click();
	}

	public static void enterData(String path, String course_name, String course_desc, String course_instrct,
			String course_fee, String course_categry) {

		WebElement thumbnl = driver.findElement(By.xpath("//input[contains(@id,'thumbnail')]"));
		thumbnl.sendKeys(path);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(course_name);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(course_desc);
		driver.findElement(By.xpath("//input[@name='instructorName']")).sendKeys(course_instrct);
		driver.findElement(By.xpath("//input[@name='price']")).clear();
		driver.findElement(By.xpath("//input[@name='price']")).sendKeys(course_fee);

		// Select Start Date
		driver.findElement(By.xpath("//div//input[@name='startDate']")).click();
//	 	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
//	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-datepicker")));

		String cMonthYear = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__current-month')]"))
				.getText();
		String[] words = cMonthYear.split(" ");

		String month = words[0];
		String year = words[1];

		while (!(month.equals("May") && year.equals("2025"))) {

			driver.findElement(By.xpath("//div//div//button[.='Next Month']")).click();

			cMonthYear = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__current-month')]"))
					.getText();
			words = cMonthYear.split(" ");

			month = words[0];
			year = words[1];
			System.out.println("month---" + month + "---year---" + year);

		}

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[3]"))
				.click();
		// End of Select Start Date

		// Select End date
		driver.findElement(By.xpath("//div//input[@name='endDate']")).click();
		cMonthYear = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__current-month')]"))
				.getText();
		words = cMonthYear.split(" ");

		month = words[0];
		year = words[1];

		while (!(month.equals("August") && year.equals("2025"))) {

			driver.findElement(By.xpath("//div//div//button[.='Next Month']")).click();

			cMonthYear = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__current-month')]"))
					.getText();
			words = cMonthYear.split(" ");

			month = words[0];
			year = words[1];
			System.out.println("month---" + month + "---year---" + year);

		}

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[4]"))
				.click();

		// End of Select End date

		driver.findElement(By.className("menu-btn")).click();
		driver.findElement(By.xpath("//button[normalize-space()='" + course_categry + "'][1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100000));
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

	}

	public static void searchDelete(String course_name) {

		driver.findElement(By.xpath("//input[@placeholder='Search by course name, instructor name or category']"))
				.sendKeys(course_name);

		Boolean status = driver.findElement(By.xpath("//table/tbody/tr/td[2][text()='" + course_name + "']"))
				.isDisplayed();

		if (status) {

			driver.findElement(By.xpath("//table/tbody/tr/td[12]/button[text()='Delete']")).click();

		}

	}

	public static void singedout() {
		driver.findElement(By.xpath("//div//div//div//img[contains(@alt,'menu')]")).click();
		driver.findElement(By.xpath("//div//div//button[text()='Sign out']")).click();

	}

}
