package sharespace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T15_folder_rightclick_folderactivitylog_clickactionbutton_verifydetails_isdisplayed extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_clickactionbutton_verifydetails_isdisplayed() throws InterruptedException {

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
		sharespace_pages.FolderActions.click();
		Thread.sleep(500);
		sharespace_pages.Folderpermission.click();
		Thread.sleep(500);
		sharespace_pages.FolderShareActions.click();
		Thread.sleep(500);
		sharespace_pages.FolderRecycleBinActions.click();
		Thread.sleep(500);
		sharespace_pages.FolderAutomationActions.click();
		Thread.sleep(500);
		sharespace_pages.FolderEmailActions.click();
		Thread.sleep(500);
		sharespace_pages.FoldersettingActions.click();
		Thread.sleep(500);
		sharespace_pages.closebuttonfolderactivity.click();
	}
}
