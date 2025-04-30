package Projectspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Projectspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T33_file_rightclick_fileactivitylog_clear_verifitycheckbox_isenable extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_fileactivitylog_clear_verifycheckbox_isenable() throws InterruptedException {

		login_userui();

		PageFactory.initElements(driver, Projectspace_pages.class);
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
		Thread.sleep(1000);
		Projectspace_pages.search.sendKeys(properties.getProperty("searchname"));
		Thread.sleep(500);
		Projectspace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Projectspace_pages.folderclick.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(Projectspace_pages.filepdf2).perform();
		Thread.sleep(500);
		Projectspace_pages.fileactivitylog.click();
		Thread.sleep(2000);
		Projectspace_pages.clearonfile.click();
		Thread.sleep(2000);
		boolean fileactiononfile = Projectspace_pages.fileactiononfile.isSelected();
		System.out.println(fileactiononfile);
		boolean fileshareactiononfile = Projectspace_pages.fileshareactiononfile.isSelected();
		System.out.println(fileshareactiononfile);
		boolean fileannotationactiononfile = Projectspace_pages.fileannotationactiononfile.isSelected();
		System.out.println(fileannotationactiononfile);
		boolean folderrecyclepinactionsonfile = Projectspace_pages.folderrecyclepinactionsonfile.isSelected();
		System.out.println(folderrecyclepinactionsonfile);
		boolean fileeditactionsonfile = Projectspace_pages.fileeditactionsonfile.isSelected();
		System.out.println(fileeditactionsonfile);
		boolean filesetteingactiononfile = Projectspace_pages.filesetteingactiononfile.isSelected();
		System.out.println(filesetteingactiononfile);
		Projectspace_pages.closeonfileactivitylog.click();

	}
}
