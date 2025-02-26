package sharespace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T32_file_rightclick_createremainder extends common_function{

		public void login_userui() throws InterruptedException {
			PageFactory.initElements(driver, login_page.class);
			login_page.username.sendKeys(properties.getProperty("username"));
			Thread.sleep(1000);
			login_page.password.sendKeys(properties.getProperty("password"));
			Thread.sleep(1000);
			login_page.login.click();
		}

		@Test
		public void s1_createremainder_onfile() throws InterruptedException {

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

			sharespace_pages.search.sendKeys(properties.getProperty("searchname"));

			sharespace_pages.search.sendKeys(Keys.ENTER);

			sharespace_pages.folderclick.click();
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			action.contextClick(sharespace_pages.filepdf).perform();

			sharespace_pages.createremainteronfile.click();

			sharespace_pages.createremainternametextbox.sendKeys(properties.getProperty("remaindername"));

			sharespace_pages.createremaintercalender.click();

			sharespace_pages.createremaintercalenderdata.click();

			sharespace_pages.createremaintersavebutton.click();
			Thread.sleep(1000);
			String actualdata =sharespace_pages.actualelement.getText();
			System.out.println(actualdata);

		}
}
