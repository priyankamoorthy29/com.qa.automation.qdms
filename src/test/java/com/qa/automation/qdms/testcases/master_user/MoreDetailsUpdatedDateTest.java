package com.invicta.qa.testcases.master_user;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.invicta.qa.pages.master_user.Master_UserPages;

public class MoreDetailsUpdatedDateTest extends Master_User_Main {
	
	// CHECKING MORE DETAILS UPDATED DATE AND TIME
		@Test
		public static void updatedtedTime() throws InterruptedException {

			PageFactory.initElements(driver, user);
			
			testCase = extent.createTest("TESTCASE-check the content of more details popup");

			Thread.sleep(2000);
			
			//STEP 1- CLICK ON "EMPLOYEE" TAB AT THE TOP NAVIGATION BAR
			Master_UserPages.employeetab.click();
			
			Thread.sleep(2000);
			
			//STEP 2-CLICK ON "USER" BUTTON AT THE LEFT SIDE 
			Master_UserPages.user.click();

			Thread.sleep(2000);
			
			//STEP 3-SELECT SPECIFIC DATA AND CLICK ON "MORE" RELATIVE TO THAT DATA
			Master_User_Main.searchspecificdata();
			
			Thread.sleep(2000);
			
			// STEP 4-CHECK THE CONTENT OF THE POPUP AND COMPARE WITH EXPECTED RESULTS 
			Master_User_Main.compareUpdatedtedTime();

		}

}
