package Department;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Department_pages;
import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T15_folder_rightclick_clickactionbutton_verifydetails_isdisplayed extends common_function {
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
		Department_pages.clearbuttonfolderactivity.click();
		Thread.sleep(500);
		Department_pages.FolderActions.click();
		Thread.sleep(500);
		Department_pages.Folderpermission.click();
		Thread.sleep(500);
		Department_pages.FolderShareActions.click();
		Thread.sleep(500);
		Department_pages.FolderRecycleBinActions.click();
		Thread.sleep(500);
		Department_pages.FolderAutomationActions.click();
		Thread.sleep(500);
		Department_pages.FolderEmailActions.click();
		Thread.sleep(500);
		Department_pages.FoldersettingActions.click();
		Thread.sleep(500);
		Department_pages.closebuttonfolderactivity.click();
	}
}
