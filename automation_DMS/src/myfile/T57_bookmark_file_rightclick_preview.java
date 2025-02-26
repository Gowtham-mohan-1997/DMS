package myfile;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import DMS_page.lookup_function;
import DMS_page.utility;
import common_function.common_function;

public class T57_bookmark_file_rightclick_preview extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_bookmark_file_preview() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, MyFiles_page.class);
		PageFactory.initElements(driver, lookup_function.class);
		PageFactory.initElements(driver, utility.class);
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

		utility.clickWithWait(MyFiles_page.bookmark);
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.contextClick(MyFiles_page.bookmarkfileclick1).perform();

		utility.clickWithWait(MyFiles_page.bookmarkfilepreview);

		System.out.println("start");
        driver.switchTo().frame(driver.findElement(By.tagName("object")));

        driver.findElement(By.id("btn_preview_back")).click();
        driver.switchTo().defaultContent();
        //js.executeScript("alert('document');
        System.out.println("end");
        // pdf


	}
}
