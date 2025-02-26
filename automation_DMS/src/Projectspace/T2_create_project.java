package Projectspace;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Projectspace_pages;
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
		PageFactory.initElements(driver, Projectspace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				Projectspace_pages.document.click();

				Projectspace_pages.Projectspace.click();

				Projectspace_pages.createproject.click();

				Projectspace_pages.createprojectnametextbox.sendKeys(properties.getProperty("projectfoldername"));
				Thread.sleep(1000);
				Projectspace_pages.calender.click();
				Thread.sleep(1000);
				Projectspace_pages.calenderdate.click();

				Projectspace_pages.createprojectsave.click();
				Thread.sleep(1000);
				String actualdata = Projectspace_pages.actualelement.getText();
				System.out.println(actualdata);
				String expecteddata = "Project created successfully.";
				Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

	}

}
