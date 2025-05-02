package myfile;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.login_page;
import common_function.common_function;

public class T1_login_DMS extends common_function {

	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();

	}

	@Test(priority=1)
	public void S1_login_ui() throws InterruptedException {
		
		PageFactory.initElements(driver, login_page.class);

		login_userui();
		Thread.sleep(5000);
//		login_page.cms.click();
//		Thread.sleep(2000);
//
//
//		String currenttab=driver.getWindowHandle();
//		
//		Set<String> alltab=driver.getWindowHandles();
//		
//		for(String tab:alltab) {
//			if(!tab.equals(currenttab)) {
//				driver.switchTo().window(tab);
//				break;
//			}
//		}
//		
//		login_page.cmslist.click();
//		Thread.sleep(10000);
//
	}

}
