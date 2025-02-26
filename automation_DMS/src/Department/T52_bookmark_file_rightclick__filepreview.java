package Department;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Department_pages;
import DMS_page.login_page;
import DMS_page.lookup_function;
import DMS_page.utility;
import common_function.common_function;

public class T52_bookmark_file_rightclick__filepreview extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_bookmark_file_filepreviewk() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, Department_pages.class);
		PageFactory.initElements(driver, lookup_function.class);
		PageFactory.initElements(driver, utility.class);
		for (int i = 0; i < 60; i++) {
			try {

				Department_pages.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}

		Department_pages.department.click();
		Thread.sleep(2000);
		utility.clickWithWait(Department_pages.bookmark);
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.contextClick(Department_pages.bookmarkfileclick1).perform();

		utility.clickWithWait(Department_pages.bookmarkfilepreview);

		System.out.println("start");
        driver.switchTo().frame(driver.findElement(By.tagName("object")));

        driver.findElement(By.id("btn_preview_back")).click();
        driver.switchTo().defaultContent();
        //js.executeScript("alert('document');
        System.out.println("end");
        // pdf


	}
}
