package Partnerspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Partnerspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T2_create_project extends common_function {

	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
			}

	@Test
	public void s1_createproject() throws InterruptedException {

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
		Thread.sleep(1000);
		Partnerspace_pages.partnerspace.click();
		Thread.sleep(1000);
		Partnerspace_pages.createproject.click();
		Thread.sleep(500);
		Partnerspace_pages.createprojectnametextbox.sendKeys(properties.getProperty("projectfoldername"))	;
		Thread.sleep(500);
		Partnerspace_pages.calender.click();
		Thread.sleep(500);
		Partnerspace_pages.calenderdate.click();
		Thread.sleep(500);
		Partnerspace_pages.createprojectsave.click();
		Thread.sleep(1000);
		String actualdata =Partnerspace_pages.actualelement.getText();
		System.out.println(actualdata);
		Partnerspace_pages.projectsearch.sendKeys(properties.getProperty("projectfoldername"));
		Thread.sleep(1000);
		Partnerspace_pages.projectsearch.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Partnerspace_pages.projectfoldetclick.click();
		Thread.sleep(1000);
		Partnerspace_pages.create.click();
		Thread.sleep(500);
		Partnerspace_pages.folder.click();
		Thread.sleep(500);
		Partnerspace_pages.foldername.sendKeys(properties.getProperty("foldername7"));
		Thread.sleep(500);
		Partnerspace_pages.save.click();
		Thread.sleep(500);
//		String expecteddata ="Project created successfully.";
//		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

	}

}
