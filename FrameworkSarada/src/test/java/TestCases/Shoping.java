package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.cartPage;
import Pages.checkOutPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.productDetailsPage;
import Pages.productsPage;
import utilities.readData; 

public class Shoping  extends BaseTest{
	
	
	readData rd; // www.github.com
	
	@Test
	public void Shop_backpage_001() {
		loginPage lp = new loginPage(driver);
		rd = new readData();
		lp.enterUsername(rd.readUsername());
		lp.enterPassword(rd.readpassword());
		lp.clickLogin();
		productsPage pp = new productsPage(driver);
		pp.clickBackPack();
		productDetailsPage pdp = new productDetailsPage(driver);
		pdp.clickaddToCart();
		pdp.clickCartLogo();
		cartPage cp = new cartPage(driver);
		cp.clickCheckout();
		infoPage ip = new infoPage(driver);
		ip.enterDetails();
		checkOutPage cop = new checkOutPage(driver);
		cop.clickFinish();
		completePage comp = new completePage(driver);
		String success_message =comp.getHeader();
		Assert.assertEquals(success_message, "Thank you for your order!"); //Pass or Fail
	}
	
}
