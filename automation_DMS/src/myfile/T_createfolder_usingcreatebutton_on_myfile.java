package myfile;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import DMS_page.utility;
import common_function.common_function;

public class T_createfolder_usingcreatebutton_on_myfile extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_createfolder_usingcreatebutton_on_myfile() throws InterruptedException {

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
		Thread.sleep(2000);
		MyFiles_page.create.click();
		Thread.sleep(500);
		MyFiles_page.file.click();
		Thread.sleep(500);
		MyFiles_page.foldername.sendKeys(properties.getProperty("foldername"));
		Thread.sleep(200);
		MyFiles_page.save.click();
		Thread.sleep(1000);
		String actualdata =MyFiles_page.actualelement.getText();
		System.out.println(actualdata);
		String expecteddata ="folder created successfully.";
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());
//utility.clickWithWait(MyFiles_page.logout1);
//Thread.sleep(2000);
//utility.clickWithWait(MyFiles_page.logout2);
//Thread.sleep(2000);
	}

}
