package sharespace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import DMS_page.utility;
import common_function.common_function;

public class T26_file_rightclick_move extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_move_onfile() throws InterruptedException {

		login_userui();

		PageFactory.initElements(driver, sharespace_pages.class);
		PageFactory.initElements(driver, utility.class);
		for (int i = 0; i < 60; i++) {
			try {

				sharespace_pages.document.click();
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		sharespace_pages.Sharespace.click();
	utility.clickWithWait(sharespace_pages.create);
		//sharespace_pages.create.click();
		//Thread.sleep(500);
		utility.clickWithWait(sharespace_pages.folder);
		//sharespace_pages.folder.click();
		Thread.sleep(500);
		sharespace_pages.foldername.sendKeys(properties.getProperty("foldername5"));
		Thread.sleep(500);
		sharespace_pages.save.click();
		Thread.sleep(500);
		sharespace_pages.search.sendKeys(properties.getProperty("foldername5"));
		Thread.sleep(500);
		sharespace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		sharespace_pages.folderclick.click();
		Thread.sleep(500);
		sharespace_pages.upload.click();
		Thread.sleep(500);
		sharespace_pages.files.click();
		Thread.sleep(500);
		sharespace_pages.fileupload.sendKeys(properties.getProperty("filename"));
		Thread.sleep(500);
		sharespace_pages.filesindepartment.click();
		Thread.sleep(500);
		sharespace_pages.search.sendKeys(properties.getProperty("foldername5"));
		Thread.sleep(500);
		sharespace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		sharespace_pages.folderclick.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(sharespace_pages.filepdf).perform();
		Thread.sleep(500);
		sharespace_pages.moveandcopyonfile.click();
		Thread.sleep(500);
		sharespace_pages.movefolderonfile.click();
		Thread.sleep(500);
		sharespace_pages.movebuttononfile.click();
		Thread.sleep(500);
		String actualdata1 =sharespace_pages.actualelement.getText();
		System.out.println(actualdata1);
		String expecteddata1 ="files/folder(s) moved successfully";
		Assert.assertEquals(actualdata1.toLowerCase(), expecteddata1.toLowerCase());



	}

}
