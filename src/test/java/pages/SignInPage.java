package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SignInPage extends BaseClass {

	public SignInPage() {

	}

	public SignInPage(IOSDriver<IOSElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(id = "Email")
	private IOSElement emailElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='Email, Error: Please check your email address']")
	private IOSElement email1Element;

	@iOSXCUITFindBy(id = "Password")
	private IOSElement passwordElement;
	
	@iOSXCUITFindBy(id = "Welcome Back!")
	private IOSElement welcomeBackElement;
	
	@iOSXCUITFindBy(id = "Event Management")
	private IOSElement eventManagementElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign In\"]")
	private IOSElement signInButtonElement;

	@iOSXCUITFindBy(id = "Sign Up")
	private IOSElement signUpElement;

	@iOSXCUITFindBy(id = "Forgot Password?")
	private IOSElement forgotPasswordElement;

	@iOSXCUITFindBy(id = "Toolbar Done Button")
	private IOSElement hideKeyboard;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Failed to process\"]")
	private IOSElement incorrectUserPassword;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Username or Password cannot blank\"]")
	private IOSElement blankUserPassword;

//	public boolean isSignInPageDisplayed() {
//		return eventManagementElement.isDisplayed();
//	}
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Clear text\"])[1]")
	private IOSElement buttonClearTextEmailElement;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Clear text\"])[2]")
	private IOSElement buttonClearTextPasswordElement;
	
	/* ********************************************************** */
	
	public boolean isSignInPageDisplayed() {
		return signInButtonElement.isDisplayed();
	}

	public boolean incorrectUserPassDisplayed() {
		return incorrectUserPassword.isDisplayed();
	}

	public boolean blankUserPassDisplayed() {
		return blankUserPassword.isDisplayed();
	}

	public void typeEmail(String email) {
		emailElement.sendKeys(email);
	}

	public void typeEmail1(String email) {
		email1Element.sendKeys(email);
	}

	public void clearEmail() {
		emailElement.click();
	}

	public void typePassword(String password) {
		passwordElement.sendKeys(password);
	}

	public void clearPassword() {
		passwordElement.click();
	}

	public void clickSigIn() {
		signInButtonElement.click();
	}

	public void clickSignUp() {
		signUpElement.click();
	}

	public void clickForgotPassword() {
		forgotPasswordElement.click();
	}

	public void clickDoneButtonKeyboard() {
		hideKeyboard.click();
	}
	
	public void clearTextEmail() {
		buttonClearTextEmailElement.click();
	}

	public void clearTextPassword() {
		buttonClearTextPasswordElement.click();
	}
	
	/* ******************************************** */

	public void login(String name, String password) {
		
		clearEmail();
		typeEmail(name);
		clickDoneButtonKeyboard();
		typePassword(password);
		clickDoneButtonKeyboard();
		clickSigIn();
	}

	public void negatiflogin(String name, String password) {

		clearEmail();
		clearTextEmail();
		typeEmail(name);
		clickDoneButtonKeyboard();
		clearPassword();
		clearTextPassword();
		typePassword(password);
		clickDoneButtonKeyboard();
		clickSigIn();
	}

	public void negatiflogin1(String name, String password) {
		

		/* This Waiting time just want to sure element "//XCUIElementTypeTextField[@name='Email, Error: Please check your email address']" can be identified by appium */
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeTextField[@name='Email, Error: Please check your email address']")));

		typeEmail1(name);
		clickDoneButtonKeyboard();
		clearPassword();
		clearTextPassword();
		typePassword(password);
		clickDoneButtonKeyboard();
		clickSigIn();
	}

	public void negatiflogin2(String name, String password) {

		clearEmail();
		clearTextEmail();
		
		/* This Waiting time just want to sure element "Toolbar Done Button" can be identified by appium */
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Toolbar Done Button")));
		
		clickDoneButtonKeyboard();
		clickSigIn();
	}

	public void signup() {

		clickSignUp();
	}
	
	public void forgotPassword() {
		clickForgotPassword();
	}

	/**
    *
    * @return the login message
    */
   public String getErrorMessage1() {
       return driver.findElementById("Username or Password was incorrect").getText();
   }
	
   public String getErrorMessage2() {
       return driver.findElementById("Username or Password cannot blank").getText();
   }
	
}
