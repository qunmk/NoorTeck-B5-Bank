package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoansPage extends CommonUI {
	
	@FindBy(xpath="//span[contains(text(),'Loans')]")
	WebElement loanButton;

	@FindBy(xpath = "//input[@placeholder='First name, Last name']")
	WebElement nameField;

	@FindBy(xpath = "//input[@placeholder='Street, City, Zip Code']")
	WebElement addressField;

	@FindBy(xpath = "//span[@class='mat-select-placeholder ng-tns-c13-12 ng-star-inserted']")
	WebElement loanDropdown;

	@FindBy(xpath = "//input[@placeholder='Ex. 1 Year']")
	WebElement yearField;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-0\"]/form/div/button/span")
	WebElement nextButton;

	@FindBy(xpath = "//input[@placeholder='Ex. 10000']")
	WebElement loanAmount;

	@FindBy(xpath = "//input[@placeholder='Ex. Smith']")
	WebElement maidenNameField;

	@FindBy(xpath = "//input[@placeholder='placeholder=\"Format: XXX-XX-XXXX']")
	WebElement ssnField;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/form/div/button[1]/span")
	WebElement backButton;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/form/div/button[1]")
	WebElement buttonNext;

	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	WebElement buttonConfirm;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-2\"]/div/button[2]/span")
	WebElement buttonBack;

	@FindBy(xpath = "//span[contains(text(),'Reset')]")
	WebElement buttonReset;

	public LoansPage() {

		PageFactory.initElements(driver, this);
	}
	
	public void clickLoan() {
		
		click(loanButton);
	}

	public void enterName(String name) {
		enter(nameField, name);

	}

	public void enterAddress(String address) {
		enter(addressField, address);

	}

	public void dropdownLoan(String methodName, String indexTextValue) {

		selectFromDropdown(loanDropdown, methodName, indexTextValue);
	}

	public void enterYear(String year) {
		enter(yearField, year);

	}

	public void nextClick() {
		click(nextButton);

	}

	public void enterAmount(String amount) {

		enter(loanAmount, amount);

	}
	
	public void enterMaidenNm(String maiden) {
		enter (maidenNameField, maiden);
		
	}

	public void enterSSN(String ssn) {
		enter(ssnField, ssn);

	}

	public void backClick() {
		click(backButton);

	}

	public void nextSubmit() {
		click(buttonNext);

	}

	public void confirmClick() {
		click(buttonConfirm);

	}

	public void clickBack() {
		click(buttonBack);

	}

	public void resetClick() {
		click(buttonReset);

	}

}