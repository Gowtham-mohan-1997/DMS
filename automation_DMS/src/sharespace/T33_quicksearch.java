package sharespace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T33_quicksearch extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_quicksearch() throws InterruptedException {

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
		sharespace_pages.quicksearch.sendKeys(properties.getProperty("quicksearch"));
		Thread.sleep(1000);
		sharespace_pages.quicksearch.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		String actualdata = sharespace_pages.filename.getText();
		System.out.println(actualdata);
		String expecteddata = "gowtham2 (1).pdf";
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());
}
}
