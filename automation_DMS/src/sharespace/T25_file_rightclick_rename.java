package sharespace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T25_file_rightclick_rename extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_rename_onfile() throws InterruptedException {

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
		sharespace_pages.create.click();
		Thread.sleep(500);
		sharespace_pages.folder.click();
		Thread.sleep(500);
		sharespace_pages.foldername.sendKeys(properties.getProperty("foldername4"));
		Thread.sleep(500);
		sharespace_pages.save.click();
		Thread.sleep(500);
		sharespace_pages.search.sendKeys(properties.getProperty("foldername4"));
		Thread.sleep(500);
		sharespace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		sharespace_pages.folderclick.click();
		Thread.sleep(500);
		sharespace_pages.upload.click();
		Thread.sleep(500);
		sharespace_pages.files.click();
		Thread.sleep(500);
		sharespace_pages.fileupload.sendKeys("/home/gautham/Documents/11-801-24-06007.pdf");
		Thread.sleep(500);
		sharespace_pages.filesindepartment.click();
		Thread.sleep(500);
		sharespace_pages.search.sendKeys(properties.getProperty("foldername4"));
		Thread.sleep(500);
		sharespace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		sharespace_pages.folderclick.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(sharespace_pages.filepdf).perform();
		Thread.sleep(500);
		sharespace_pages.renamedropdownonfile.click();
		Thread.sleep(500);
		sharespace_pages.foldernameinrename.clear();
		Thread.sleep(500);
		sharespace_pages.foldernameinrename.sendKeys(properties.getProperty("renamefile"));
		Thread.sleep(500);
		sharespace_pages.savebuttononrename.click();
		Thread.sleep(500);
		String actualdata =sharespace_pages.actualelement.getText();
		System.out.println(actualdata);
		String expecteddata ="file is renamed successfully.";
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

	}
}
