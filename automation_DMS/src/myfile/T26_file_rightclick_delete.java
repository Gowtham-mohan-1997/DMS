package myfile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T26_file_rightclick_delete extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_verify_delete_onfile() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, MyFiles_page.class);
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
		MyFiles_page.create.click();
		Thread.sleep(500);
		MyFiles_page.file.click();
		Thread.sleep(500);
		MyFiles_page.foldername.sendKeys(properties.getProperty("foldername6"));
		Thread.sleep(500);
		MyFiles_page.save.click();
		Thread.sleep(500);
		MyFiles_page.search.sendKeys(properties.getProperty("foldername6"));
		Thread.sleep(1000);
		MyFiles_page.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Actions action1 = new Actions(driver);
		action1.doubleClick(MyFiles_page.folder);
		action1.perform();
		Thread.sleep(500);
		MyFiles_page.upload.click();
		Thread.sleep(500);
		MyFiles_page.files.click();
		Thread.sleep(500);
		MyFiles_page.fileupload.sendKeys("/home/gautham/Documents/gowtham2.pdf");
		Thread.sleep(1000);
		MyFiles_page.filesinmyfile.click();
		Thread.sleep(1000);
		MyFiles_page.search.sendKeys(properties.getProperty("foldername6"));
		Thread.sleep(1000);
		MyFiles_page.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Actions action2= new Actions(driver);
		action2.doubleClick(MyFiles_page.folder);
		action2.perform();
		Thread.sleep(500);
		Actions action = new Actions(driver);
        action.contextClick(MyFiles_page.filepdf2).perform();
        Thread.sleep(500);
        MyFiles_page.deletefolder.click();
        Thread.sleep(500);
        MyFiles_page.deletepopup.click();
        Thread.sleep(500);
        String actualdata =MyFiles_page.actualelement.getText();
        System.out.println(actualdata);





	}
}
