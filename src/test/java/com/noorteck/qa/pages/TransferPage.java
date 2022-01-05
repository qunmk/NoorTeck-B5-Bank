package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {

	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav/mat-nav-list/a[2]/div/span")
	WebElement transferButton;

	@FindBy(css = ".mat-select-placeholder.ng-tns-c12-16.ng-star-inserted")
	WebElement originAcctDropdown;

	@FindBy(xpath = "//span[@class='mat-select-placeholder ng-tns-c12-4 ng-star-inserted']")
	WebElement destinAcctDropdown;

	@FindBy(xpath = "//input[@placeholder='Amount']")
	WebElement amountField;

	@FindBy(xpath = "//input[@placeholder='Social Security Number']")
	WebElement ssnField;

	@FindBy(xpath = "//input[@placeholder='ATM PIN']")
	WebElement pinField;

	@FindBy(xpath = "//span[contains(text(),'Transfer Funds')]")
	WebElement fundsButton;

	@FindBy(xpath = "/app-success/div/div/div/div/mat-card/mat-card-title")
	WebElement getSuccess;

	public TransferPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickTransfer() {

		click(transferButton);
	}

	public void dropdownOriginAcct(String methodName, String indexTextValue) {

		selectFromDropdown(originAcctDropdown, methodName, indexTextValue);
	}

	public void dropdownDestinAcct(String methodName, String indexTextValue) {

		selectFromDropdown(destinAcctDropdown, methodName, indexTextValue);

	}

	public void enterAmount(String Amount) {

		enter(amountField, Amount);

	}

	public void enterSSN(String ssn) {
		enter(ssnField, ssn);

	}

	public void enterPin(String pin) {
		enter(pinField, pin);

	}

	public void clickFunds() {
		click(fundsButton);

	}

	public String getMessage() {
		return getText(getSuccess);
	}

}