package Partnerspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Partnerspace_pages;
import DMS_page.login_page;
import DMS_page.lookup_function;
import DMS_page.utility;
import common_function.common_function;

public class T70_bookmark_file_rightclick_createremainder extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_bookmark_file_createremainder() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, Partnerspace_pages.class);
		PageFactory.initElements(driver, lookup_function.class);
		PageFactory.initElements(driver, utility.class);
		for (int i = 0; i < 60; i++) {
			try {

				Partnerspace_pages.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

		Partnerspace_pages.partnerspace.click();

		Partnerspace_pages.projectsearch.sendKeys(properties.getProperty("projectname"));

		Partnerspace_pages.projectsearch.sendKeys(Keys.ENTER);

		Partnerspace_pages.projectfoldetclick.click();
		Thread.sleep(1000);
		Partnerspace_pages.bookmark.click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.contextClick(Partnerspace_pages.bookmarkfileclick1).perform();

		utility.clickWithWait(Partnerspace_pages.bookmarkfileremainter);

		Partnerspace_pages.bookmarkfileremaintertext.sendKeys(properties.getProperty("remaimdername1"));

		utility.clickWithWait(Partnerspace_pages.bookmarkfileremaintersave);
		Thread.sleep(1000);
		String actualdata = Partnerspace_pages.actualelement.getText();
	//	String expecteddata = "Reminder created successfully";
		System.out.println(actualdata);
		//Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

	}
}
