package sharespace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T30_file_rightclick_activitylog_checkbox_isenable_onfile extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_activitylog_checkbox_isenable_onfile() throws InterruptedException {

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
		sharespace_pages.fileactivitylogonfile.click();
		Thread.sleep(500);
		boolean FileActionsonfile =sharespace_pages.FolderActions.isSelected();
		System.out.println(FileActionsonfile);
		boolean FileShareActionsonfile =sharespace_pages.FolderShareActions.isSelected();
		System.out.println(FileShareActionsonfile);
		boolean FileAnnotationActionsonfile =sharespace_pages.FolderRecycleBinActions.isSelected();
		System.out.println(FileAnnotationActionsonfile);
		boolean FileRecycleBinActionsonfile =sharespace_pages.FolderAutomationActions.isSelected();
		System.out.println(FileRecycleBinActionsonfile);
		boolean FileEditActionsonfile =sharespace_pages.FolderEmailActions.isSelected();
		System.out.println(FileEditActionsonfile);
		Thread.sleep(500);
		sharespace_pages.closebuttonfolderactivity.click();
	}
}
