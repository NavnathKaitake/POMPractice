package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest  extends BaseTest{
	@Test(priority = 0, groups= {"smoke","regression"})
	public void verifyTitleOfLoginPage() {
		String verifyTitleOfLoginPge = loginpage.TitleofLoginPage();
		Assert.assertEquals(verifyTitleOfLoginPge, "Login");
		this.verifyCurrentUrlOfPage();
	}
	
	@Test(priority = 1, groups= {"smoke","regression"})
	public void verifyCurrentUrlOfPage() {
		String verifyUrlOfPage =loginpage.UrlOfPaage();
		Assert.assertEquals(verifyUrlOfPage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 2, groups= {"smoke","regression"})
	public void verifyLoginWithCorrectCredentials() {
		loginpage.SetUserName("Admin");
		loginpage.SetPassword("admin123");
		loginpage.ClickLoginButton();
	}

}
