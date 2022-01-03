package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) {
		
		String url="https://usdemo.vee24.com/#/transactions";
				
		CommonUI commonUIObj=new CommonUI();
		
		commonUIObj.openBrowser("chrome");
		
		commonUIObj.navigate(url);
		
		ObjInitialize obj=new ObjInitialize();
		
	    obj.initializeClassObj();
	    
	    BankTest testObj=new BankTest();
	    
	    testObj.bankTestOne();
	    testObj.bankTestTwo();
	   
	}
	
	public void bankTestOne() {
		
		transferObj.clickTransfer();
		transferObj.dropdownOriginAcct("text", "Rainy Day");
		transferObj.dropdownDestinAcct("text", "Investing");
		transferObj.enterAmount("1000");
		transferObj.enterSSN("123435677");
		transferObj.enterPin("1235");
		transferObj.clickFunds();
		// verify "Success! Funds successfully transferred." 
		}
	
	public void bankTestTwo() {
		
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