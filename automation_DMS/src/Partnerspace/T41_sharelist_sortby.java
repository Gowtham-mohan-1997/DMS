package Partnerspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Partnerspace_pages;
import DMS_page.login_page;
import DMS_page.lookup_function;
import common_function.common_function;

public class T41_sharelist_sortby extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_sharelist_sortby() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, Partnerspace_pages.class);
		PageFactory.initElements(driver, lookup_function.class);
		for (int i = 0; i < 60; i++) {
			try {

				Partnerspace_pages.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		Thread.sleep(2000);
		Partnerspace_pages.partnerspace.click();
	    Thread.sleep(1000);
	    Partnerspace_pages.projectsearch.sendKeys(properties.getProperty("projectname"));
		Thread.sleep(500);
	    Partnerspace_pages.projectsearch.sendKeys(Keys.ENTER);
	    Thread.sleep(500);
		Partnerspace_pages.projectfoldetclick.click();
		Thread.sleep(500);
	    Partnerspace_pages.sharelist.click();
	    Thread.sleep(500);
	    Partnerspace_pages.sortby.click();
	    Thread.sleep(500);
	    lookup_function.selectLookupmostshared("Most Shared");
	    String actualdata1 =Partnerspace_pages.getdatainsharelistinquickfilter.getText();
	    System.out.println(actualdata1);
	    Thread.sleep(1000);
	    Partnerspace_pages.sortby.click();
	    Thread.sleep(500);
	    lookup_function.selectLookupmostpopular("Most Popular");
	    String actualdata2 =Partnerspace_pages.getdatainsharelistinquickfilter.getText();
	    System.out.println(actualdata2);
	    Thread.sleep(1000);
	    Partnerspace_pages.sortby.click();
	    Thread.sleep(500);
	    lookup_function.selectLookupitemnameasc("Item Name(Asc)");
	    String actualdata3 =Partnerspace_pages.getdatainsharelistinquickfilter.getText();
	    System.out.println(actualdata3);
	    Thread.sleep(1000);
	    Partnerspace_pages.sortby.click();
	    Thread.sleep(500);
	    lookup_function.selectLookupitemnamedsc("Item Name(Dsc)");
	    String actualdata4 =Partnerspace_pages.getdatainsharelistinquickfilter.getText();
	    System.out.println(actualdata4);
	    Thread.sleep(1000);
	}
}
