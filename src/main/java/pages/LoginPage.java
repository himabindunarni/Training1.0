package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	By emaillocator  = By.id("email");
	By passwordlocator = By.id("passwd");
	By clickbutton = By.id("SubmitLogin");
	By loginvalid = By.className("alert alert-danger");
	
	
	
	public Object performLogin() {
		System.setProperty("webdriver.chrome.driver", "//Users//rohitrajsingh//Downloads//work//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.findElement(emaillocator).sendKeys("hello");
		driver.findElement(passwordlocator).sendKeys("hello");
		driver.findElement(clickbutton).click();
		if(driver.findElement(loginvalid).isDisplayed()) 
		{
			System.out.println("Login is not successful ");
		}
		else {
			return new LoginPage();
		}
		return new MyAccountPage();
	}
	
	public void createaccount() {
		
		
	}

}
