package Department;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Department_pages;
import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T13_folder_rightclick_folderactivitylog_open_verifyactionbutton_isenable extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_folderactivitylog_open_verifyactionbutton_isenable() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, MyFiles_page.class);
		PageFactory.initElements(driver, Department_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				Department_pages.document.click();
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		Department_pages.department.click();
		Thread.sleep(1000);
		Department_pages.search.sendKeys(properties.getProperty("searchname"));
		Thread.sleep(500);
		Department_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(Department_pages.clickfoldertitle).perform();
		Thread.sleep(500);
		Department_pages.folderactivitylog.click();
		Thread.sleep(500);
		boolean folderaction =Department_pages.FolderActions.isSelected();
		System.out.println(folderaction);
		boolean Folderpermissionaction =Department_pages.Folderpermission.isSelected();
		System.out.println(Folderpermissionaction);
		boolean FolderShareActions =Department_pages.FolderShareActions.isSelected();
		System.out.println(FolderShareActions);
		boolean FolderRecycleBinActions =Department_pages.FolderRecycleBinActions.isSelected();
		System.out.println(FolderRecycleBinActions);
		boolean FolderAutomationActions =Department_pages.FolderAutomationActions.isSelected();
		System.out.println(FolderAutomationActions);
		boolean FolderEmailActions =Department_pages.FolderEmailActions.isSelected();
		System.out.println(FolderEmailActions);
		boolean FoldersettingActions =Department_pages.FoldersettingActions.isSelected();
	    System.out.println(FoldersettingActions);
		Thread.sleep(500);
		Department_pages.closebuttonfolderactivity.click();
	}
}
