package test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;

public class CommanTest extends BaseTest {
@BeforeClass
public void Login() {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	loginpage.SetUserName("Admin");
	loginpage.SetPassword("admin123");
	loginpage.ClickLoginButton();
	
}
}
