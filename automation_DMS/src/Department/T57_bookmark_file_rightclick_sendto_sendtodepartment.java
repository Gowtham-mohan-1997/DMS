package Department;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Department_pages;
import DMS_page.login_page;
import DMS_page.lookup_function;
import DMS_page.utility;
import common_function.common_function;

public class T57_bookmark_file_rightclick_sendto_sendtodepartment extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_bookmark_file_sendtodepartment() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, Department_pages.class);
		PageFactory.initElements(driver, lookup_function.class);
		PageFactory.initElements(driver, utility.class);
		for (int i = 0; i < 60; i++) {
			try {

				Department_pages.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

		Department_pages.department.click();
		Thread.sleep(2000);
		Department_pages.bookmark.click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.contextClick(Department_pages.bookmarkfileclick1).perform();

		utility.clickWithWait(Department_pages.bookmarkfilesendto);

		utility.clickWithWait(Department_pages.bookmarkfilesendtodepartment);

		utility.clickWithWait(Department_pages.bookmarkfiledepartmentfolderclick);

		utility.clickWithWait(Department_pages.bookmarkfilesendbutton);

		Thread.sleep(3000);
		String actualdata = Department_pages.actualelement.getText();
		String expecteddata = "File sharedTo :Department successfully.";
		System.out.println(actualdata);
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

	}

}
