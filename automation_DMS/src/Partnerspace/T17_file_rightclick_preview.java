package Partnerspace;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.Partnerspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T17_file_rightclick_preview extends common_function {
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_preview_onfile() throws InterruptedException {

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
		Thread.sleep(1000);
		Partnerspace_pages.projectsearch.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Partnerspace_pages.projectfoldetclick.click();
		Thread.sleep(1000);
		Partnerspace_pages.search.sendKeys(properties.getProperty("searchname"));
		Thread.sleep(1000);
		Partnerspace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Partnerspace_pages.folderclick.click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.contextClick(Partnerspace_pages.filepdf1).perform();
		Thread.sleep(1000);
		Partnerspace_pages.filepreview.click();
		Thread.sleep(1000);
		System.out.println("start");
		driver.switchTo().frame(driver.findElement(By.tagName("object")));

		driver.findElement(By.id("btn_preview_back")).click();
		driver.switchTo().defaultContent();
		// js.executeScript("alert('document');
		System.out.println("end");
		// pdf

	}
}
