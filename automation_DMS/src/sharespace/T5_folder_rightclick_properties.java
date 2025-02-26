package sharespace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T5_folder_rightclick_properties extends common_function {
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_check_properties_onfolder() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, MyFiles_page.class);
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
				sharespace_pages.properties.click();
				Thread.sleep(1000);
				String text = sharespace_pages.propertiesdata.getText();
				System.out.println("text" + text);
				sharespace_pages.advance.click();

				sharespace_pages.advancediscription.sendKeys("advance");

				sharespace_pages.advancediscriptionsave.click();
				Thread.sleep(1000);
				String actualdata = sharespace_pages.actualelement.getText();
				System.out.println(actualdata);
				sharespace_pages.closebutton.click();
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
	}
}
