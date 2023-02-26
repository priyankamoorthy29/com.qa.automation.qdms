package com.invicta.qa.testcases.master_user;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.invicta.qa.pages.master_user.Master_UserPages;

public class EquipmentsModulePaginationTest extends Master_User_Main {

	// CHECKING THE PAGINATION OF THE EQUIPMENT TABLE

	@Test	
	public static void paginationEquipments() throws InterruptedException {

		PageFactory.initElements(driver, user);

		testCase = extent.createTest("TESTCASE- check pagination in the equipment ");

		Thread.sleep(2000);

		// STEP 1-CLICK ON "EQUIPMENT" TAB AT THE TOP NAVIGATION BAR
		Master_UserPages.equipmenttab.click();

		// STEP 2-CLICK ON "EQUIPMENT" NAVIGATION AT THE LEFT SIDE
		driver.navigate().refresh();

		Thread.sleep(2000);

		// STEP 3- CLICK ON THE CURRENT PAGINATION DISPLAYED ON THE RIGHT SIDE BOTTOM
		Master_UserPages.CurrentPaginationOpctionEq.click();

		Thread.sleep(2000);

		// STEP 4- CHECK THE PAGINATION PROPERTIES

		/*
		 * PAGINATION-DEFAULT-PAGE-INDEX,PAGINATION-REFERESH-INTO-DEFAULT-PAGE,
		 * PAGINATION-PAGE-REDIRECT-TO-NEXT-PAGE,
		 * PAGINATION_TOTAL_TEXT_VISIBLE,FIRST-PAGE-ROWS
		 */
		Master_User_Main.paginationtestEquipments();

		Thread.sleep(2000);

		// STEP 5- CLICK ON CURRENT PAGINATION DISPLAYED ON THE SIDE BOTTOM
		Master_UserPages.CurrentPaginationOpctionEq.click();

		// STEP 6- CLICK ON 20 PAGES IN THE PAGINATION
		Master_UserPages.Page_20Eq.click();

		Thread.sleep(2000);

		// STEP 7-CHECK THE PAGINATION FUNCTIONS
		Master_User_Main.paginationtEquipmentsFunction();

		Thread.sleep(2000);

		// STEP 8- REFREASH THE BROWSER
		driver.navigate().refresh();

		// STEP 9- CLICK ON THE PAGE COUNT
		Master_UserPages.CurrentPaginationOpctionEq.click();

		// STEP 10- CLICK ON 20 PAGES IN THE PAGINATION
		Master_UserPages.Page_30Eq.click();

		Thread.sleep(2000);

		// STEP 11-CHECK THE PAGINATION FUNCTIONAL
		Master_User_Main.paginationtEquipmentsFunction();

	}
}
