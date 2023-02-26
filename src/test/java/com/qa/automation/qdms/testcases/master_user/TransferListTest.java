//***********************************************************************************
//* Description
//*------------
//* USER MODULE
//***********************************************************************************
//*
//* Author           : Wathsala Weerakoon
//* Date Written     : 22/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        22/02/2023   Wathsala     Orginal Version
//*
//*
package com.invicta.qa.testcases.master_user;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.pages.master_user.Master_UserPages;

public class TransferListTest extends Master_User_Main {

	static Master_UserPages user = new Master_UserPages();

	// CHECKING TRANSFER LIST FUNCTIONALITY & SAVE BUTTON PROPERTIES
	
	@Test
	public static void transferList() throws InterruptedException {

		PageFactory.initElements(driver, user);
		

		testCase = extent.createTest("TESTCASE- Select record from transfer list and save");
		
		Thread.sleep(2000);
		// STEP 1-CLICK ON "EMPLOYEES" ON TOP TAB
		Master_UserPages.employeetab.click();

		// STEP 2-CLICK ON "USER" BUTTON TO NAVIGATE
		Master_UserPages.user.click();

		// STEP 3- CLICK ON "ADD USER" BUTTON TO OPEN THE TRANSFER LIST
		Master_UserPages.adduserbutton.click();
		
		Thread.sleep(2000);

		// STEP 4- SELECT ONE DATA DROM LEFT SIDE & CLICK ON THE RELATIVE CHECKBOX
		Master_User_Main.searchDatafromemail();
		
		// STEP 4- CHECK THE "CHECK BOX" PROPERTIES WHEATHER ENABLE AND VISIBLE
		Master_User_Main.checkBoxProprties();

		//STEP 5- CHECK THE "SENDING RIGHT SIDE ARROW BUTTON" PROPERTIES WHEATHER ENABLE AND VISIBLE
		Master_User_Main.transactionRightArrow();
		
		// STEP 6- SEND THE SELECTED TATA TO THE RIGHT
		Master_UserPages.sendrightarrow.click();
		
		// STEP-7 CLICK ON "USER TYPE" DROPDOWN
		Master_UserPages.usertypebox.click();

		Thread.sleep(2000);
		
		// STEP-8 SELCET DATA FROM THE "USER TYPE" DROPDOWN
		Master_User_Main.checkUserTypeDropDownData();

		// STEP 9- CLICK ON THE "ROLE" DROPDOWN
		Master_UserPages.rolebox.click();

		Thread.sleep(2000);

		// STEP 10- SELECT DATA FROM THE "ROLE" DROPDOWN
		Master_User_Main.checkRoleDropDownData();

		Thread.sleep(2000);

		// STEP 11- CHECK "SAVE" BUTTON PROPERTIES
		
/*DISPLAY,ENABLE,VISIBLE,FONT SIZE,BUTTON SIZE,BUTTON COLOUR,BORDER COLOUR,FONT COLOUR,
 FONT TYPE,BUTTON TEXT,CURSOR TYPE,BUTTON SHAPE,BOX SHADOW,BUTTON PADDING*/

		Master_User_Main.SaveButton();

		// STEP 12- CLICK ON "SAVE" BUTTON
		Master_UserPages.addusersavebutton.click();

		//STEP 13 - CLOSE THE MODAL BY CLICKING OUTSIDE 
		Master_User_Main.modalClose();

		driver.navigate().refresh();

		Thread.sleep(2000);
		
		// STEP 14- CHECK THE ADDED VALUE HAS COME TO THE FIRST OF THE "MANAGE USER" TABLE
		Master_User_Main.checkLastAddvalue();
	}
}