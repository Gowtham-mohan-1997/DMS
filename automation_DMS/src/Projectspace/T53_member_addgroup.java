package Projectspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Projectspace_pages;
import DMS_page.login_page;
import DMS_page.lookup_function;
import common_function.common_function;

public class T53_member_addgroup  extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_Addgroup_inmember() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, Projectspace_pages.class);
		PageFactory.initElements(driver, lookup_function.class);
		for (int i = 0; i < 60; i++) {
			try {

				Projectspace_pages.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		Projectspace_pages.Projectspace.click();
		Thread.sleep(1000);
		Projectspace_pages.projectsearch.sendKeys(properties.getProperty("projectname1"));
		Thread.sleep(500);
		Projectspace_pages.projectsearch.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Projectspace_pages.projectfoldetclick.click();
		Thread.sleep(500);
		Projectspace_pages.member.click();
		Thread.sleep(1000);
		Projectspace_pages.group.click();
		Thread.sleep(1000);
		Projectspace_pages.Addgroup.click();
		Thread.sleep(1000);
		Projectspace_pages.selectgroup.click();
		Thread.sleep(1000);
		lookup_function.selectLookupgroup(properties.getProperty("group"));
		Thread.sleep(1000);
		Projectspace_pages.groupusersclick.click();
		Thread.sleep(1000);
		Projectspace_pages.Addprojectgroup.click();
		Thread.sleep(1000);
		Projectspace_pages.projectclickingroup.click();
		Thread.sleep(1000);
		Projectspace_pages.saveingroup.click();
		Thread.sleep(500);
		String actualdata =Projectspace_pages.actualelement.getText();
		System.out.println(actualdata);
		String expecteddata ="Group added successfully.";
		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

}
}
