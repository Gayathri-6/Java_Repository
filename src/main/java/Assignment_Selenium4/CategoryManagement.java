package Assignment_Selenium4;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

public class CategoryManagement {
	static WebDriver driver;

	public static void main(String args[]) {
		ManageCategories();
	}

	public static void ManageCategories() {

		intializeDriver("Chrome");
		reachSignUpPage(driver);
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));

		if (list.size() >= 5) {
			System.out.println("Total element is available more than 5 " + list.size());
		} else {
			System.out.println("Total element is available less than 5 " + list.size());
		}

		driver.navigate().back();
		login(driver);
		String parentWindow = driver.getWindowHandle();

		// Add the course and verify the course added successfully in table
		clickManageCatogries(driver);
		switchToChildWindow(driver);

		driver.findElement(By.xpath("//button[text()='Add New Category ']")).click();
		Alert alt = driver.switchTo().alert();
		String courseName = "Playwright";
		alt.sendKeys(courseName);
		alt.accept();
		boolean status = driver.findElement(By.xpath("//tbody/tr/td[text()='" + courseName + "']")).isDisplayed();
		if (status) {
			System.out.println("Course got added successfully");
		} else {
			System.out.println("Couse could not add");
		}
		
		signOut(driver);
		driver.quit();
		
		// Verify new courses added successfully in signup page

		intializeDriver("Chrome");
		reachSignUpPage(driver);

		boolean isCourseAvaialble = driver.findElement(By.xpath("//label[text()='" + courseName + "']")).isDisplayed();

		if (isCourseAvaialble) {
			System.out.println("Course is available on signup page");
		} else {
			System.out.println("Couse is not available on signup page");
		}
		String parentWindow2 = driver.getWindowHandle();
		driver.navigate().back();

		// Delete the course and Verify new courses deleted successfully in signup page
	    login(driver);
		clickManageCatogries(driver);
		switchToChildWindow(driver);
		driver.findElement(By.xpath("//tbody/tr/td[text()='" + courseName + "']/following-sibling::td/child::button"))
				.click();
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		signOut(driver);
		driver.quit();
		
		// Verify the courses deleted successfully in signup page
		intializeDriver("Chrome");
		reachSignUpPage(driver);
		int count= driver.findElements(By.xpath("//label[text()='" + courseName + "']"))
				.size();
		if (count==0) {
			System.out.println("Course has been deleted on signup page");
		} else {
			System.out.println("Couse is  available on signup page");
		}
        driver.quit();
	}

	static void clickManageCatogries(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Manage']")));
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Manage']"))).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Manage Categories']")).click();
	}

	static void login(WebDriver driver) {
		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
	}

	static void switchToChildWindow(WebDriver driver) {
		Set<String> windowIDs = driver.getWindowHandles();
		List<String> numberOfWindows = new ArrayList<String>(windowIDs);
		driver.switchTo().window(numberOfWindows.get(1));

	}

	static void signOut(WebDriver driver) {
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
	}

	static void intializeDriver(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("EDGE")) {

			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("FIREFOX")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("Invalid browser");
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://freelance-learn-automation.vercel.app");
		driver.manage().window().maximize();
	}

	static void reachSignUpPage(WebDriver driver) {
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		driver.findElement(By.xpath("//button[text()='Log in']")).click();		
		driver.findElement(By.linkText("New user? Signup")).click();
	}
}