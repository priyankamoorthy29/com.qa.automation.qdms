package com.qa.automation.qdms.testcases.master;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.automation.qdms.base.DriverIntialization;
import com.qa.automation.qdms.pages.master.MasterPage;

public class MasterTest extends DriverIntialization {

	MasterPage master = new MasterPage();

	@Test

	public void MasterCard() {
		
		PageFactory.initElements(driver, master);

		MasterPage.masterBtn.click();
	}

}
