package com.qa.automation.qdms.pages.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPage {

	// **********************************************************************************
	// Xpath for Master Card
	// **********************************************************************************

	@FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/master/plantlevel']")
	public static WebElement masterBtn;

}
