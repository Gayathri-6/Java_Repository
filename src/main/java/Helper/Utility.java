package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.*;

public class Utility {
	

	public static WebElement waitforWebElemet(WebDriver driver, By locator) {

		WebElement element = null;

		for (int i = 0; i < 30; i++) {
			try {
				element = driver.findElement(locator);
				if (element.isDisplayed() && element.isEnabled() && element.getSize().height > 0
						&& element.getSize().width > 0) {

					// highLightElement(driver,element);
					break;

				}

				else {
					System.out.println("Waiting for WebElement");
				}
			} catch (Exception e) {

				System.out.println("Waiting for web element-Retrying");
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
		return element;
	}
	
	public static WebElement waitforWebElemet(WebDriver driver, By locator,int Timetowait ) {

		WebElement element = null;

		for (int i = 0; i < Timetowait; i++) {
			try {
				element = driver.findElement(locator);
				if (element.isDisplayed() && element.isEnabled() && element.getSize().height > 0
						&& element.getSize().width > 0) {
					// highLightElement(driver,element);
					break;
				}

				else {
					System.out.println("Waiting for WebElement");
				}
			} catch (Exception e) {
				System.out.println("Waiting for web element-Retrying");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		return element;
	}
	
	public static WebElement waitforWebElemet(WebDriver driver, By locator,int Timetowait,int Pollinginterval) {

		WebElement element = null;

		for (int i = 0; i < 30; i++) {
			try {
				element = driver.findElement(locator);
				if (element.isDisplayed() && element.isEnabled() && element.getSize().height > 0
						&& element.getSize().width > 0) {
					// highLightElement(driver,element);
					break;
				}
				else {
					System.out.println("Waiting for WebElement");
				}
			} catch (Exception e) {
				System.out.println("Waiting for web element-Retrying");
			}
			try {
				Thread.sleep(Pollinginterval);
			} catch (InterruptedException e) {

			}
		}
		return element;
	}
}


