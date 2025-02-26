package Partnerspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.Partnerspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T32_file_rightclick_fileactivitylog_verifiedcheckbox_isenable extends common_function {
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_fileactivitylog_verifiedcheckbox_isenable() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, MyFiles_page.class);
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
		Thread.sleep(1000);
		Partnerspace_pages.search.sendKeys(properties.getProperty("searchname"));
		Thread.sleep(500);
		Partnerspace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Partnerspace_pages.folderclick.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
		action.contextClick(Partnerspace_pages.filepdf).perform();
		Thread.sleep(500);
		Partnerspace_pages.fileactivitylog.click();
		Thread.sleep(2000);
		boolean fileactiononfile = Partnerspace_pages.fileactiononfile.isSelected();
		System.out.println(fileactiononfile);
		boolean fileshareactiononfile = Partnerspace_pages.fileshareactiononfile.isSelected();
		System.out.println(fileshareactiononfile);
		boolean fileannotationactiononfile = Partnerspace_pages.fileannotationactiononfile.isSelected();
		System.out.println(fileannotationactiononfile);
		boolean folderrecyclepinactionsonfile = Partnerspace_pages.folderrecyclepinactionsonfile.isSelected();
		System.out.println(folderrecyclepinactionsonfile);
		boolean fileeditactionsonfile = Partnerspace_pages.fileeditactionsonfile.isSelected();
		System.out.println(fileeditactionsonfile);
		boolean filesetteingactiononfile = Partnerspace_pages.filesetteingactiononfile.isSelected();
		System.out.println(filesetteingactiononfile);
		Partnerspace_pages.closeonfileactivitylog.click();

	}
}
