package DMS_page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class lookup_function {

	@FindBy(css= "div#my_share_list_content_wrapper span[class=\"k-icon k-i-arrow-s\"]")
	public static WebElement Shareclickbutton;

	@FindBy(css=".k-animation-container li")
	public static List<WebElement> Share;

	public static void selectLookupValue(String value)
	{

		//if(Share!=null) {
			for (WebElement e : Share) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}
	@FindBy(css=".k-animation-container li")
	public static List<WebElement> Share1;

	public static void selectLookupValue1(String value)
	{

		//if(Share!=null) {
			for (WebElement e : Share) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}


	@FindBy(css=".k-animation-container li")
	public static List<WebElement> quick;

	public static void selectLookupall(String value)
	{

		//if(Share!=null) {
			for (WebElement e : quick) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}
	@FindBy(css=".k-animation-container li")
	public static List<WebElement> file;

	public static void selectLookupfile(String value)
	{

		//if(Share!=null) {
			for (WebElement e : file) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}

	@FindBy(css=".k-animation-container li")
	public static List<WebElement> folder;

	public static void selectLookupfolder(String value)
	{

		//if(Share!=null) {
			for (WebElement e : folder) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}
	@FindBy(css=".k-animation-container li")
	public static List<WebElement> department;

	public static void selectLookupdepartment(String value)
	{

		//if(Share!=null) {
			for (WebElement e : department) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}
	@FindBy(css=".k-animation-container li")
	public static List<WebElement> mostshared;

	public static void selectLookupmostshared(String value)
	{

		//if(Share!=null) {
			for (WebElement e : mostshared) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}
	@FindBy(css=".k-animation-container li")
	public static List<WebElement> mostpopular;

	public static void selectLookupmostpopular(String value)
	{

		//if(Share!=null) {
			for (WebElement e : mostpopular) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}
	@FindBy(css=".k-animation-container li")
	public static List<WebElement> itemnameasc;

	public static void selectLookupitemnameasc(String value)
	{

		//if(Share!=null) {
			for (WebElement e : itemnameasc) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}
	@FindBy(css=".k-animation-container li")
	public static List<WebElement> itemnamedsc;

	public static void selectLookupitemnamedsc(String value)
	{

		//if(Share!=null) {
			for (WebElement e : itemnamedsc) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}
	@FindBy(css =".k-animation-container li")
	public static List<WebElement> group;

	public static void selectLookupgroup(String value)
	{

		if(group!=null) {
			for (WebElement e : group) {
				if (e.getText().trim().contains(value))

				{
					e.click();
					break;
				}
			}
		}

	}
}

