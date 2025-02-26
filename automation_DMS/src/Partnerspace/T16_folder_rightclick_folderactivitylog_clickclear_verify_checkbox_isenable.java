package Partnerspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.Partnerspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T16_folder_rightclick_folderactivitylog_clickclear_verify_checkbox_isenable extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_activitylog_clickclear_verify_checkbox_isenable() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, MyFiles_page.class);
		PageFactory.initElements(driver, Partnerspace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				Partnerspace_pages.document.click();
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		Partnerspace_pages.partnerspace.click();
		Thread.sleep(1000);
		Partnerspace_pages.projectsearch.sendKeys(properties.getProperty("projectname"));
		Thread.sleep(500);
	Partnerspace_pages.projectsearch.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Partnerspace_pages.projectfoldetclick.click();
		Thread.sleep(500);
		Partnerspace_pages.search.sendKeys(properties.getProperty("searchname"));
		Thread.sleep(500);
		Partnerspace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(Partnerspace_pages.clickfoldertitle).perform();
		Thread.sleep(500);
		Partnerspace_pages.folderactivitylog.click();
		Thread.sleep(500);
		Partnerspace_pages.clearbuttonfolderactivity.click();
		Thread.sleep(500);
		boolean folderaction =Partnerspace_pages.FolderActions.isSelected();
		System.out.println(folderaction);
		boolean Folderpermissionaction =Partnerspace_pages.Folderpermission.isSelected();
		System.out.println(Folderpermissionaction);
		boolean FolderShareActions =Partnerspace_pages.FolderShareActions.isSelected();
		System.out.println(FolderShareActions);
		boolean FolderRecycleBinActions =Partnerspace_pages.FolderRecycleBinActions.isSelected();
		System.out.println(FolderRecycleBinActions);
		boolean FolderAutomationActions =Partnerspace_pages.FolderAutomationActions.isSelected();
		System.out.println(FolderAutomationActions);
		boolean FolderEmailActions =Partnerspace_pages.FolderEmailActions.isSelected();
		System.out.println(FolderEmailActions);
		boolean FoldersettingActions =Partnerspace_pages.FoldersettingActions.isSelected();
	    System.out.println(FoldersettingActions);
		Thread.sleep(500);
		Partnerspace_pages.closebuttonfolderactivity.click();
	}
}
