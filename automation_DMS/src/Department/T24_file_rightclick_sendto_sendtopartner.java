package Department;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Department_pages;
import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T24_file_rightclick_sendto_sendtopartner extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}



		@Test
		public void s1_sendto_partner() throws InterruptedException {

			login_userui();
			PageFactory.initElements(driver, MyFiles_page.class);
			PageFactory.initElements(driver, Department_pages.class);
			for (int i = 0; i < 60; i++) {
				try {

					Department_pages.document.click();
					break;
				} catch (Exception f) {
					Thread.sleep(1000);
				}

			}
			Department_pages.department.click();
			Thread.sleep(1000);
			Department_pages.search.sendKeys(properties.getProperty("searchname"));
			Thread.sleep(500);
			Department_pages.search.sendKeys(Keys.ENTER);
			Thread.sleep(500);
			Department_pages.folderclick.click();
			Thread.sleep(500);
			Actions action = new Actions(driver);
			action.contextClick(MyFiles_page.filepdf).perform();
			Thread.sleep(500);
			Department_pages.sendtodropdownonfile.click();
			Thread.sleep(500);
			Department_pages.partnerproject.click();
			Thread.sleep(500);
			Department_pages.partnerprojectfolder.click();
			Thread.sleep(500);
			Department_pages.sendbutton.click();
			Thread.sleep(1000);
			String actualdata = MyFiles_page.actualelement.getText();
			System.out.println(actualdata);
			String expecteddata = "File sharedTo :Partner Space successfully.";
			Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());
		}


}
