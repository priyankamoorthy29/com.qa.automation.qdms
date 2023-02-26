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
package com.qa.automation.qdms.pages.master_user;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Master_UserPages {
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]")
	public static WebElement moredetailsmodal;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/header/ul/li[6]")
	public static WebElement employeetab;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[4]")
	public static WebElement user;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div[3]/button")
	public static WebElement adduserbutton;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[2]")
	public static WebElement leftsidefirstitem;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[1]/label/span")
	public static WebElement leftsidefirstitemcheckbox;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/button[1]")
	public static WebElement sendrightarrow;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr/td[3]/div/div")
	public static WebElement usertypebox;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr/td[4]/div/div/div")
	public static WebElement rolebox;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div[2]/div[1]/div/div")
	public static List <WebElement>  usertypeoptions;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div[1]/div/div")
	public static List <WebElement>  roleoptions;
	
	@FindBy(xpath="//div[@class='ant-modal-content']/div[3]/button[2]")
	public static WebElement addusersavebutton;
	
	@FindBy(xpath="//div[@class='ant-modal-content']/div[3]/button[1]")
	public static WebElement adduserscancelbutton;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr/td[1]/label/span/input")
	public static WebElement usercheckbox;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr")
	public static List <WebElement> transferdata;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/ul/li[3]/button/span/svg")
	public static WebElement nextpagearrowuserpage;
	
	
	
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]")
	public static WebElement modal;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[7]/span/span")
	public static WebElement roleallocationicon;
	
	@FindBy(xpath="//span[@class='ant-select-selection-item-content']")
	public static WebElement plantroledropdown;
	
	@FindBy(xpath="//div[@class='rc-virtual-list-holder-inner']")
	public static List <WebElement> plantroledropdowncontent;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	public static WebElement plantroleeditOkbutton;
	
	@FindBy(xpath="//button[@class='ant-btn']")
	public static WebElement plantroleeditCancelbutton;
	
	
	@FindBy(xpath="//div[@class='ant-modal-title']")
	public static WebElement plantroleeditmodelheading;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div[2]/div/div[2]/div[1]")
	public static WebElement createdtime;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[8]/span/span")
	public static WebElement more;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div[2]/div/div[2]/div[2]")
	public static WebElement updatedtime;
	
	@FindBy(xpath="/html/body/div[3]/div/div")
	public static WebElement moredetailsmodalfullcontent;
	
	
	//pagination user
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[3]")
	public static WebElement DefaultPaginationPage;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[10]/button/span")
	public static WebElement NextPageBtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[4]")
	public static WebElement PaginationSecoundPage;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]")
	public static WebElement totalTextSecondPage;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]")
	public static List <WebElement> totalrows;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[11]/div/div[1]")
	public static WebElement CurrentPaginationOpction;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]")
	public static List <WebElement>  usernameColumn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[11]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]")
	public static WebElement Page_20;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/ul/li[11]/div/div[2]/div/div/div/div[2]/div/div/div/div[3]")
	public static WebElement Page_30;
	
	@FindBy(xpath = "//*[@class='ant-select-selection-item'][@title='100 / page']")
	public static WebElement Page_100;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]")
	public static List <WebElement>  when20usernamecolumn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]")
	public static List <WebElement>  when30usernamecolumn;
	
	
	
	//pagination equipments
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul/li[3]")
	public static WebElement DefaultPaginationPageeq;
	

	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul/li[8]/button")
	public static WebElement NextPageBtnEq;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/ul/li[4]")
	public static WebElement PaginationSecoundPageEq;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]")
	public static WebElement totalTextSecondPageEq;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]")
	public static List <WebElement> totalrowsEq;
	
	@FindBy(xpath="//div[@class='ant-select-selector']")
	public static WebElement CurrentPaginationOpctionEq;
	
	@FindBy(xpath = "//div[@class='rc-virtual-list-holder-inner']/div[2]/div[1]")
	public static WebElement Page_20Eq;
	
	@FindBy(xpath = "//div[@class='rc-virtual-list-holder-inner']/div[3]/div")
	public static WebElement Page_30Eq;
	
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]")
	public static List <WebElement>  when20equipmentnamecolumn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[1]")
	public static WebElement firstuserValue;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[2]")
	public static WebElement firstuserValueintransferlist;
	

	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]")
	public static List <WebElement>  when30equipmentnamecolumn;
	
	// empoyee module
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[2]")
	public static WebElement equipmenttab;
	
	@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[1]/div/div/div[1]")
	public static WebElement equipment;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr/td[1]")
	public static List <WebElement>  when20equipmentnamecolumnEq;
	
	@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
	public static List <WebElement>  UserColumn;
	
	// validation testing
	
	@FindBy(xpath = "//*[@id=\"equipment_name\"]")
	public static WebElement equipmenttextbox;
	
	@FindBy(xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[2]/div/div/div/div")
	public static WebElement equipmenttypetextbox;
	
	@FindBy(xpath = "//*[@id=\"equipment_description\"]")
	public static WebElement descriptiontextbox;
	
	@FindBy(xpath = "//button[@type='button'][2]")
	public static WebElement equipmentsavebutton;
	
	@FindBy(xpath = "//div[@class='ant-modal-footer']/button[1]")
	public static WebElement equipmentCancelbutton;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div[2]")
	public static WebElement equipmentvalidation;
	
	@FindBy(xpath = "(//div[normalize-space()=\"Equipment Type can't be empty\"])[1]")
	public static WebElement equipmenttypevalidation;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/button")
	public static WebElement addequipmentbutton;
	
	
	
	
	
	
	
	
	
	public static String UserBefore="//tbody[@class='ant-table-tbody']/tr[";
	public static String UserAfter="]/td[1]";
	public static String AlloBefore="//tbody[@class='ant-table-tbody']/tr[";
	public static String AlloAfter="]/td[7]";
	
}
