package Projectspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Projectspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T15_folder_rightclick_folderactivitylog_verify_textbox_isenable extends common_function {
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_folderactivitylog_verify_textbox_isenable() throws InterruptedException {

		login_userui();

		PageFactory.initElements(driver, Projectspace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				Projectspace_pages.document.click();
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		Projectspace_pages.Projectspace.click();

		Projectspace_pages.projectsearch.sendKeys(properties.getProperty("projectname1"));

		Projectspace_pages.projectsearch.sendKeys(Keys.ENTER);

		Projectspace_pages.projectfoldetclick.click();

		Projectspace_pages.search.sendKeys(properties.getProperty("searchname"));

		Projectspace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(Projectspace_pages.clickfoldertitle).perform();
		Thread.sleep(500);
		Projectspace_pages.folderactivitylog.click();
		Thread.sleep(500);
		boolean folderaction =Projectspace_pages.FolderActions.isSelected();
		System.out.println(folderaction);
		boolean Folderpermissionaction =Projectspace_pages.Folderpermission.isSelected();
		System.out.println(Folderpermissionaction);
		boolean FolderShareActions =Projectspace_pages.FolderShareActions.isSelected();
		System.out.println(FolderShareActions);
		boolean FolderRecycleBinActions =Projectspace_pages.FolderRecycleBinActions.isSelected();
		System.out.println(FolderRecycleBinActions);
		boolean FolderAutomationActions =Projectspace_pages.FolderAutomationActions.isSelected();
		System.out.println(FolderAutomationActions);
		boolean FolderEmailActions =Projectspace_pages.FolderEmailActions.isSelected();
		System.out.println(FolderEmailActions);
		boolean FoldersettingActions =Projectspace_pages.FoldersettingActions.isSelected();
	    System.out.println(FoldersettingActions);
		Thread.sleep(500);
		Projectspace_pages.closebuttonfolderactivity.click();
	}
}
