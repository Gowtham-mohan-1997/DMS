package Projectspace;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Projectspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T14_folder_rightclick_share extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_share_onfolderdropdown() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, Projectspace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				Projectspace_pages.document.click();


		Projectspace_pages.Projectspace.click();

		Projectspace_pages.projectsearch.sendKeys(properties.getProperty("projectname1"));

		Projectspace_pages.projectsearch.sendKeys(Keys.ENTER);

		Projectspace_pages.projectfoldetclick.click();

		Projectspace_pages.search.sendKeys(properties.getProperty("searchname"));

		Projectspace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(Projectspace_pages.clickfoldertitle).perform();
		Thread.sleep(500);
		Projectspace_pages.sharedropdownfolder.click();
		Thread.sleep(500);

		try {
			Projectspace_pages.copylink.click();
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			Object data = clipboard.getData(DataFlavor.stringFlavor);
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("window.open(\"" + data + "\")");
			System.out.println(data);
			Thread.sleep(5000);
		} catch (UnsupportedFlavorException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}


		break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

}
}
