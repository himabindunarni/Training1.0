package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	WebDriver driver;
	By orders = By.className("icon-list-ol");
	
	public void viewOrders()
	{
		WebDriver driver=new ChromeDriver();
		driver.findElement(orders).sendKeys("hello");
	

	LoginPageFactory page = new LoginPageFactory(driver);

	
	}
}
