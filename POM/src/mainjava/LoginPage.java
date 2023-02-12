package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest{
	@FindBy(xpath="//*[text()='Login']")
	WebElement textLoginPage;
	@FindBy(name="username")
	WebElement UserName;
	@FindBy(name="password")
	WebElement Pass;
	@FindBy(tagName="button")
	WebElement clickButton;
	public void LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	public String TitleofLoginPage() {
		return textLoginPage.getText();
	}
	public String UrlOfPaage() {
		return driver.getCurrentUrl();
	}
	public void SetUserName(String username) {
		UserName.sendKeys(username);
	}
    public void SetPassword(String password) {
    	Pass.sendKeys(password);
    }
    public void ClickLoginButton() {
    	clickButton.click();
    }
    public String GetTitle() {
    	return driver.getTitle();
    }
}
