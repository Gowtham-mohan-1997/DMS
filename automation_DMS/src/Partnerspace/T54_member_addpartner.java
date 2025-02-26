package Partnerspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Partnerspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T54_member_addpartner extends common_function{

public void login_userui() throws InterruptedException {
	PageFactory.initElements(driver, login_page.class);
	login_page.username.sendKeys(properties.getProperty("username"));
	Thread.sleep(1000);
	login_page.password.sendKeys(properties.getProperty("password"));
	Thread.sleep(1000);
	login_page.login.click();
}

@Test
public void s1_addpartner_member() throws InterruptedException {

	login_userui();
	PageFactory.initElements(driver, Partnerspace_pages.class);
	for (int i = 0; i < 60; i++) {
		try {

			Partnerspace_pages.document.click();

			break;
		} catch (Exception f) {
			Thread.sleep(1000);
		}

	}
	Partnerspace_pages.partnerspace.click();
	Thread.sleep(1000);
	Partnerspace_pages.projectsearch.sendKeys(properties.getProperty("projectname"));
	Thread.sleep(500);
	Partnerspace_pages.projectsearch.sendKeys(Keys.ENTER);
	Thread.sleep(500);
	Partnerspace_pages.projectfoldetclick.click();
	Thread.sleep(500);
	Partnerspace_pages.member.click();
	Thread.sleep(1000);
	Partnerspace_pages.partner.click();
	Thread.sleep(500);
	Partnerspace_pages.partnerAdduser.click();
	Thread.sleep(500);
	Partnerspace_pages.partnerfilter.click();
	Thread.sleep(500);
	Partnerspace_pages.partnerfiltersearch.sendKeys(properties.getProperty("partner"));
	Thread.sleep(500);
	Partnerspace_pages.partnerfiltersearch.sendKeys(Keys.ENTER);
	Thread.sleep(500);
	Partnerspace_pages.userclick.click();
	Thread.sleep(500);
	Partnerspace_pages.adduserinproject.click();
	Thread.sleep(500);
	Partnerspace_pages.projextclick.click();
	Thread.sleep(500);
	Partnerspace_pages.saveinmember.click();
	Thread.sleep(500);
	String actualdata =Partnerspace_pages.actualelement.getText();
	System.out.println(actualdata);
//	String expecteddata ="Member(s) added successfully.";
//	Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());




}
}
