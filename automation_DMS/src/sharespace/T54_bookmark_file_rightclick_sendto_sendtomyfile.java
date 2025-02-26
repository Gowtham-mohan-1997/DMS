package sharespace;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.lookup_function;
import DMS_page.sharespace_pages;
import DMS_page.utility;
import common_function.common_function;

public class T54_bookmark_file_rightclick_sendto_sendtomyfile  extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_bookmark_file_sendtomyfile() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, sharespace_pages.class);
		PageFactory.initElements(driver, lookup_function.class);
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
		Thread.sleep(2000);
		sharespace_pages.bookmark.click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.contextClick(sharespace_pages.bookmarkfileclick1).perform();

		utility.clickWithWait(sharespace_pages.bookmarkfilesendto);

		utility.clickWithWait(sharespace_pages.bookmarkfilesendtomyfile);

		utility.clickWithWait(sharespace_pages.bookmarkfiledepartmentfolderclick);

		utility.clickWithWait(sharespace_pages.bookmarkfilesendbutton);

		Thread.sleep(3000);
		String actualdata = sharespace_pages.actualelement.getText();
		String expecteddata = "File sharedTo :Myfiles successfully.";
		System.out.println(actualdata);
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

	}

}
