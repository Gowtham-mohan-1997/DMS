package myfile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import DMS_page.lookup_function;
import common_function.common_function;

public class T51_bookmark_file_rightclick_move extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_sharewithme_openlink  () throws InterruptedException {

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
	    MyFiles_page.bookmark.click();
	    Actions action = new Actions(driver);
		action.contextClick(MyFiles_page.bookmarkfolderclick).perform();
		Thread.sleep(1000);
		MyFiles_page.bookmarkmove.click();
		MyFiles_page.searchmove.sendKeys(properties.getProperty("bookmarksearchmove"));
		Thread.sleep(500);
		MyFiles_page.searchmove.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		MyFiles_page.folderclick.click();
		Thread.sleep(500);
		MyFiles_page.movebutton.click();
		Thread.sleep(1000);
		String actualdata =MyFiles_page.actualelement.getText();
		String expecteddata ="successFiles/Folders moved successfully";
		System.out.println(actualdata);
	}
}
