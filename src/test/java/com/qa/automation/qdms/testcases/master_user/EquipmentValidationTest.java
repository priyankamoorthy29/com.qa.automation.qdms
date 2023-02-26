package com.invicta.qa.testcases.master_user;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.invicta.qa.pages.master_user.Master_UserPages;

// CHECK THE VALIDATION MESSAGES IN  ADD EQUIPMENT MODAL 

public class EquipmentValidationTest extends Master_User_Main{
	
	@Test
	public static void validationtestEquipments () throws IOException, InterruptedException {
		
	PageFactory.initElements(driver, user);

	testCase = extent.createTest("TESTCASE- Validation messages in Add Equipment ");

	
	// STEP 1-CLICK ON "EQUIPMENT" TAB AT THE TOP NAVIGATION BAR
	Master_UserPages.equipmenttab.click();
	
	
	//STEP 2-CHECK THE PROPERTIES OF "ADD EQUIPMENT" BUTTON
	
	
	//STEP 3-CHECK THE VALIDATION MESSAGES
	Master_User_Main.ValidationEquipment();

}
}