package Partnerspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Partnerspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T42_bookmark_folder_rightclick_uploadfile extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_bookmark_uploadfile() throws InterruptedException {

		login_userui();
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
		Thread.sleep(500);
		Partnerspace_pages.bookmark.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(Partnerspace_pages.bookmarkfolderclick).perform();
		Thread.sleep(500);
		Partnerspace_pages.uploadfileonbookmark.click();
		Thread.sleep(500);
		Partnerspace_pages.fileupload.sendKeys("/home/gautham/Documents/11-801-24-06007.pdf");
		Thread.sleep(500);
		String actualdata =Partnerspace_pages.actualelement.getText();
		System.out.println(actualdata);
		String expecteddata="1/1 File(s) uploaded successfully";
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());










}
}
