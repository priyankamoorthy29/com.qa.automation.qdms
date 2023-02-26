package com.qa.automation.qdms.testcases.master_user;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.invicta.qa.pages.master_user.Master_UserPages;

public class EditRoleAllocationTest extends Master_User_Main {

	// CHECKING EDIT ROLE POPUP FUNCTIONALITY & OK BUTTON PROPERTIES

	@Test
	public static void editRoleAllocation() throws InterruptedException {

		PageFactory.initElements(driver, user);

		testCase = extent.createTest("TESTCASE- check the edited role allocation data");
		
		Thread.sleep(2000);
		
		// STEP 1-CLICK ON "EMPLOYEES" ON TOP TAB
		Master_UserPages.employeetab.click();

		// STEP 2-CLICK ON "USER" BUTTON TO NAVIGATE
		Master_UserPages.user.click();

		Thread.sleep(2000);
		
		// STEP 2-SELECT ONE DATA AND CLICK ON THE "ROLE ALLOCATION" IN THE "MANAGE USER" TABLE 
		Master_User_Main.searchspecificdatatoeditroleAllocation();
		
		Thread.sleep(2000);
		
		// STEP 3- CLICK ON "PLANT ROLE" DROPDOWN
		Master_UserPages.plantroledropdown.click();
		
		Thread.sleep(2000);

		// STEP 4-CHECK THE VALUES INSIDE THE DROPDOWN AND COMPARE AFTER EDITED THE "PLANT ROLE"
		Master_User_Main.plantRoleEdit();
		
		//STEP 5- CLOSE THE MODAL BY CLICK ON CANCEL BUTTON
		Master_UserPages.plantroleeditCancelbutton.click();
		
		

}
}
