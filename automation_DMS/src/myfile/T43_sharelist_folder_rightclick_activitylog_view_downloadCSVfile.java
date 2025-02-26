package myfile;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import DMS_page.lookup_function;
import common_function.common_function;

public class T43_sharelist_folder_rightclick_activitylog_view_downloadCSVfile extends common_function{

	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_sharelist_activitylog_view_downloadCSVfile  () throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, MyFiles_page.class);
		PageFactory.initElements(driver, lookup_function.class);
		for (int i = 0; i < 60; i++) {
			try {

				MyFiles_page.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		Thread.sleep(2000);
		MyFiles_page.myfile.click();
	    Thread.sleep(1000);
	    MyFiles_page.sharelist.click();
	    Thread.sleep(1000);
	    lookup_function.Shareclickbutton.click();
	    Thread.sleep(1000);
	    lookup_function.selectLookupValue("Shared By Me");
	    Thread.sleep(1000);
	    Actions action = new Actions(driver);
		action.contextClick(MyFiles_page.foldersharelist).perform();
		Thread.sleep(1000);
		MyFiles_page.activitylogsharelist.click();
		Thread.sleep(1000);
		MyFiles_page.activitylogdownloadbutton.click();
		Thread.sleep(1000);
		MyFiles_page.activitylogcsvownload.click();
		Thread.sleep(1000);
		MyFiles_page.closebuttonactivitylog.click();




	}
}
