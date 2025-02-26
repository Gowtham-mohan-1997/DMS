package Department;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Department_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T35_advancesearch  extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_advancesearch() throws InterruptedException {

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
		Department_pages.advancesearchbutton.click();
		Thread.sleep(1000);
		Department_pages.advancesearchtextbox.sendKeys(properties.getProperty("advancesearch"));
		Thread.sleep(1000);
		Department_pages.advancesearchtextbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String actualdata1 =Department_pages.filename.getText();
		System.out.println(actualdata1);
		String expecteddata1 = "gowtham2.pdf";
		Assert.assertEquals(actualdata1.toLowerCase(), expecteddata1.toLowerCase());
		Department_pages.closebuttonadvancesearch.click();
		Thread.sleep(500);
		Department_pages.advancesearchbutton.click();
		Thread.sleep(500);
		Department_pages.advancesearchtextbox.sendKeys(properties.getProperty("advancesearchcontent"));
		Thread.sleep(500);
		Department_pages.advancesearchtextbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String actualdata2 =Department_pages.filename.getText();
		System.out.println(actualdata2);

}
}
