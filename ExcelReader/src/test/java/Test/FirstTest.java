package Test;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {
	@Test(dataProvider = "xl")
	public void main(String username, String password ) {
		dr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		dr.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		dr.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();

	}

	@DataProvider(name = "xl")
	public Object[][] getdata() {
		return x.getexceldata();

	}

	

}
