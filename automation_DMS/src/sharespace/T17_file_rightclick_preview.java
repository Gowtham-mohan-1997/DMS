package sharespace;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T17_file_rightclick_preview extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_verifypreview_infile() throws InterruptedException {

		login_userui();

		PageFactory.initElements(driver, sharespace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				sharespace_pages.document.click();
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		sharespace_pages.Sharespace.click();
		Thread.sleep(1000);
		sharespace_pages.search.sendKeys(properties.getProperty("searchname"));
		Thread.sleep(500);
		sharespace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		sharespace_pages.folderclick.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
        action.contextClick(sharespace_pages.filepdf).perform();
        Thread.sleep(2000);
        sharespace_pages.filepreview.click();
        Thread.sleep(4000);
        System.out.println("start");
        driver.switchTo().frame(driver.findElement(By.tagName("object")));

        driver.findElement(By.id("btn_preview_back")).click();
        driver.switchTo().defaultContent();
        //js.executeScript("alert('document');
        System.out.println("end");
        // pdf
        if(  sharespace_pages.filepdf.isDisplayed()){

        	System.out.println("Element is Visible");

        	}else{

        	System.out.println("Element is InVisible");

        	}

        Thread.sleep(2000);

	}
}
