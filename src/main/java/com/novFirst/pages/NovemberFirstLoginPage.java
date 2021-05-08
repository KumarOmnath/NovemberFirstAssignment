package com.novFirst.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonUtils.BaseTest;
import commonUtils.Constant;
import commonUtils.GenericUtility;

/**
 * @author kumar Page class NovemberFirstLoginPage
 */
public class NovemberFirstLoginPage extends BaseTest {

	/**
	 * created object of GenericUtility class
	 */
	GenericUtility genericUtility = new GenericUtility();

	/**
	 * declared webelement of page
	 */

	@FindBy(xpath = "//*[contains(@class,'mat-select-arrow ')]")
	private WebElement contryDropdown;

	@FindBy(xpath = "//span[.='English']")
	private WebElement countrySelect;

	@FindBy(xpath = "//a[.='Sign up']")
	private WebElement signupLink;

	@FindBy(xpath = "//a[.=' Forgot password? ']")
	private WebElement forgotPassword;

	@FindBy(id = "mat-input-3")
	private WebElement cvrNumber;

	@FindBy(xpath = "//*[@data-placeholder='First name']")
	private WebElement firstName;

	@FindBy(xpath = "//*[@data-placeholder='Last name']")
	private WebElement lastName;

	@FindBy(xpath = "//*[@data-placeholder='Work email']")
	private WebElement email;

	@FindBy(xpath = "//*[@data-placeholder='Email confirmation']")
	private WebElement confirmEmail;

	@FindBy(xpath = "//*[@data-placeholder='Phone']")
	private WebElement phoneNumber;

	@FindBy(xpath = "//*[@class='mat-checkbox-frame']")
	private WebElement checkBox;

	@FindBy(xpath = "(//*[.=' Create account '])[3]")
	private WebElement createAcountButton;

	@FindBy(xpath = "//*[.=' Please confirm your email ']")
	private WebElement emailScreen;

	@FindBy(xpath = "//*[@data-placeholder='Customer number']")
	private WebElement customerNumber;

	@FindBy(xpath = "//*[@name='email']")
	private WebElement customerEmail;

	@FindBy(xpath = "//*[@data-placeholder='Password']")
	private WebElement customerPassword;

	@FindBy(xpath = "(//*[.=' Log in '])[3]")
	private WebElement clickLoginButton;

	@FindBy(xpath = "(//*[@class='ng-star-inserted'])[3]")
	private WebElement errorMessage;
    
	
	/**
	 * @return the getContryDropdown
	 */
	public WebElement getContryDropdown() {
		return contryDropdown;
	}
     
	/**
	 * @return the getCountrySelect
	 */
	public WebElement getCountrySelect() {
		return countrySelect;
	}
	
	/**
	 * @return the getSignupLink
	 */

	public WebElement getSignupLink() {
		return signupLink;
	}
    
	/**
	 * @return the getForgotPassword
	 */
	public WebElement getForgotPassword() {
		return forgotPassword;
	}
	/**
	 * @return the getCvrNumber
	 */
	public WebElement getCvrNumber() {
		return cvrNumber;
	}
	/**
	 * @return the getFirstName
	 */
	public WebElement getFirstName() {
		return firstName;
	}
	/**
	 * @return the getLastName
	 */
	public WebElement getLastName() {
		return lastName;
	}
	/**
	 * @return the getEmail
	 */
	public WebElement getEmail() {
		return email;
	}
	/**
	 * @return the getConfirmEmail
	 */
	public WebElement getConfirmEmail() {
		return confirmEmail;
	}
	/**
	 * @return the getPhoneNumber
	 */
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @return the getCheckBox
	 */
	public WebElement getCheckBox() {
		return checkBox;
	}
	/**
	 * @return the getCreateAcountButton
	 */
	public WebElement getCreateAcountButton() {
		return createAcountButton;
	}
	/**
	 * @return the getEmailScreen
	 */
	public WebElement getEmailScreen() {
		return emailScreen;
	}
	/**
	 * @return the getCustomerNumber
	 */
	public WebElement getCustomerNumber() {
		return customerNumber;
	}
	/**
	 * @return the getCustomerEmail
	 */
	public WebElement getCustomerEmail() {
		return customerEmail;
	}
	/**
	 * @return the getCustomerPassword
	 */
	public WebElement getCustomerPassword() {
		return customerPassword;
	}
	/**
	 * @return the getClickLoginButton
	 */
	public WebElement getClickLoginButton() {
		return clickLoginButton;
	}
	/**
	 * @return the getErrorMessage
	 */
	public WebElement getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @Initilize the webelement
	 */
	public NovemberFirstLoginPage() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @click on countrydropdown
	 */
	public void countryDropdown() throws Exception {
		genericUtility.JseHighlightTheElement(getContryDropdown());
		genericUtility.JseClick(getContryDropdown());
		genericUtility.JseClick(getCountrySelect());
	}

	/**
	 * @verify signup link
	 */
	public void signUPLink() throws Exception {
		genericUtility.JseHighlightTheElement(getSignupLink());
		boolean signupLink = genericUtility.validateElementDisplayed(getSignupLink());
		Assert.assertTrue(signupLink);
	}

	/**
	 * @verify forgot password link
	 */
	public void forgotpasswordLink() throws Exception {
		genericUtility.JseHighlightTheElement(getForgotPassword());
		boolean forgotPassword = genericUtility.validateElementDisplayed(getForgotPassword());
		Assert.assertTrue(forgotPassword);

	}

	/**
	 * @verify click on signuplink
	 */
	public void clicksignUpLink() throws Exception {
		genericUtility.JseClick(getSignupLink());

	}

	/**
	 * @ verify enter all details
	 */

	public void enterallDetails(String cvr, String FirstName, String LastName, String Email, String ConfirmEmail,
			String PhoneNumber) throws Exception {
		boolean cvrField = genericUtility.validateElementDisplayed(getCvrNumber());
		Assert.assertTrue(cvrField);
		genericUtility.sendToTextBox(getCvrNumber(), cvr);

		boolean firstnameField = genericUtility.validateElementDisplayed(getFirstName());
		Assert.assertTrue(firstnameField);
		genericUtility.sendToTextBox(getFirstName(), FirstName);

		boolean lastnameField = genericUtility.validateElementDisplayed(getLastName());
		Assert.assertTrue(lastnameField);
		genericUtility.sendToTextBox(getLastName(), LastName);

		boolean emailField = genericUtility.validateElementDisplayed(getEmail());
		Assert.assertTrue(emailField);
		genericUtility.sendToTextBox(getEmail(), Email);

		boolean confirmemailField = genericUtility.validateElementDisplayed(getConfirmEmail());
		Assert.assertTrue(confirmemailField);
		genericUtility.sendToTextBox(getConfirmEmail(), ConfirmEmail);

		boolean phoneField = genericUtility.validateElementDisplayed(getPhoneNumber());
		Assert.assertTrue(phoneField);
		genericUtility.sendToTextBox(getPhoneNumber(), PhoneNumber);

	}

	/**
	 * @verify click on checkbox & create account
	 */
	public void clickCheckboxCreateAcount() throws Exception {
		genericUtility.scrollToview(getCheckBox());
		genericUtility.JseClick(getCheckBox());
		boolean createAcountButton = genericUtility.validateElementDisplayed(getCreateAcountButton());
		Assert.assertTrue(createAcountButton);
		genericUtility.JseClick(getCreateAcountButton());
	}

	/**
	 * @verify element on email confirm screen
	 */
	public void emailConfirmScreen() throws Exception {
		genericUtility.scrollToview(getCheckBox());
		genericUtility.JseClick(getCheckBox());
		boolean createAcountButton = genericUtility.validateElementDisplayed(getCreateAcountButton());
		Assert.assertTrue(createAcountButton);
		genericUtility.JseClick(getCreateAcountButton());
		genericUtility.wait(6);
	}

	/**
	 * @ sucessfull email screen
	 */

	public void sucessfullPageMessageValidation() throws Exception {
		genericUtility.WaitForTheVisibilityOfElement(getEmailScreen(), 40);
		String actualMessage = genericUtility.getText(getEmailScreen());
		System.out.println(actualMessage);
		Assert.assertTrue(actualMessage.contains(Constant.SuccessMessagEmail));

	}

	/**
	 * @ verify enter all login details
	 */
	public void enterallLoginDetails(String CustomerNumber, String Email, String Password) throws Exception {
		boolean customerNumberField = genericUtility.validateElementDisplayed(getCustomerNumber());
		Assert.assertTrue(customerNumberField);
		genericUtility.sendToTextBox(getCustomerNumber(), CustomerNumber);

		boolean emailField = genericUtility.validateElementDisplayed(getCustomerEmail());
		Assert.assertTrue(emailField);
		genericUtility.sendToTextBox(getCustomerEmail(), Email);

		boolean passwordField = genericUtility.validateElementDisplayed(getCustomerPassword());
		Assert.assertTrue(passwordField);
		genericUtility.sendToTextBox(getCustomerPassword(), Password);

	}

	/**
	 * @verify element on email confirm screen
	 */
	public void loginButtonClick() throws Exception {
		genericUtility.scrollToview(getCheckBox());
		genericUtility.JseClick(getCheckBox());
		boolean loginButton = genericUtility.validateElementDisplayed(getClickLoginButton());
		Assert.assertTrue(loginButton);
		genericUtility.JseClick(getClickLoginButton());
		genericUtility.wait(6);

	}

	/**
	 * @verify error message
	 */
	public void errorMessage() throws Exception {	
		boolean errorMessage = genericUtility.validateElementDisplayed(getErrorMessage());
		Assert.assertTrue(errorMessage);
		genericUtility.JseHighlightTheElement(getErrorMessage());
		genericUtility.wait(4);
		String actualErrorMessage = genericUtility.getText(getErrorMessage());
		System.out.println(actualErrorMessage);
		Assert.assertTrue(actualErrorMessage.contains(Constant.ActualErrorMessage));
		
	}

}
