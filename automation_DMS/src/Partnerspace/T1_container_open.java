package Partnerspace;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Partnerspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T1_container_open extends common_function {

	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
			}

	@Test
	public void s1_partnerspace_verify_isopen() throws InterruptedException {

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
	}

}
