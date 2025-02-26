package Projectspace;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Projectspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T4_create_folder_using_createbutton_toprightcorner extends common_function{

	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
			}

	@Test
	public void s1_createfolder() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, Projectspace_pages.class);
		for (int i = 0; i < 20; i++) {
			try {

				Projectspace_pages.document.click();



		Projectspace_pages.Projectspace.click();

		Projectspace_pages.projectsearch.sendKeys(properties.getProperty("projectname1"));

		Projectspace_pages.projectfoldetclick.click();

		Projectspace_pages.create.click();

		Projectspace_pages.folder.click();

		Projectspace_pages.foldername.sendKeys(properties.getProperty("foldername"));

		Projectspace_pages.save.click();
		Thread.sleep(1000);
		String actualdata=Projectspace_pages.actualelement.getText();
		System.out.println(actualdata);
		String expecteddata="folder created successfully.";
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());
		break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}


	}
}
