package myfile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T36_quicksearch extends common_function{

	public String 	expectedfile="gowtham2.pdf";
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_quicksearch_onmyfile () throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, MyFiles_page.class);
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
	 Thread.sleep(2000);
		MyFiles_page.quicksearchbutton.sendKeys(properties.getProperty("quicksearch"));
		MyFiles_page.quicksearchbutton.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		String actualfile = MyFiles_page.filename.getText();
		System.out.println("actualfile : ->" + actualfile);
		if

		(actualfile.contains(expectedfile )) {
			System.out.println("filematch");
		}else {
			System.out.println("file not ,match");
		}




			}
}
