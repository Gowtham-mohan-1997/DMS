package myfile;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;
import io.reactivex.rxjava3.functions.Action;

public class T4_Upload_file_using_uploadbutton_toprightcorner extends common_function {

	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_Uploadfile_usinguploadbutton_myfile() throws InterruptedException {

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
		MyFiles_page.myfile.click();
		Thread.sleep(1000);
		MyFiles_page.search.sendKeys(properties.getProperty("searchname"));
		Thread.sleep(500);
		MyFiles_page.search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.doubleClick(MyFiles_page.folder).build().perform();
		
		Thread.sleep(500);
		MyFiles_page.upload.click();
		Thread.sleep(500);
		MyFiles_page.files.click();
		Thread.sleep(500);
		MyFiles_page.fileupload.sendKeys("/home/gautham/Documents/gowtham2.pdf");
		Thread.sleep(1000);
		String actualdata = MyFiles_page.actualelement.getText();
		String expecteddata ="1/1 File(s) uploaded successfully";
		System.out.println(actualdata);
		Assert.assertEquals(actualdata, expecteddata);

	}

}
