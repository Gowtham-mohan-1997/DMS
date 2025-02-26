package Projectspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Projectspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T21_file_rightclick_sendto_sendtomyfiles extends common_function {
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_sendto_myfiles_onfile() throws InterruptedException {

		login_userui();

		PageFactory.initElements(driver, Projectspace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				Projectspace_pages.document.click();
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

		Projectspace_pages.Projectspace.click();
		Thread.sleep(1000);
		Projectspace_pages.projectsearch.sendKeys(properties.getProperty("projectname1"));
		Thread.sleep(500);
		Projectspace_pages.projectsearch.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Projectspace_pages.projectfoldetclick.click();
		Thread.sleep(1000);
		Projectspace_pages.search.sendKeys(properties.getProperty("searchname"));
		Thread.sleep(500);
		Projectspace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Projectspace_pages.folderclick.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(Projectspace_pages.filepdf).perform();
		Thread.sleep(500);
		Projectspace_pages.sendtodropdownonfile.click();
		Thread.sleep(500);
		Projectspace_pages.myfilessendto.click();
		Thread.sleep(500);
		Projectspace_pages.myfilesfolder.click();
		Thread.sleep(500);
		Projectspace_pages.sendbutton.click();
		Thread.sleep(500);
		String actualdata = Projectspace_pages.actualelement.getText();
		System.out.println(actualdata);
		String expecteddata = "File sharedTo :MyFiles successfully.";
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

	}
}
