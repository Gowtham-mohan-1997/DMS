package myfile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.MyFiles_page;
import DMS_page.login_page;
import common_function.common_function;

public class T17_create_sdnote_using_createbuttom_toprightcorner extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();

	}

	@Test
	public void s1_create_sdnote_myfile() throws InterruptedException {

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
		MyFiles_page.create.click();
		Thread.sleep(500);
		MyFiles_page.sdnote.click();
		Thread.sleep(500);
		MyFiles_page.notename.sendKeys(properties.getProperty("sdnote"));
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
		MyFiles_page.sdnotesave.click();
		Thread.sleep(1000);
		String actualdata =MyFiles_page.actualelement.getText();
		System.out.println(actualdata);





	}

}
