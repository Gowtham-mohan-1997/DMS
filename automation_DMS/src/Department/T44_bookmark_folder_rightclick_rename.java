package Department;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Department_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T44_bookmark_folder_rightclick_rename extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_rename_onbookmark() throws InterruptedException {

		login_userui();
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
		Department_pages.bookmark.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(Department_pages.bookmarkfolderclick).perform();
		Thread.sleep(500);
		Department_pages.renameonbookmark.click();
		Thread.sleep(500);
		Department_pages.folderrenameonbookmark.clear();
		Thread.sleep(500);
		Department_pages.folderrenameonbookmark.sendKeys(properties.getProperty("bookmarkrename"));
		Thread.sleep(500);
		Department_pages.savebuttononrename.click();
		Thread.sleep(500);
		String actualdata =Department_pages.actualelement.getText();
		System.out.println(actualdata);
		String expecteddata="Folder is renamed successfully.";
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());









}
}
