package sharespace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T7_folder_rightclick_createfolder extends common_function {
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_createfolder_usingdropdown_onfolder() throws InterruptedException {

		login_userui();

		PageFactory.initElements(driver, sharespace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				sharespace_pages.document.click();

				sharespace_pages.Sharespace.click();

				sharespace_pages.search.sendKeys(properties.getProperty("searchname"));

				sharespace_pages.search.sendKeys(Keys.ENTER);
				Thread.sleep(500);
				Actions action = new Actions(driver);
				action.contextClick(sharespace_pages.clickfoldertitle).perform();
				Thread.sleep(500);
				sharespace_pages.dropdownfoldercreate.click();

				sharespace_pages.foldercreatename.sendKeys(properties.getProperty("foldername1"));

				sharespace_pages.savebutton.click();
				Thread.sleep(1000);
				String actualdata = sharespace_pages.actualelement.getText();
				System.out.println(actualdata);
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

	}
}
