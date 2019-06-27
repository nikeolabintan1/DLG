import java.util.concurrent.TimeUnit;

/*
 * BDD Scenario
 * Given I am on this URL "https://covercheck.vwfsinsuranceportal.co.uk/"
 * And I enter the Vehicle registration detail "OV12UYY"
 * When I click 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VolkswagenFinancialServices {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\david\\eclipse-workspace\\TestAuto\\libs2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("vehicleReg")).sendKeys("OV12UYY");
		driver.findElement(By.name("btnfind")).click();
		assertEquals("Result for", driver.findElement(By.className("result")).getText());
		assertEquals("Cover start:  09 FEB 2022 : 16 : 26", driver.findElement(By.className("resultDate")).getText());
		assertEquals("Cover end:   18 FEB 2022 : 23 : 59", driver.findElement(By.className("resultDate")).getText());
		//driver.close();
		}

	private static void assertEquals(String string, String text) {
		
	}
}
	