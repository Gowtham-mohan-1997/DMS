package Partnerspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.Partnerspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T35_quicksearch extends common_function {
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
		PageFactory.initElements(driver, MyFiles_page.class);
		PageFactory.initElements(driver, Partnerspace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				Partnerspace_pages.document.click();
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

		Partnerspace_pages.partnerspace.click();
		Thread.sleep(1000);
		Partnerspace_pages.projectsearch.sendKeys(properties.getProperty("projectname"));
		Thread.sleep(500);
		Partnerspace_pages.projectsearch.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Partnerspace_pages.projectfoldetclick.click();
		Thread.sleep(1000);
		Partnerspace_pages.quicksearch.sendKeys(properties.getProperty("quicksearch"));
		Thread.sleep(500);
		Partnerspace_pages.quicksearch.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		String actualdata = Partnerspace_pages.filename.getText();
		System.out.println(actualdata);
//		String expecteddata="gowtham2.pdf";
//		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());
	}
}
