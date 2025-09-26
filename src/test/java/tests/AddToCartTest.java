package tests;

import base.Base;
import pages.LoginPage;
import pages.ProductPage;
import org.testng.annotations.Test;
public class AddToCartTest extends Base {
	 @Test
	    public void addProductToCartTest() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("standard_user", "secret_sauce");

	        ProductPage productsPage = new ProductPage(driver);
	        productsPage.addFirstProductToCart();
	        productsPage.goToCart();

	 	}
}
