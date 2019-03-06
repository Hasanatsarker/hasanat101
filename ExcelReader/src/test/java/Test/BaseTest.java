package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Excel.excel;

public class BaseTest {

	static WebDriver dr;
	static excel x = new excel("/Users/hasanath/eclipse-workspace/ExcelReader/src/main/resources/excel/Workbook2.xlsx");

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "/Users/hasanath/Desktop/chromedriver");
		dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");

	}

	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(4000);
		dr.quit();
	}

}
