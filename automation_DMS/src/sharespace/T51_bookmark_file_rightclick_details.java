package sharespace;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.lookup_function;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T51_bookmark_file_rightclick_details  extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_bookmark_file_details() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, sharespace_pages.class);
		PageFactory.initElements(driver, lookup_function.class);
		for (int i = 0; i < 60; i++) {
			try {

				sharespace_pages.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

		sharespace_pages.Sharespace.click();

		sharespace_pages.bookmark.click();

		Actions action = new Actions(driver);
		action.contextClick(sharespace_pages.bookmarkfileclick1).perform();

		sharespace_pages.bookmarkfiledetails.click();
		Thread.sleep(1000);
		String data =sharespace_pages.bookmarkfiledetailsdata.getText();

		System.out.println(data);
	}

}
