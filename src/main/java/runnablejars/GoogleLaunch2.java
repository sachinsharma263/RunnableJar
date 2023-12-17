package runnablejars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLaunch2 {

	public static void main(String[] args) {

	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

		if (driver.getTitle().equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}

	}
}
