package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) {
		
		String url="https://usdemo.vee24.com/#/transactions";
				
		CommonUI.openBrowser("chrome");
		
		CommonUI.navigate(url);
		
		initializeClassObj();
	  
	    bankTestOne();
	    bankTestTwo();
	   
	}
	
	public static void bankTestOne() {
		
		transferObj.clickTransfer();
		//transferObj.dropdownOriginAcct("text", "Rainy Day");
		//.dropdownDestinAcct("text", "Investing");
		transferObj.enterAmount("1000");
		transferObj.enterSSN("123435677");
		transferObj.enterPin("1235");
		transferObj.clickFunds();
		transferObj.getMessage();
		
		String expectMSG="Success! Funds successfully transferred.";
		String actualMSG=transferObj.getMessage();
		
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(expectMSG, actualMSG);
		softAssert.assertAll();
		
		}
	
	public static void bankTestTwo() {
		
		loansObj.clickLoan();
		loansObj.enterName("John Cena");
	    loansObj.enterAddress("123 java drive");
	    loansObj.dropdownLoan("text", "Retirement");
	    loansObj.enterYear("2");
	    loansObj.nextClick();
	    loansObj.enterAmount("5000");
	    loansObj.enterMaidenNm("Kim");
	    loansObj.enterSSN("123456778");
	    loansObj.nextSubmit();
	    loansObj.confirmClick();
		loansObj.getMSG();
		
		String expMSG="Submission Success!";
		String actMSG=loansObj.getMSG();
		
		SoftAssert softAssert2= new SoftAssert();
		softAssert2.assertEquals(expMSG, actMSG);
		softAssert2.assertAll();
		//verify" Submission Success!"
	}
	
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/