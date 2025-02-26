package Projectspace;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DMS_page.Projectspace_pages;
import DMS_page.login_page;
import common_function.common_function;

public class T7_folder_rightclick_properties extends common_function{
	public void login_userui() throws InterruptedException {
		PageFactory.initElements(driver, login_page.class);
		login_page.username.sendKeys(properties.getProperty("username"));
		Thread.sleep(1000);
		login_page.password.sendKeys(properties.getProperty("password"));
		Thread.sleep(1000);
		login_page.login.click();
	}

	@Test
	public void s1_properties_onfolder() throws InterruptedException {

		login_userui();
		PageFactory.initElements(driver, Projectspace_pages.class);
		for (int i = 0; i < 60; i++) {
			try {

				Projectspace_pages.document.click();

		Projectspace_pages.Projectspace.click();

		Projectspace_pages.projectsearch.sendKeys(properties.getProperty("projectname1"));

		Projectspace_pages.projectsearch.sendKeys(Keys.ENTER);

		Projectspace_pages.projectfoldetclick.click();

		Projectspace_pages.search.sendKeys(properties.getProperty("searchname"));

		Projectspace_pages.search.sendKeys(Keys.ENTER);

		Actions action = new Actions(driver);
		action.contextClick(Projectspace_pages.clickfoldertitle).perform();

		Projectspace_pages.properties.click();
		Thread.sleep(500);
		String text = Projectspace_pages.propertiesdata.getText();
		System.out.println("text" + text);
		Projectspace_pages.advance.click();

		Projectspace_pages.advancediscription.sendKeys("advance");

		Projectspace_pages.advancediscriptionsave.click();
		Thread.sleep(1000);
		String actualdata =Projectspace_pages.actualelement.getText();
		System.out.println(actualdata);
		Projectspace_pages.closebutton.click();
		break;
			} catch (Exception f) {
				Thread.sleep(1000);
			}

		}
}
}
