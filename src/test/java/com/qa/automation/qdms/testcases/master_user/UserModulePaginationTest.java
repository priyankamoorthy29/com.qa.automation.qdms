package com.invicta.qa.testcases.master_user;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.invicta.qa.pages.master_user.Master_UserPages;

public class UserModulePaginationTest extends Master_User_Main {

	// CHECKING THE PAGINATION OF THE USER TABLE

	@Test
	public static void paginationUser() throws InterruptedException {

		PageFactory.initElements(driver, user);

		testCase = extent.createTest("TESTCASE- check the pagination of user");
		
		Thread.sleep(2000);

		// STEP 1-CLICK ON EQUIPMENT TAB
		Master_UserPages.employeetab.click();

		// STEP 2-CLICK ON EQUIPMENT NAVIGATION
		Master_UserPages.user.click();

		Thread.sleep(2000);

		// STEP 3- CHECK THE PAGINATION PROPERTIES

				/*
				 * PAGINATION-DEFAULT-PAGE-INDEX,PAGINATION-REFERESH-INTO-DEFAULT-PAGE,
				 * PAGINATION-PAGE-REDIRECT-TO-NEXT-PAGE,
				 * PAGINATION_TOTAL_TEXT_VISIBLE,FIRST-PAGE-ROWS
				 */
		Master_User_Main.paginationUser();

		Thread.sleep(2000);
		
		// STEP 4-CLICK ON CURRENT PAGINATION DISPLAYED ON THE SIDE BOTTOM
		Master_UserPages.CurrentPaginationOpction.click();

		// STEP 5- CLICK ON 20 PAGES IN THE PAGINATION
		Master_UserPages.Page_20.click();

		Thread.sleep(2000);
		
		// STEP 6-CHECK THE PAGINATION FUNCTIONAL WHEN 20 PAGES
		Master_User_Main.paginationtUserFunction();

		Thread.sleep(2000);

		// STEP 7- REFREASH THE BROWSER
		driver.navigate().refresh();

		Thread.sleep(2000);

		// STEP 8-CLICK ON CURRENT PAGINATION DISPLAYED ON THE SIDE BOTTOM
		Master_UserPages.CurrentPaginationOpction.click();

		Thread.sleep(2000);
		
		// STEP 9- CLICK ON 30 PAGES IN THE PAGINATION
		Master_UserPages.Page_30.click();

		Thread.sleep(2000);

		// STEP 10-CHECK THE PAGINATION FUNCTIONAL WHEN 30 PAGES
		Master_User_Main.paginationtUserFunction();

		

	}

}
