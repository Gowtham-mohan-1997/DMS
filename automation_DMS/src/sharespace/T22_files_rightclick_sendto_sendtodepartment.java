package sharespace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T22_files_rightclick_sendto_sendtodepartment  extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_sendto_department() throws InterruptedException {

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
		sharespace_pages.folderclick.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(sharespace_pages.filepdf).perform();
		Thread.sleep(500);
		sharespace_pages.sendtodropdownonfile.click();
		Thread.sleep(500);
		sharespace_pages.departmentsendto.click();
		Thread.sleep(500);
		sharespace_pages.departmentfolder.click();
		Thread.sleep(500);
		sharespace_pages.sendbutton.click();
		Thread.sleep(1000);
		String actualdata = sharespace_pages.actualelement.getText();
		System.out.println(actualdata);
		String expecteddata = "File sharedTo :Department successfully.";
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());
	}
}
