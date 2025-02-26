package myfile;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T55_recyclepin_folder_rightclick_restore extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_recyclepin_restore() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, MyFiles_page.class);
		PageFactory.initElements(driver, common_function.class);
		for (int i = 0; i < 60; i++) {
			try {

				MyFiles_page.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		Thread.sleep(1000);
		MyFiles_page.myfile.click();
		Thread.sleep(1000);
		MyFiles_page.recyclepin.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(MyFiles_page.recyclepinfolder).perform();
		Thread.sleep(500);
		MyFiles_page.recyclepinrestore.click();
		Thread.sleep(500);
		String actualdata =MyFiles_page.actualelement.getText();
		System.out.println(actualdata);
		String expectedelement ="Successfully restored from Recycle Bin.";
		Assert.assertEquals(actualdata.toLowerCase(), expectedelement.toLowerCase());
}
}
