package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.TestDataProvider;

public class LoginTest extends BaseTest {

	@Test(dataProvider = "loginData", dataProviderClass = TestDataProvider.class)
	public void validLogin(String username, String password, boolean expectedSuccess)
	{
		LoginPage loginPage = new LoginPage(driver);

		loginPage.login(username, password);

		if (expectedSuccess)
		{
			Assert.assertEquals(loginPage.getProductsTitle(), "Products");
		}
		else
		{
			Assert.assertTrue(
					loginPage.getErrorMessage().contains("locked out")
			);
		}
	}
}
