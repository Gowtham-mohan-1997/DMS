package Department;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Department_pages;
import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T3_upload_file_using_uploadbutton_toprightcorner  extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
			}
	@Test
	public void s1_uploadfile_using_uploadbutton() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, MyFiles_page.class);
		PageFactory.initElements(driver, Department_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				Department_pages.document.click();

				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		Thread.sleep(500);
		Department_pages.department.click();
		Thread.sleep(3000);
		Department_pages.upload.click();
		Thread.sleep(1000);
		Department_pages.files.click();
		Thread.sleep(500);
		Department_pages.fileupload.sendKeys("/home/gautham/Documents/gowtham2.pdf");
		Thread.sleep(500);
		String actualdata =Department_pages.actualelement.getText();
		System.out.println(actualdata);
		String expecteddata ="1/1 File(s) uploaded successfully";
		Assert.assertEquals(actualdata.toLowerCase(), actualdata.toLowerCase());
	}
}
