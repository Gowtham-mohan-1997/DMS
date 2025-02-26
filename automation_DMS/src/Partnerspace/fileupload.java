package Partnerspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Partnerspace_pages;
import DMS_page.login_page;
import DMS_page.utility;
import common_function.common_function;

public class fileupload extends common_function {
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_uploadfile_onuploadbutton() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, Partnerspace_pages.class);

		// Partnerspace_pages.document.click();
		utility.clickWithWait(Partnerspace_pages.document);

		Thread.sleep(1000);
		Partnerspace_pages.partnerspace.click();
		Thread.sleep(1000);
		Partnerspace_pages.projectsearch.sendKeys("Testingauto");
		Thread.sleep(500);
		Partnerspace_pages.projectsearch.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Partnerspace_pages.projectfoldetclick.click();
	Thread.sleep(1000);

		Partnerspace_pages.search.sendKeys("foldersub8");
		Thread.sleep(1000);
		Partnerspace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Partnerspace_pages.clickfoldertitle.click();
		Thread.sleep(1000);
		

		for (int i = 0; i < 10; i++) {
			try {
				Partnerspace_pages.upload.click();
				Thread.sleep(500);
				Partnerspace_pages.files.click();
				Thread.sleep(500);
				Partnerspace_pages.fileupload.sendKeys("/home/gautham/Downloads/gowtham.txt");
		
			
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		String actualdata = Partnerspace_pages.actualelement.getText();
		System.out.println(actualdata);
//		String expecteddata = "1/1 File(s) uploaded successfully";
//		Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());

	}
}
