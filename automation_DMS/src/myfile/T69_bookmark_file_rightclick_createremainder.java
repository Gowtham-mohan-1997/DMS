package myfile;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import DMS_page.lookup_function;
import DMS_page.utility;
import common_function.common_function;

public class T69_bookmark_file_rightclick_createremainder extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_bookmark_file_remainder() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, MyFiles_page.class);
		PageFactory.initElements(driver, lookup_function.class);
		PageFactory.initElements(driver, utility.class);
		for (int i = 0; i < 60; i++) {
			try {

				MyFiles_page.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

		MyFiles_page.myfile.click();

		MyFiles_page.bookmark.click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.contextClick(MyFiles_page.bookmarkfileclick1).perform();

		utility.clickWithWait(MyFiles_page.bookmarkfileremainter);

		MyFiles_page.bookmarkfileremaintertext.sendKeys(properties.getProperty("remaimdername1"));

		utility.clickWithWait(MyFiles_page.bookmarkfileremaintersave);
		Thread.sleep(1000);
		String actualdata = MyFiles_page.actualelement.getText();
		String expecteddata = "Reminder created successfully";
		System.out.println(actualdata);
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

	}
}
