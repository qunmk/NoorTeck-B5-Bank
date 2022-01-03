package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//span[contains(text(),'Transfer')]")
	WebElement transferButton;

	@FindBy(xpath = "//span[contains(text(),'Loans')]")
	WebElement loansButton;

	@FindBy(xpath = "//span[contains(text(),'LogOut')]")
	WebElement logoutButton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickTransfer() {
		click(transferButton);
	}

	public void clickLoans() {
		click(loansButton);
	}

	public void clickLogout() {

		click(logoutButton);
	}

}
