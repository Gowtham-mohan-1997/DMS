package myfile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
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
	public void s1_rename_usingdropdown_onfolder_myfile() throws InterruptedException {

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
		Thread.sleep(2000);
		MyFiles_page.myfile.click();
		Thread.sleep(1000);
		MyFiles_page.create.click();
		Thread.sleep(500);
		MyFiles_page.file.click();
		Thread.sleep(500);
		MyFiles_page.foldername.sendKeys(properties.getProperty("foldername2"));
		Thread.sleep(200);
		MyFiles_page.save.click();
		Thread.sleep(1000);
		MyFiles_page.search.sendKeys(properties.getProperty("foldername2"));
		Thread.sleep(500);
		MyFiles_page.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(MyFiles_page.folder).perform();
		Thread.sleep(500);
		MyFiles_page.renameondropdown.click();
		Thread.sleep(500);
		MyFiles_page.foldernameonrename.clear();
		Thread.sleep(500);
		MyFiles_page.foldernameonrename.sendKeys(properties.getProperty("renamefolder"));
		Thread.sleep(500);
		MyFiles_page.saverename.click();
		Thread.sleep(2000);
		String actualdata =MyFiles_page.actualelement.getText();
		String expecteddata ="Folder is renamed Successfully";
		System.out.println(actualdata);
		Assert.assertEquals(actualdata, expecteddata);

	}

}
