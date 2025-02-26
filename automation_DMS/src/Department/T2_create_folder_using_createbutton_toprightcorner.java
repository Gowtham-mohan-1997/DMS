package Department;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Department_pages;
import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T2_create_folder_using_createbutton_toprightcorner extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
			}
	@Test
	public void s1_create_folder_using_createbutton() throws InterruptedException {

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
		Thread.sleep(500);
		Department_pages.department.click();
		Thread.sleep(3000);
		Department_pages.create.click();
		Thread.sleep(500);
		Department_pages.folder.click();
		Thread.sleep(500);
		Department_pages.foldername.sendKeys(properties.getProperty("foldername"));
		Thread.sleep(500);
		Department_pages.save.click();
		Thread.sleep(500);
		String actualdata =Department_pages.actualelement.getText();
		System.out.println(actualdata);
		String expecteddata="Folder created successfully.";
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

	}

}
