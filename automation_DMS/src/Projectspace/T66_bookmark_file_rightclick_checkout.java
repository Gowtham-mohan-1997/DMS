package Projectspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Projectspace_pages;
import DMS_page.login_page;
import DMS_page.lookup_function;
import DMS_page.utility;
import common_function.common_function;

public class T66_bookmark_file_rightclick_checkout extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_bookmark_file_checkoutandcheckin() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, Projectspace_pages.class);
		PageFactory.initElements(driver, lookup_function.class);
		PageFactory.initElements(driver, utility.class);
		for (int i = 0; i < 60; i++) {
			try {

				Projectspace_pages.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}


		Projectspace_pages.Projectspace.click();

		Projectspace_pages.projectsearch.sendKeys(properties.getProperty("projectname1"));

		Projectspace_pages.projectsearch.sendKeys(Keys.ENTER);

		Projectspace_pages.projectfoldetclick.click();
		Thread.sleep(1000);
		Projectspace_pages.bookmark.click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.contextClick(Projectspace_pages.bookmarkfileclick1).perform();

		utility.clickWithWait(Projectspace_pages.bookmarkfilecheckout);

		Thread.sleep(3000);

		Projectspace_pages.bookmark.click();

		Thread.sleep(3000);
		Actions action1 = new Actions(driver);
		action1.contextClick(Projectspace_pages.bookmarkfileclick1).perform();

		utility.clickWithWait(Projectspace_pages.bookmarkfileundocheckout);

		Thread.sleep(3000);
		String actualdata1 = Projectspace_pages.actualelement.getText();
		String expecteddata1 = "Undo check-out completed";
		System.out.println(actualdata1);
		Assert.assertEquals(actualdata1.toLowerCase(), expecteddata1.toLowerCase());


	}
}
