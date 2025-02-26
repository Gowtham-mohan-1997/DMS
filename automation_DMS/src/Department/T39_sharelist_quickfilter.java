package Department;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Department_pages;
import DMS_page.login_page;
import DMS_page.lookup_function;
import common_function.common_function;

public class T39_sharelist_quickfilter extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_sharelist_quickfilter  () throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, Department_pages.class);
		PageFactory.initElements(driver, lookup_function.class);
		for (int i = 0; i < 60; i++) {
			try {

				Department_pages.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		Thread.sleep(2000);
		Department_pages.department.click();
	    Thread.sleep(1000);
	    Department_pages.sharelist.click();
	    Thread.sleep(500);
	    Department_pages.qucikfilter.click();
	    Thread.sleep(500);
	    lookup_function.selectLookupall("Resource Type: All");
	    String actualdata1 =Department_pages.getdatainsharelistinquickfilter.getText();
	    System.out.println(actualdata1);
	    Thread.sleep(1000);
	    Department_pages.qucikfilter.click();
	    Thread.sleep(500);
	    lookup_function.selectLookupfile("Resource Type: File");
	    String actualdata2 =Department_pages.getdatainsharelistinquickfilter.getText();
	    System.out.println(actualdata2);
	    Thread.sleep(1000);
	    Department_pages.qucikfilter.click();
	    Thread.sleep(500);
	    lookup_function.selectLookupfolder("Resource Type:Folder");
	    String actualdata3 =Department_pages.getdatainsharelistinquickfilter.getText();
	    System.out.println(actualdata3);
	    Thread.sleep(1000);
	}
}
