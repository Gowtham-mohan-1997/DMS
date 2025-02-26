package DMS_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_page {
	@FindBy(id="login_username_txt")
	public static WebElement username;

	@FindBy(css = "div input[id=\"login_password_txt\"]")
	public static WebElement password;

	@FindBy(css="div a[id=\"login_signin_btn\"]")
	public static WebElement login;

}
