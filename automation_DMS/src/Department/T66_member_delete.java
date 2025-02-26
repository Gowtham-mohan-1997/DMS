package Department;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Department_pages;
import DMS_page.login_page;
import DMS_page.utility;
import common_function.common_function;

public class T66_member_delete extends common_function {
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_member_delete() throws InterruptedException {

		login_userui();
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
		Department_pages.member.click();

		utility.clickWithWait(Department_pages.memberssearch);
		Thread.sleep(1000);
		Department_pages.memberssearch.sendKeys(properties.getProperty("user"));
		Thread.sleep(1000);
		Department_pages.memberssearch.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		utility.clickWithWait(Department_pages.membersdelete);

		utility.clickWithWait(Department_pages.membersdeletepopup);
		Thread.sleep(2000);
		String actualdata =Department_pages.actualelement.getText();
		System.out.println(actualdata);
		String expecteddata ="User deleted successfully.";
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());



	}
}
