package sharespace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T14_folder_rightclick_activitylog_clickclear_verifyactionbutton_isdisenable extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_activitylog_clickclear_verifyactionbutton_isdisenable() throws InterruptedException {

		login_userui();

		PageFactory.initElements(driver, sharespace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				sharespace_pages.document.click();
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		sharespace_pages.Sharespace.click();
		Thread.sleep(1000);
		sharespace_pages.search.sendKeys(properties.getProperty("searchname"));
		Thread.sleep(500);
		sharespace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(sharespace_pages.clickfoldertitle).perform();
		Thread.sleep(500);
		sharespace_pages.folderactivitylog.click();
		Thread.sleep(500);
		sharespace_pages.clearbuttonfolderactivity.click();
		Thread.sleep(500);
		boolean folderaction =sharespace_pages.FolderActions.isSelected();
		System.out.println(folderaction);
		boolean Folderpermissionaction =sharespace_pages.Folderpermission.isSelected();
		System.out.println(Folderpermissionaction);
		boolean FolderShareActions =sharespace_pages.FolderShareActions.isSelected();
		System.out.println(FolderShareActions);
		boolean FolderRecycleBinActions =sharespace_pages.FolderRecycleBinActions.isSelected();
		System.out.println(FolderRecycleBinActions);
		boolean FolderAutomationActions =sharespace_pages.FolderAutomationActions.isSelected();
		System.out.println(FolderAutomationActions);
		boolean FolderEmailActions =sharespace_pages.FolderEmailActions.isSelected();
		System.out.println(FolderEmailActions);
		boolean FoldersettingActions =sharespace_pages.FoldersettingActions.isSelected();
	    System.out.println(FoldersettingActions);
		Thread.sleep(500);
		sharespace_pages.closebuttonfolderactivity.click();
	}
}
