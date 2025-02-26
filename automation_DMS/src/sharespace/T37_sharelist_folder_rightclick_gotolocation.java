package sharespace;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T37_sharelist_folder_rightclick_gotolocation extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_sharelist_gotolocation() throws InterruptedException {

		login_userui();

		PageFactory.initElements(driver, sharespace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				sharespace_pages.document.click();
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

		sharespace_pages.Sharespace.click();
		Thread.sleep(1000);
		sharespace_pages.sharelist.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(sharespace_pages.foldersharelist).perform();
		Thread.sleep(500);
		sharespace_pages.gotolocation.click();
		Thread.sleep(500);
		String actualdata =sharespace_pages.filenameingotolocation.getText();
		System.out.println(actualdata);


}
}
