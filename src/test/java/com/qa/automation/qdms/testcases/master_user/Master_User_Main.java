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

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.master_user.Master_UserPages;
import com.invicta.qa.pages.sbu.AddSbuFunPage;
import com.invicta.qa.pages.sbu.AddSbuUIPage;

public class Master_User_Main extends DriverIntialization {

	static Master_UserPages user = new Master_UserPages();

	public static void TestCasePrint(String TestCaseName, Object expectedValue, Object actualValue) {
		boolean position = true;

		ExtentTest testCase = extent.createTest(TestCaseName);
		try {
			AssertJUnit.assertEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			position = false;
		}
		if (position) {
			testCase.log(Status.INFO, "Actual value: " + actualValue.toString());
			testCase.log(Status.INFO, "Expected value: " + expectedValue.toString());
			testCase.log(Status.PASS, "TEST PASS ☑");
		} else {
			testCase.log(Status.INFO, "Actual value: " + actualValue.toString());
			testCase.log(Status.INFO, "Expected value: " + expectedValue.toString());
			testCase.log(Status.FAIL, "TEST FAIL ❎");
		}
	}

	public static void checkBoxProprties() throws InterruptedException {

		PageFactory.initElements(driver, user);

		boolean Acctualenable = Master_UserPages.leftsidefirstitemcheckbox.isEnabled();
		boolean Expectedenable = true;

		TestCasePrint("CHECK BOX ENABLE", Expectedenable, Acctualenable);

	}

	public static void transactionRightArrow() throws InterruptedException {

		PageFactory.initElements(driver, user);
		try {
			if (Master_UserPages.sendrightarrow.isDisplayed()) {

				boolean Acctualtra = Master_UserPages.sendrightarrow.isDisplayed();
				boolean Expectedetra = true;

				TestCasePrint("RIGHT SIDE TRANSFER ARROW VISIBLE", Expectedetra, Acctualtra);

				try {
					if (Master_UserPages.sendrightarrow.isEnabled()) {

						boolean Acctualena = Master_UserPages.sendrightarrow.isEnabled();
						boolean Expectedena = true;

						TestCasePrint("RIGHT SIDE TRANSFER ARROW ENABLE", Expectedena, Acctualena);

					} else {
						testCase = extent.createTest("RIGHT SIDE TRANSFER ARROW VISIBLE");
						testCase.log(Status.INFO, "Image Not Displayed");
						testCase.log(Status.FAIL, " Image Not Displayed");
					}
				} catch (NoSuchElementException e) {
					testCase = extent.createTest("BUTTON Locator");
					testCase.log(Status.INFO, "Dont Have Image Locator");
					testCase.log(Status.FAIL, " Dont Have Image Locator");
				}

			} else {
				testCase = extent.createTest("RIGHT SIDE TRANSFER ARROW ENABLE");
				testCase.log(Status.INFO, "Image Not Displayed");
				testCase.log(Status.FAIL, " Image Not Displayed");
			}
		} catch (NoSuchElementException e) {
			testCase = extent.createTest("BUTTON Locator");
			testCase.log(Status.INFO, "Dont Have Image Locator");
			testCase.log(Status.FAIL, " Dont Have Image Locator");
		}
	}

	public static void searchDatafromemail() throws InterruptedException {

		PageFactory.initElements(driver, user);

		driver.findElement(By.xpath("//td[text()='gacaha6225@wiroute.com']//preceding-sibling::td/label")).click();

	}

	public static void checkUserTypeDropDownData() throws InterruptedException {

		PageFactory.initElements(driver, user);

		// List<WebElement> options = Master_UserPages.usertypeoptions;
		String value = null;
		for (WebElement option : Master_UserPages.usertypeoptions) {
			value = option.getText();
			Thread.sleep(3000);
			System.out.println(value);

			if (value.contentEquals("PLANT_USER"))
				Thread.sleep(2000);
			System.out.println(value);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/div/div")).click();
		}

		String Actualvaluse = value;
		String Expectedvalue = "PLANT_USER";

		TestCasePrint("SELECT-VALUE-FROM-USER-TYPE-DROP-DOWN", Expectedvalue, Actualvaluse);

	}

	public static void checkRoleDropDownData() throws InterruptedException {

		PageFactory.initElements(driver, user);

		// List<WebElement> options = Master_UserPages.usertypeoptions;

		String value = null;
		// int count=0;

		for (WebElement options : Master_UserPages.roleoptions) {
//			  if (count < 3) { // Click on first three options
//			        options.click();
//			        count++;
//			    } else {
//			        break;

			value = options.getText();
			Thread.sleep(3000);
			System.out.println(value);
			System.out.println();
			if (value.valueOf(5) != null)
				Thread.sleep(2000);
			options.click();

		}

	}

	// STEP-2 CHECK THE ENTERED VALUE HAS SAVED IN FIRST OF THE TABLE

	public static void checkLastAddvalue() throws InterruptedException {

		PageFactory.initElements(driver, user);
		Thread.sleep(2000);
		String actualdata = Master_UserPages.firstuserValue.getText();
		System.out.println("First row of table : " + actualdata);

		String expecteddata = "rawor14254@wwgoc.com";

		TestCasePrint("CHECK THE LAST ENTERED VALUE HAS SAVED IN FIRST OF THE TABLE", expecteddata, actualdata);

	}

	// modal close
	public static void modalClose() throws InterruptedException {

		PageFactory.initElements(driver, user);

		Master_UserPages.adduserscancelbutton.click();
//
//		Actions action = new Actions(driver);
//		action.moveByOffset(0, 0).click().build().perform();

		boolean AcctualAfterClick = Master_UserPages.modal.isDisplayed();
		boolean ExpectedAfterClick = true;

		TestCasePrint("MODAL-INVISIBLE-ONCLICK-OUTSIDE", ExpectedAfterClick, AcctualAfterClick);

	}

	public static void plantRoleEdit() throws InterruptedException {

		PageFactory.initElements(driver, user);

		// List<WebElement> options = Master_UserPages.usertypeoptions;

		String value = null;

		for (WebElement options : Master_UserPages.plantroledropdowncontent) {
			value = options.getText();
			Thread.sleep(2000);
			System.out.println(value);
			System.out.println();
			if (value.valueOf(1) != null)
				Thread.sleep(2000);
			System.out.println(value.valueOf(1));
			Thread.sleep(2000);

			options.click();

		}
		Thread.sleep(2000);
		// STEP 5- CLICK ON SOMEWHERE INSIDE THE MODAL TO CLOSE THE DROPDOWN LIST
		Master_UserPages.plantroleeditmodelheading.click();

		Master_User_Main.OKbutton();

		String Actualdata = Master_UserPages.plantroledropdown.getText();

		// STEP 7- CLICK ON "OK" BUTTON
		Master_UserPages.plantroleeditOkbutton.click();

		Thread.sleep(2000);

		// Master_UserPages.roleallocationicon.click();

		searchspecificdatatoeditroleAllocation();

		Thread.sleep(2000);

		String expecteddata = Master_UserPages.plantroledropdown.getText();

		TestCasePrint("EDIT-ROLE-ALLOCATION", expecteddata, Actualdata);

	}

	public static void SaveButton() {
		PageFactory.initElements(driver, user);

		try {
			if (Master_UserPages.addusersavebutton.isDisplayed()) {

				// button Displayed

				boolean ActualbiuttonDisplay = Master_UserPages.addusersavebutton.isDisplayed();
				boolean ExpectedbuttonDisplay = true;
				Master_User_Main.TestCasePrint("ADD-USER-SAVE-BUTTON-DISPLAYED", ExpectedbuttonDisplay,
						ActualbiuttonDisplay);

				try {
					if (Master_UserPages.addusersavebutton.isEnabled()) {

						// button enabled

						boolean ActualImageDisplay = Master_UserPages.addusersavebutton.isEnabled();
						boolean ExpectedImageDisplay = true;
						Master_User_Main.TestCasePrint("ADD-USER-SAVE-BUTTON-ENABLED", ExpectedImageDisplay,
								ActualImageDisplay);

						// check font size

						String ActualfontsSize = Master_UserPages.addusersavebutton.getCssValue("font-size");
						System.out.println("Font Size: " + ActualfontsSize);

						String ExpectedfontsSize = "14px";

						Master_User_Main.TestCasePrint("ADD-USER-SAVE-BUTTON-FONT-SIZE", ExpectedfontsSize,
								ActualfontsSize);

						// Check the size

						Dimension ActualSize = Master_UserPages.addusersavebutton.getSize();
						System.out.println("Size :" + ActualSize);
						Dimension ExpectedSize = new Dimension(60, 32);

						Master_User_Main.TestCasePrint("ADD-USER-SAVE-BUTTON-SIZE", ExpectedSize, ActualSize);

						// Check test button color

						String ActualColour = Master_UserPages.addusersavebutton.getCssValue("background-color");
						System.out.println("rgb :" + ActualColour);

						// String hexcolour = Color.fromString(ActualColour).asHex();
						String ExpectedColour = "rgba(0, 19, 40, 1)";

						Master_User_Main.TestCasePrint("ADD-USER-SAVE-BUTTON-COLOUR", ExpectedColour, ActualColour);

						// Check border colour

						String ActualBorderColour = Master_UserPages.addusersavebutton.getCssValue("border-color");
						System.out.println("rgb :" + ActualBorderColour);

						// String hexcolour = Color.fromString(ActualColour).asHex();
						String ExpectedBorderColour = "rgb(255, 255, 255)";

						Master_User_Main.TestCasePrint("ADD-USER-SAVE-BORDER-COLOUR", ExpectedBorderColour,
								ActualBorderColour);

						// check the font colour

						String ActualfontsColour = Master_UserPages.addusersavebutton.getCssValue("color");
						System.out.println("Font colour: " + ActualfontsColour);

						String ExpectedfontsColour = "rgba(255, 255, 255, 1)";

						Master_User_Main.TestCasePrint("ADD-USER-SAVE-BUTTON-FONT-COLOUR", ExpectedfontsColour,
								ActualfontsColour);

						// check the font type

						String ActualfontsType = Master_UserPages.addusersavebutton.getCssValue("font-style");
						System.out.println("Font type: " + ActualfontsType);

						String ExpectedfontsType = "normal";

						Master_User_Main.TestCasePrint("ADD-USER-SAVE-BUTTON-FONT-TYPE", ExpectedfontsType,
								ActualfontsType);

						// check text

						String ActualText = Master_UserPages.addusersavebutton.getText();
						System.out.println("Text : " + ActualText);

						String ExpectedText = "Save";

						Master_User_Main.TestCasePrint("ADD-USER-SAVE-BUTTON-TEXT", ExpectedText, ActualText);

						// check cursor

						String ActualActions = Master_UserPages.addusersavebutton.getCssValue("cursor");
						System.out.println("cursor :" + ActualActions);
						String ExpectedActions = "pointer";

						Master_User_Main.TestCasePrint("ADD-USER-SAVE-BUTTON-CURSOR-TYPE", ExpectedActions,
								ActualActions);

						// check button shape

						String ActualShape = Master_UserPages.addusersavebutton.getCssValue("border-radius");
						System.out.println("shape :" + ActualShape);
						String ExpectedShape = "2px";

						Master_User_Main.TestCasePrint("USER-SAVE-BUTTON-SHAPE", ExpectedShape, ActualShape);

						// check box shadow

						String ActualShadow = Master_UserPages.addusersavebutton.getCssValue("box-shadow");
						System.out.println("shadow :" + ActualShadow);
						String ExpectedShadow = "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px";

						Master_User_Main.TestCasePrint("ADD-USER-SAVE-BUTTON-BOX-SHADOW", ExpectedShadow, ActualShadow);

						// check padding

						String ActualPadding = Master_UserPages.addusersavebutton.getCssValue("padding");
						System.out.println("padding :" + ActualPadding);
						String ExpectedPadding = "4px 15px";

						Master_User_Main.TestCasePrint("ADD-USER-SAVE-BUTTON-PADDING", ExpectedPadding, ActualPadding);

					} else {
						testCase = extent.createTest("ADD-USER-SAVE-BUTTON-NOT-ENABLED");
						testCase.log(Status.INFO, "Image Not Displayed");
						testCase.log(Status.FAIL, " Image Not Displayed");
					}
				} catch (NoSuchElementException e) {
					testCase = extent.createTest("BUTTON Locator");
					testCase.log(Status.INFO, "Dont Have Image Locator");
					testCase.log(Status.FAIL, " Dont Have Image Locator");
				}

			} else {
				testCase = extent.createTest("ADD-USER-SAVE-BUTTON-NOT-DISPLAYED");
				testCase.log(Status.INFO, "Image Not Displayed");
				testCase.log(Status.FAIL, " Image Not Displayed");
			}
		} catch (NoSuchElementException e) {
			testCase = extent.createTest("BUTTON Locator");
			testCase.log(Status.INFO, "Dont Have Image Locator");
			testCase.log(Status.FAIL, " Dont Have Image Locator");
		}
	}

	public static void OKbutton() {

		PageFactory.initElements(driver, user);

		htmlreporter.config().setReportName("Test Report- USER MODULE-Plant Role Edit OK button properties");
		htmlreporter.config().setDocumentTitle("QDMS reports");

		try {
			if (Master_UserPages.plantroleeditOkbutton.isDisplayed()) {

//							button Displayed

				boolean ActualbiuttonDisplay = Master_UserPages.plantroleeditOkbutton.isDisplayed();
				boolean ExpectedbuttonDisplay = true;

				TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-DISPLAYED", ExpectedbuttonDisplay, ActualbiuttonDisplay);

				try {
					if (Master_UserPages.plantroleeditOkbutton.isEnabled()) {

//									button enabled

						boolean ActualImageDisplay = Master_UserPages.plantroleeditOkbutton.isEnabled();
						boolean ExpectedImageDisplay = true;

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-ENABLED", ExpectedImageDisplay, ActualImageDisplay);

						// check font size

						String ActualfontsSize = Master_UserPages.plantroleeditOkbutton.getCssValue("font-size");
						System.out.println("Font Size: " + ActualfontsSize);

						String ExpectedfontsSize = "14px";

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-FONT-SIZE", ExpectedfontsSize, ActualfontsSize);

						// Check the size

						Dimension ActualSize = Master_UserPages.plantroleeditOkbutton.getSize();
						System.out.println("Size :" + ActualSize);
						Dimension ExpectedSize = new Dimension(50, 32);

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-SIZE", ExpectedSize, ActualSize);

						// Check test button color

						String ActualColour = Master_UserPages.plantroleeditOkbutton.getCssValue("background-color");
						System.out.println("rgb :" + ActualColour);

						// String hexcolour = Color.fromString(ActualColour).asHex();
						String ExpectedColour = "rgba(24, 144, 255, 1)";

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-COLOUR", ExpectedColour, ActualColour);

						// Check border colour

						String ActualBorderColour = Master_UserPages.plantroleeditOkbutton.getCssValue("border-color");
						System.out.println("rgb :" + ActualBorderColour);

						// String hexcolour = Color.fromString(ActualColour).asHex();
						String ExpectedBorderColour = "rgb(24, 144, 255)";

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-BORDER-COLOUR", ExpectedBorderColour,
								ActualBorderColour);

						// check the font colour

						String ActualfontsColour = Master_UserPages.plantroleeditOkbutton.getCssValue("color");
						System.out.println("Font colour: " + ActualfontsColour);

						String ExpectedfontsColour = "rgba(255, 255, 255, 1)";

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-FONT-COLOUR", ExpectedfontsColour, ActualfontsColour);

						// check the font type

						String ActualfontsType = Master_UserPages.plantroleeditOkbutton.getCssValue("font-style");
						System.out.println("Font type: " + ActualfontsType);

						String ExpectedfontsType = "normal";

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-FONT-TYPE", ExpectedfontsType, ActualfontsType);
						// check text

						String ActualText = Master_UserPages.plantroleeditOkbutton.getText();
						System.out.println("Text : " + ActualText);

						String ExpectedText = "OK";

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-TEXT", ExpectedText, ActualText);

						// check cursor

						String ActualActions = Master_UserPages.plantroleeditOkbutton.getCssValue("cursor");
						System.out.println("cursor :" + ActualActions);
						String ExpectedActions = "pointer";

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-CURSOR-TYPE", ExpectedActions, ActualActions);

						// check button shape

						String ActualShape = Master_UserPages.plantroleeditOkbutton.getCssValue("border-radius");
						System.out.println("shape :" + ActualShape);
						String ExpectedShape = "2px";

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-SHAPE", ExpectedShape, ActualShape);

						// check box shadow

						String ActualShadow = Master_UserPages.plantroleeditOkbutton.getCssValue("box-shadow");
						System.out.println("shadow :" + ActualShadow);
						String ExpectedShadow = "rgba(0, 0, 0, 0.043) 0px 2px 0px 0px";

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-BOX-SHADOW", ExpectedShadow, ActualShadow);

						// check padding

						String ActualPadding = Master_UserPages.plantroleeditOkbutton.getCssValue("padding");
						System.out.println("padding :" + ActualPadding);
						String ExpectedPadding = "4px 15px";

						TestCasePrint("PLANT-ROLE-EDIT-OK BUTTON-PADDING", ExpectedPadding, ActualPadding);

					} else {
						testCase = extent.createTest("PLANT-ROLE-EDIT-OK BUTTON-NOT-ENABLED");
						testCase.log(Status.INFO, "Image Not Displayed");
						testCase.log(Status.FAIL, " Image Not Displayed");
					}
				} catch (NoSuchElementException e) {
					testCase = extent.createTest("BUTTON Locator");
					testCase.log(Status.INFO, "Dont Have Image Locator");
					testCase.log(Status.FAIL, " Dont Have Image Locator");
				}

			} else {
				testCase = extent.createTest("PLANT-ROLE-EDIT-OK BUTTON-NOT-DISPLAYED");
				testCase.log(Status.INFO, "Image Not Displayed");
				testCase.log(Status.FAIL, " Image Not Displayed");
			}
		} catch (NoSuchElementException e) {
			testCase = extent.createTest("BUTTON Locator");
			testCase.log(Status.INFO, "Dont Have Image Locator");
			testCase.log(Status.FAIL, " Dont Have Image Locator");
		}
		System.out.println();
	}

	public static void compareCreatedTime() throws InterruptedException {

		PageFactory.initElements(driver, user);

		String ActualTime = Master_UserPages.createdtime.getText();
		String ExpectedTime = "February 23rd 2023, 6:24:02 pm";
		System.out.println(ActualTime);

		TestCasePrint("CREATED TIME", ExpectedTime, ActualTime);

	}

	public static void compareUpdatedtedTime() throws InterruptedException {

		PageFactory.initElements(driver, user);

		String ActualTime = Master_UserPages.moredetailsmodalfullcontent.getText();
		String ExpectedTime = "More Details\n" + "Created Date\n" + "Updated Date\n" + "Address\n" + "\n"
				+ "February 25th 2023, 7:22:18 am\n" + "February 25th 2023, 7:22:18 am";
		System.out.println(ActualTime);

		TestCasePrint("UPDATED TIME", ExpectedTime, ActualTime);

	}

	public static void paginationUser() throws InterruptedException {

		PageFactory.initElements(driver, user);

//		Default Index Page
		boolean ActualDefaultPageIndex = Master_UserPages.DefaultPaginationPage.isDisplayed();
		boolean ExpectedDefaultPageIndex = true;

		TestCasePrint("PAGINATION-DEFAULT-PAGE-INDEX", ExpectedDefaultPageIndex, ActualDefaultPageIndex);

//		Refresh pagination into default page 
		Master_UserPages.NextPageBtn.click();
		Thread.sleep(20000);
		driver.navigate().refresh();
		Thread.sleep(2000);

		boolean ActualDefaultPageIndex1 = Master_UserPages.DefaultPaginationPage.isDisplayed();
		boolean ExpectedDefaultPageIndex1 = true;

		TestCasePrint("PAGINATION-REFERESH-INTO-DEFAULT-PAGE", ExpectedDefaultPageIndex1, ActualDefaultPageIndex1);

//		Page Redirect to the next page 
		Master_UserPages.NextPageBtn.click();
		Thread.sleep(2000);
		boolean ActualSecoundPageIndex = Master_UserPages.PaginationSecoundPage.isDisplayed();
		boolean ExpectedSecoundPageIndex = true;

		TestCasePrint("PAGINATION-PAGE-REDIRECT-TO-NEXT-PAGE", ExpectedSecoundPageIndex, ActualSecoundPageIndex);

		// Total Text Visible
		boolean ActualVisibleTotalText = Master_UserPages.totalTextSecondPage.isDisplayed();
		boolean ExpectedVisibleTotalText = true;

		TestCasePrint("PAGINATION_TOTAL_TEXT_VISIBLE", ExpectedVisibleTotalText, ActualVisibleTotalText);

		// number of rows
		int TotalRowActual = Master_UserPages.totalrows.size();
		System.out.println("Number of rows " + TotalRowActual);

		int TotalRowExpected = 11;

		TestCasePrint("TOTAL-ROW", TotalRowExpected, TotalRowActual);
	}
	// pagination function

//		driver.navigate().refresh();
//
//		Thread.sleep(2000);
//
//		Master_UserPages.CurrentPaginationOpction.click();
//
//		Thread.sleep(2000);
//
//		Master_UserPages.Page_20.click();
//		System.out.println(Master_UserPages.CurrentPaginationOpction.getText());
//		Thread.sleep(2000);
	// Thread.sleep(2000);
//			Master_UserPages.Page_30.click();
//			Thread.sleep(2000);
//			Master_UserPages.Page_100.click();
//			Thread.sleep(2000); 
//			System.out.println("****"+Master_UserPages.CurrentPaginationOpction.getText());
//			Total Count of the 10/page index

	public static void paginationtUserFunction() throws InterruptedException {

		PageFactory.initElements(driver, user);

		System.out.println(Master_UserPages.CurrentPaginationOpction.getText());
		Thread.sleep(2000);

		if (Master_UserPages.CurrentPaginationOpction.getText().contentEquals("10 / page")) {
			int ActualPageIndex_10 = (Master_UserPages.usernameColumn.size() - 1);
			int ExpectedOageIndex_10 = 10;

			if (0 <= ActualPageIndex_10) {
				if (ActualPageIndex_10 <= 10) {
					TestCasePrint("PAGINATION-TOTAL-DATA-OF-10/PAGE-INDEX", ExpectedOageIndex_10, ActualPageIndex_10);

				} else {
					testCase.log(Status.INFO,
							"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpction.getText());
					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_10);
					testCase.log(Status.FAIL, "Wrong TotalData");
				}
			} else {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpction.getText());
				testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_10);
				testCase.log(Status.FAIL, "Wrong TotalData");
			}

		}
//			Total Count of the 20/page index
		else if (Master_UserPages.CurrentPaginationOpction.getText().contentEquals("20 / page")) {
			int ActualPageIndex_20 = (Master_UserPages.when20usernamecolumn.size() - 1);
			System.out.println((Master_UserPages.when20usernamecolumn.size() - 1));
			int ExpectedPageIndex_20 = 20;

			if (0 <= ActualPageIndex_20) {
				if (ActualPageIndex_20 <= 20) {

					TestCasePrint("PAGINATION-TOTAL-DATA-OF-20/PAGE-INDEX", ExpectedPageIndex_20, ActualPageIndex_20);
				} else {
					testCase.log(Status.INFO,
							"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpction.getText());
					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_20);
					testCase.log(Status.FAIL, "Wrong TotalData");
				}
			} else {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpction.getText());
				testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_20);
				testCase.log(Status.FAIL, "Wrong TotalData");
			}

		}
//			Total Count of the 30/page index
		else if (Master_UserPages.CurrentPaginationOpction.getText().contentEquals("30 / page")) {
			int ActualPageIndex_30 = (Master_UserPages.when30usernamecolumn.size() - 1);
			int ExpectedPageIndex_30 = 30;

			if (0 <= ActualPageIndex_30) {
				if (ActualPageIndex_30 <= 30) {

					TestCasePrint("PAGINATION-TOTAL-DATA-OF-10/PAGE-INDEX", ExpectedPageIndex_30, ActualPageIndex_30);
				} else {
					testCase.log(Status.INFO,
							"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpction.getText());
					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_30);
					testCase.log(Status.FAIL, "Wrong TotalData");
				}
			} else {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpction.getText());
				testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_30);
				testCase.log(Status.FAIL, "Wrong TotalData");
			}

		}
//			Total Count of the 100/page index
		else if (Master_UserPages.CurrentPaginationOpction.getText().contentEquals("100 / page")) {
			int ActualPageIndex_100 = (Master_UserPages.usernameColumn.size() - 1);
			int expectedPageIndex_100 = 100;

			if (0 <= ActualPageIndex_100) {
				if (ActualPageIndex_100 <= 100) {

					TestCasePrint("PAGINATION-TOTAL-DATA-OF-100/PAGE-INDEX", expectedPageIndex_100,
							ActualPageIndex_100);
				} else {
					testCase.log(Status.INFO,
							"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpction.getText());
					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_100);
					testCase.log(Status.FAIL, "Wrong TotalData");
				}
			} else {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpction.getText());
				testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_100);
				testCase.log(Status.FAIL, "Wrong TotalData");
			}

		}
	}

	// equipments pagination

	public static void paginationtestEquipments() throws InterruptedException {

		PageFactory.initElements(driver, user);

//	Default Index Page
		boolean ActualDefaultPageIndex = Master_UserPages.DefaultPaginationPageeq.isDisplayed();
		boolean ExpectedDefaultPageIndex = true;

		TestCasePrint("PAGINATION-DEFAULT-PAGE-INDEX", ExpectedDefaultPageIndex, ActualDefaultPageIndex);
//	Refresh pagination into default page 

		Master_UserPages.NextPageBtnEq.click();
		Thread.sleep(20000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		boolean ActualDefaultPageIndex1 = Master_UserPages.DefaultPaginationPageeq.isDisplayed();
		boolean ExpectedDefaultPageIndex1 = true;

		TestCasePrint("PAGINATION-REFERESH-INTO-DEFAULT-PAGE", ExpectedDefaultPageIndex1, ActualDefaultPageIndex1);

//	Page Redirect to the next page 
		Master_UserPages.NextPageBtnEq.click();
		Thread.sleep(2000);
		boolean ActualSecoundPageIndex = Master_UserPages.PaginationSecoundPageEq.isDisplayed();
		boolean ExpectedSecoundPageIndex = true;

		TestCasePrint("PAGINATION-PAGE-REDIRECT-TO-NEXT-PAGE", ExpectedSecoundPageIndex, ActualSecoundPageIndex);
		// Total Text Visible
		boolean ActualVisibleTotalText = Master_UserPages.totalTextSecondPageEq.isDisplayed();
		boolean ExpectedVisibleTotalText = true;

		TestCasePrint("PAGINATION_TOTAL_TEXT_VISIBLE", ExpectedVisibleTotalText, ActualVisibleTotalText);

		// number of rows
		int TotalRowActual = Master_UserPages.totalrowsEq.size();
		System.out.println("Number of rows " + TotalRowActual);

		int TotalRowExpected = 11;

		TestCasePrint("FIRST-PAGE-ROWS", TotalRowExpected, TotalRowActual);
		// pagination function

//		driver.navigate().refresh();
//
//		Thread.sleep(2000);
//
//		Master_UserPages.CurrentPaginationOpctionEq.click();
//
//		Thread.sleep(2000);
//
//		Master_UserPages.Page_20Eq.click();
//
//		Thread.sleep(2000);

	}

	public static void paginationtEquipmentsFunction() throws InterruptedException {

		PageFactory.initElements(driver, user);

		System.out.println(Master_UserPages.CurrentPaginationOpctionEq.getText());
		Thread.sleep(2000);
		// Thread.sleep(2000);
//		Master_UserPages.Page_30.click();
//		Thread.sleep(2000);
//		Master_UserPages.Page_100.click();
//		Thread.sleep(2000); 
//		System.out.println("****"+Master_UserPages.CurrentPaginationOpction.getText());
//		Total Count of the 10/page index
		if (Master_UserPages.CurrentPaginationOpctionEq.getText().contentEquals("10 / page")) {
			int ActualPageIndex_10 = (Master_UserPages.totalrowsEq.size() - 1);
			int ExpectedIndex_10 = 10;

			if (0 <= ActualPageIndex_10) {
				if (ActualPageIndex_10 <= 10) {

					TestCasePrint("PAGINATION-TOTAL-DATA-OF-10/PAGE-INDEX", ExpectedIndex_10, ActualPageIndex_10);

				} else {
					testCase.log(Status.INFO,
							"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpctionEq.getText());
					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_10);
					testCase.log(Status.FAIL, "Wrong TotalData");
				}
			} else {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpctionEq.getText());
				testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_10);
				testCase.log(Status.FAIL, "Wrong TotalData");
			}

		}
//		Total Count of the 20/page index
		else if (Master_UserPages.CurrentPaginationOpctionEq.getText().contentEquals("20 / page")) {
			int ActualPageIndex_20 = (Master_UserPages.when20equipmentnamecolumnEq.size() - 1);
			System.out.println(ActualPageIndex_20);
			int ExpectedPageIndex_20 = 20;

			if (0 <= ActualPageIndex_20) {
				if (ActualPageIndex_20 <= 20) {

					TestCasePrint("PAGINATION-TOTAL-DATA-OF-20/PAGE-INDEX", ExpectedPageIndex_20, ActualPageIndex_20);
				} else {
					testCase.log(Status.INFO,
							"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpctionEq.getText());
					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_20);
					testCase.log(Status.FAIL, "Wrong TotalData");
				}
			} else {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpctionEq.getText());
				testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_20);
				testCase.log(Status.FAIL, "Wrong TotalData");
			}

		}
//		Total Count of the 30/page index
		else if (Master_UserPages.CurrentPaginationOpctionEq.getText().contentEquals("30 / page")) {
			int ActualPageIndex_30 = (Master_UserPages.when30equipmentnamecolumn.size() - 1);
			System.out.println(ActualPageIndex_30);
			int ExpectedPageIndex_30 = 30;

			if (0 <= ActualPageIndex_30) {
				if (ActualPageIndex_30 <= 30) {

					TestCasePrint("PAGINATION-TOTAL-DATA-OF-30/PAGE-INDEX", ExpectedPageIndex_30, ActualPageIndex_30);
				} else {
					testCase.log(Status.INFO,
							"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpctionEq.getText());
					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_30);
					testCase.log(Status.FAIL, "Wrong TotalData");
				}
			} else {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpctionEq.getText());
				testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_30);
				testCase.log(Status.FAIL, "Wrong TotalData");
			}

		}
//		Total Count of the 100/page index
		else if (Master_UserPages.CurrentPaginationOpctionEq.getText().contentEquals("100 / page")) {
			int ActualPageIndex_100 = (Master_UserPages.usernameColumn.size() - 1);
			int ExpectedPageIndex_100 = 100;

			if (0 <= ActualPageIndex_100) {
				if (ActualPageIndex_100 <= 100) {

					TestCasePrint("PAGINATION-TOTAL-DATA-OF-100/PAGE-INDEX", ExpectedPageIndex_100,
							ActualPageIndex_100);

				} else {
					testCase.log(Status.INFO,
							"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpctionEq.getText());
					testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_100);
					testCase.log(Status.FAIL, "Wrong TotalData");
				}
			} else {
				testCase.log(Status.INFO,
						"Current Pagination Opction :- " + Master_UserPages.CurrentPaginationOpctionEq.getText());
				testCase.log(Status.INFO, "Actual TotalData :- " + ActualPageIndex_100);
				testCase.log(Status.FAIL, "Wrong TotalData");
			}

		}
	}

	public static void searchspecificdata() {
		PageFactory.initElements(driver, user);

		driver.findElement(By.xpath("//td[text()='siyofa7803@youke1.com']//following-sibling::td[7]//span/span"))
				.click();
	}

	public static void searchspecificdatatoeditroleAllocation() {
		PageFactory.initElements(driver, user);

		driver.findElement(By.xpath("//td[text()='siyofa7803@youke1.com']//following-sibling::td[6]//span/span"))
				.click();
	}

//    Validation
	public static void ValidationEquipment() throws IOException, InterruptedException {
		
		PageFactory.initElements(driver, user);
		boolean pass=false;
		Thread.sleep(1000);

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\com\\invicta\\qa\\excel\\Data.xlsx");
		// C:\Automation_Workspace\QDMS-AUTOMATION\src\test\java\com\invicta\qa\excel\Data.xlsx
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("ValidationCheckEquipment");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);

			boolean check = (boolean) row.getCell(0).getBooleanCellValue();
			String Equipment = (String) row.getCell(1).getStringCellValue();
			String EquipmentType = (String) row.getCell(2).getStringCellValue();
			String Description = (String) row.getCell(3).getStringCellValue();
			String Validation1 = (String) row.getCell(4).getStringCellValue();
			String Validation2 = (String) row.getCell(5).getStringCellValue();
			String Message = (String) row.getCell(6).getStringCellValue();

			if (check) {
				Master_UserPages.addequipmentbutton.click();
				Master_UserPages.equipmenttextbox.sendKeys(Equipment);
				Master_UserPages.equipmenttypetextbox.click();
				Thread.sleep(5000);
				for(int j =1; j<=2; j++) { 
					WebElement name= driver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div[" + j + "]"));
					String dropcontent= name.getText();
					if(dropcontent.contentEquals(EquipmentType)) { 
						name.click();
						pass=true; 
					}
					else if(dropcontent.isEmpty()) {
						pass=true;
					}
				}
				//if(pass) {
				Thread.sleep(2000);
				Master_UserPages.descriptiontextbox.sendKeys(Description);
				Master_UserPages.equipmentsavebutton.click();
				
				Thread.sleep(2000);
				String ActualValidation1 = Master_UserPages.equipment.getText();
				String ExpectedValidation1 = Validation1;
				testCase = extent.createTest(Message);
				try {
					Assert.assertEquals(ActualValidation1, ExpectedValidation1);
					testCase.log(Status.INFO, "Actual Validation :- " + ActualValidation1);
					testCase.log(Status.INFO, "Expected Validation :- " + ExpectedValidation1);
					testCase.log(Status.PASS, "Pass " + Message + "Script");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Validation :- " + ActualValidation1);
					testCase.log(Status.INFO, "Expected Validation :- " + ExpectedValidation1);
					testCase.log(Status.FAIL, "Fail " + Message + "Script").assignCategory("Low Priority");
					testCase.log(Status.FAIL, "Fail " + Message + "Script").assignCategory("High Priority");
				}
  
				try {
					if (Master_UserPages.equipmenttypevalidation.isDisplayed()) {

				String ActualValidation2 = Master_UserPages.equipmenttypevalidation.getText();
				String ExpectedValidation2 = Validation2;
				testCase = extent.createTest(Message);
				try {
					Assert.assertEquals(ActualValidation2, ExpectedValidation2);
					testCase.log(Status.INFO, "Actual Validation :- " + Master_UserPages.equipmenttypevalidation.getText());
					testCase.log(Status.INFO, "Expected Validation :- " + ExpectedValidation2);
					testCase.log(Status.PASS, "Pass " + Message + "Script");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Validation :- " + Master_UserPages.equipmenttypevalidation.getText());
					testCase.log(Status.INFO, "Expected Validation :- " + ExpectedValidation2);
					testCase.log(Status.FAIL, "Fail " + Message + "Script").assignCategory("Low Priority");
					testCase.log(Status.FAIL, "Fail " + Message + "Script").assignCategory("High Priority");
				}	
				//} catch (NoSuchElementException e) {
					
					}else {
					testCase = extent.createTest("RIGHT SIDE TRANSFER ARROW ENABLE");
					testCase.log(Status.INFO, "Image Not Displayed");
					testCase.log(Status.FAIL, " Image Not Displayed");
				}
			} catch (NoSuchElementException e) {
//				testCase = extent.createTest("BUTTON Locator");
//				testCase.log(Status.INFO, "Dont Have Image Locator");
//				testCase.log(Status.FAIL, " Dont Have Image Locator");
			}
				}
				Thread.sleep(1000);
				if(Master_UserPages.equipmentCancelbutton.isDisplayed()) {
					Thread.sleep(1000);
					Master_UserPages.equipmentCancelbutton.click();
				}
				}					
					
//			Thread.sleep(1000);
//			AddSbuFunPage.SBUName.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
//			AddSbuFunPage.Des.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
//			Thread.sleep(1000);
					
		}
	
}	
