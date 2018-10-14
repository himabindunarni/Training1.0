package testing;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MyAccountPage;

public class TestingFlow {

	@Test
	public void LoginTest()
	{
		LoginPage login = new LoginPage();
		MyAccountPage myaccount = (MyAccountPage) login.performLogin();
		myaccount.viewOrders();
		
	}
}
