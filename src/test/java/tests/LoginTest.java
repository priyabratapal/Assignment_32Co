package tests;

import base.Base;
import pages.LoginPage;
import pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTest extends Base {
	 @Test
	    public void validLoginTest() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("standard_user", "secret_sauce");

	        ProductPage productsPage = new ProductPage(driver);
	        Assert.assertEquals(productsPage.getPageTitle(), "Products",
	                "User should be redirected to Products page after successful login.");
	    }
}
