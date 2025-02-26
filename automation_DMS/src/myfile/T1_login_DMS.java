package myfile;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.login_page;
import common_function.common_function;

public class T1_login_DMS extends common_function {

	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();

	}

	@Test(invocationCount = 2)
	public void S1_login_ui() throws InterruptedException {
		login_userui();

	}

}
