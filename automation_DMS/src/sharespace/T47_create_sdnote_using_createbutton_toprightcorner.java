package sharespace;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.login_page;
import DMS_page.sharespace_pages;
import common_function.common_function;

public class T47_create_sdnote_using_createbutton_toprightcorner extends common_function {
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_create_sdnote() throws InterruptedException {

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
		sharespace_pages.folderclick.click();

		Thread.sleep(1000);

		for (int i = 0; i < 20; i++) {
			try {
				sharespace_pages.create.click();
				sharespace_pages.sdnote.click();
		Thread.sleep(500);
		break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
		sharespace_pages.sdnotenamed.sendKeys(properties.getProperty("sdnote"));
		Thread.sleep(500);

			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.k-content")));

			//System.out.println("fkdf:"+driver.findElement(By.tagName("body")).getSize());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "arguments[0].innerHTML='Hotmail'";
		WebElement ele=driver.findElement(By.tagName("body"));
		((JavascriptExecutor) driver).executeScript(script, ele);
		//js.executeScript("document.getElementsByClassName('k-content')[0].contentDocument.body.innerHTML=="+"'hcdgj'");

		driver.switchTo().defaultContent();
		Thread.sleep(500);
		sharespace_pages.sdnotesavebutton.click();
		Thread.sleep(1000);
		String actualdata =sharespace_pages.actualelement.getText();
		System.out.println(actualdata);


	}
}
