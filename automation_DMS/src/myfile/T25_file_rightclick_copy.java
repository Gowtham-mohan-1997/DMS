package myfile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T25_file_rightclick_copy extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_verify_copy_onfile() throws InterruptedException {

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
		Thread.sleep(2000);

		MyFiles_page.search.sendKeys(properties.getProperty("searchname"));
		Thread.sleep(2000);
		MyFiles_page.search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Actions action1 = new Actions(driver);
		action1.doubleClick(MyFiles_page.folder);
		action1.perform();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
        action.contextClick(MyFiles_page.filepdf).perform();
        Thread.sleep(2000);
        MyFiles_page.movef.click();
		Thread.sleep(500);
		MyFiles_page.movefolderclick.click();
		Thread.sleep(500);
		MyFiles_page.folderclick.click();
		Thread.sleep(500);
		MyFiles_page.copybutton.click();
		Thread.sleep(2000);
		String actualdata =MyFiles_page.actualelement.getText();
		String expecteddata ="file(s) copied successfully";
	     System.out.println(actualdata);
	     Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());






	}
}
