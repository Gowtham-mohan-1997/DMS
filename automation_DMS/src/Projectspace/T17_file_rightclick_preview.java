package Projectspace;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Projectspace_pages;
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
		Thread.sleep(1000);
		Projectspace_pages.folderclick.click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.contextClick(Projectspace_pages.filepdf2).perform();
		Thread.sleep(1000);
		Projectspace_pages.filepreview.click();
		Thread.sleep(1000);
		System.out.println("start");
		driver.switchTo().frame(driver.findElement(By.tagName("object")));

		driver.findElement(By.id("btn_preview_back")).click();
		driver.switchTo().defaultContent();
		// js.executeScript("alert('document');
		System.out.println("end");
		// pdf
		break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
	}
}
