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

public class T29_file_rightclick_copy extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_copy_onfile() throws InterruptedException {

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
		Department_pages.moveandcopyonfile.click();
		Thread.sleep(500);
		Department_pages.movefolderonfile.click();
		Thread.sleep(500);
		Department_pages.copybuttononfile.click();
		Thread.sleep(500);
			String actualdata1 =Department_pages.actualelement.getText();
			System.out.println(actualdata1);
			String expecteddata1 ="file(s) copied successfully";
			Assert.assertEquals(actualdata1.toLowerCase(), expecteddata1.toLowerCase());



	}
}
