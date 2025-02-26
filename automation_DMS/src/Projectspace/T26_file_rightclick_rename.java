package Projectspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DMS_page.Projectspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T26_file_rightclick_rename extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_rename_onfile() throws InterruptedException {

		login_userui();

		PageFactory.initElements(driver, Projectspace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				Projectspace_pages.document.click();
				break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}


		Projectspace_pages.Projectspace.click();
		Thread.sleep(1000);
		Projectspace_pages.projectsearch.sendKeys(properties.getProperty("projectname1"));
		Thread.sleep(500);
		Projectspace_pages.projectsearch.sendKeys(Keys.ENTER);
	    Thread.sleep(500);
	    Projectspace_pages.projectfoldetclick.click();
		Thread.sleep(1000);
		Projectspace_pages.create.click();
		Thread.sleep(500);
		Projectspace_pages.folder.click();
		Thread.sleep(500);
		Projectspace_pages.foldername.sendKeys(properties.getProperty("foldername4"));
		Thread.sleep(500);
		Projectspace_pages.save.click();
		Thread.sleep(500);
		Projectspace_pages.search.sendKeys(properties.getProperty("foldername4"));
		Thread.sleep(500);
		Projectspace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Projectspace_pages.folderclick.click();
		Thread.sleep(500);
		Projectspace_pages.upload.click();
		Thread.sleep(500);
		Projectspace_pages.files.click();
		Thread.sleep(500);
		Projectspace_pages.fileupload.sendKeys("/home/gautham/Documents/gowtham2.pdf");
		Thread.sleep(500);
		Projectspace_pages.filesinpartnerspace.click();
		Thread.sleep(500);
		Projectspace_pages.search.sendKeys(properties.getProperty("foldername4"));
		Thread.sleep(500);
		Projectspace_pages.search.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		Projectspace_pages.folderclick.click();
		Thread.sleep(500);
		Actions action = new Actions(driver);
        action.contextClick(Projectspace_pages.filepdf).perform();
        Thread.sleep(500);
        Projectspace_pages.renamedropdownonfile.click();
        Thread.sleep(500);
        Projectspace_pages.foldernameinrename.clear();
        Thread.sleep(500);
        Projectspace_pages.foldernameinrename.sendKeys(properties.getProperty("renamefile"));
        Thread.sleep(500);
        Projectspace_pages.savebuttononrename.click();
        Thread.sleep(1000);
        String actualdata =Projectspace_pages.actualelement.getText();
        System.out.println(actualdata);
        String expecteddata="File is renamed successfully.";
        Assert.assertEquals(actualdata.toLowerCase(), expecteddata.toLowerCase());
}

}
