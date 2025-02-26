package myfile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T15_folder_rightclick_clickactionbutton_verifydetails_isdisplayed extends common_function{
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
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.contextClick(MyFiles_page.folder).perform();
		Thread.sleep(1000);
		MyFiles_page.folderactivitylog.click();
		Thread.sleep(1000);
		MyFiles_page.clearbuttoninactivitylog.click();
		Thread.sleep(1000);
		MyFiles_page.FolderActionsfolder.click();
		Thread.sleep(1000);
		MyFiles_page.FolderShareActionsfolder.click();
		Thread.sleep(1000);
		MyFiles_page.FolderRecycleBinActionsfolder.click();
		Thread.sleep(1000);
		MyFiles_page.FolderAutomationActionsfolder.click();
		Thread.sleep(1000);
		MyFiles_page.FolderEmailActionsfolder.click();
		Thread.sleep(1000);
		MyFiles_page.clearbuttoninactivitylog.click();
	}
}
