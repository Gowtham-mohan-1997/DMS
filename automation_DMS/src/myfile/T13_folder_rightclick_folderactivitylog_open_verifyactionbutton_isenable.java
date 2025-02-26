package myfile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T13_folder_rightclick_folderactivitylog_open_verifyactionbutton_isenable extends common_function {
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
		for (int i = 0; i < 60; i++) {
			try {

				MyFiles_page.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

		MyFiles_page.myfile.click();
		Thread.sleep(2000);
		MyFiles_page.search.sendKeys(properties.getProperty("searchname"));
		Thread.sleep(1000);
		MyFiles_page.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(MyFiles_page.folder).perform();
		Thread.sleep(500);
		MyFiles_page.folderactivitylog.click();
		Thread.sleep(2000);
		boolean FolderActions =MyFiles_page.FolderActionsfolder.isSelected();
		System.out.println(FolderActions);
		boolean FolderShareActions =MyFiles_page.FolderShareActionsfolder.isSelected();
		System.out.println(FolderShareActions);
		boolean FolderRecycleBinActions =MyFiles_page.FolderRecycleBinActionsfolder.isSelected();
		System.out.println(FolderRecycleBinActions);
		boolean FolderAutomationActions =MyFiles_page.FolderAutomationActionsfolder.isSelected();
		System.out.println(FolderAutomationActions);
		boolean FolderEmailActions =MyFiles_page.FolderEmailActionsfolder.isSelected();
		System.out.println(FolderEmailActions);
		MyFiles_page.closebuttonactivitylog.click();










	}

}
