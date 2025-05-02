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

public class T63_bookmark_file_rightclick_sendto_sendtosharespace extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_bookmark_file_sendtosharespace() throws InterruptedException {

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
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.contextClick(Partnerspace_pages.filepdf).perform();

		utility.clickWithWait(Partnerspace_pages.bookmarkfilesendto);

		utility.clickWithWait(Partnerspace_pages.bookmarkfilesendtosharespace);
		Thread.sleep(1000);
		Partnerspace_pages.bookmarkfiledepartmentfolderclick.click();

		utility.clickWithWait(Partnerspace_pages.bookmarkfilesendbutton);

		Thread.sleep(3000);
		String actualdata = Partnerspace_pages.actualelement.getText();
//		String expecteddata = "file sharedto :share space successfully.";
//		System.out.println(actualdata);
//		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

	}
}
