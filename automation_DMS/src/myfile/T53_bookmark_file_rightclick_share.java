package myfile;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import DMS_page.lookup_function;
import common_function.common_function;

public class T53_bookmark_file_rightclick_share extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_sharewithme_openlink() throws InterruptedException {

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
		MyFiles_page.bookmarkshare.click();
		Thread.sleep(1000);

		try {
			MyFiles_page.copylink.click();
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			Object data = clipboard.getData(DataFlavor.stringFlavor);
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.open(\"" + data + "\")");
			System.out.println(data);
			Thread.sleep(8000);
		} catch (UnsupportedFlavorException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}


	}
}
