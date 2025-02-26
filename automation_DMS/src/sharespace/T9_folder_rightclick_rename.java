package sharespace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T9_folder_rightclick_rename extends common_function {
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_rename_dropdown_onfolder() throws InterruptedException {

		login_userui();

		PageFactory.initElements(driver, sharespace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				sharespace_pages.document.click();

				sharespace_pages.Sharespace.click();
				Thread.sleep(500);
				sharespace_pages.create.click();

				sharespace_pages.folder.click();

				sharespace_pages.foldername.sendKeys(properties.getProperty("foldername2"));

				sharespace_pages.save.click();
				Thread.sleep(2000);
				sharespace_pages.search.sendKeys(properties.getProperty("foldername2"));

				sharespace_pages.search.sendKeys(Keys.ENTER);
				Thread.sleep(500);
				Actions action = new Actions(driver);
				action.contextClick(sharespace_pages.clickfoldertitle).perform();
				Thread.sleep(500);
				sharespace_pages.renamedropdown.click();

				sharespace_pages.foldernameinrename.clear();

				sharespace_pages.foldernameinrename.sendKeys(properties.getProperty("renamefolder"));

				sharespace_pages.savebuttononrename.click();
				Thread.sleep(1000);
				String actualdata = sharespace_pages.actualelement.getText();
				String expecteddata = "Folder is renamed successfully.";
				System.out.println(actualdata);
				Assert.assertEquals(actualdata, expecteddata);
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
	}
}
