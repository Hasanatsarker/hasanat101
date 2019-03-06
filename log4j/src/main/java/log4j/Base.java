package log4j;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(log4j.PracticeListen.class)
public class Base {

	WebDriver dr;
	
		@Test
		public void open() {
		System.setProperty("webdriver.chrome.driver", "/Users/hasanath/Desktop/chromedriver");
		
		dr = new ChromeDriver ();
		dr.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		dr.get("https://www.facebook.com/");
		}
		
		
		
		@Test
		public void facevook() {
			dr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ahdgjhaj");
			dr.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("dfghjk");
			dr.findElement(By.xpath("//*[@id=\"u_0_8\"]")).click();
}  
		@Test
		public void tearDown() throws Exception {
			Thread.sleep(3000);
			dr.quit();
			
		}
		
		
	}

