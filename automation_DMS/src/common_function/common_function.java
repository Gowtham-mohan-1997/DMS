package common_function;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import com.aventstack.extentreports.model.Report;

import io.github.bonigarcia.wdm.WebDriverManager;



public class common_function {
//      final String ZAP_PROXY_ADDRESS="127.0.0.1";
//      final int ZAP_PROXY_PORT=8080;
//     static final String ZAP_API_KEY="lerlm0l2n7s9snbaqds2qgfpvf";
//     private ClientApi api;
//     
		public static WebDriver driver=null;
		public static Properties properties=null;

		  //protected static ZAPutility zapUtility = new ZAPutility();
		  
	public static Properties loadpropertyfile() throws IOException  {
		FileInputStream fileinputstream =new FileInputStream("configure.properties");
		properties =new Properties();
		properties.load(fileinputstream);
		return properties;
	}

	@BeforeClass
	public void launchbrowser() throws IOException {
//String proxyserverurl=ZAP_PROXY_ADDRESS + ":" +ZAP_PROXY_PORT;
//Proxy proxy = new Proxy();
//proxy.setHttpProxy("127.0.0.1:8080"); // Set the appropriate port
//proxy.setSslProxy("127.0.0.1:8080"); // Set the appropriate port

loadpropertyfile();

		String browser =properties.getProperty("browser");

		String url =properties.getProperty("url");
		String location=properties.getProperty("driverlocation");
		
		WebDriverManager.chromedriver().setup();
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions ops=new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
//			ops.addArguments("--ignore-certificate-errors");
//		//		ops.addArguments("127.0.0.1=https://jrwtest.iqxora.com/#landing-page:8080");
//			ops.setProxy(proxy);
			System.setProperty("WebDriver.Chrome.Driver",location);
			driver=new 	ChromeDriver(ops);
//			ops.setCapability(CapabilityType.PROXY, proxy);
//			ops.setAcceptInsecureCerts(true);
		
		//	api =new ClientApi(ZAP_PROXY_ADDRESS, ZAP_PROXY_PORT ,ZAP_API_KEY);
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("WebDriver.Chrome.Driver",location);
			driver=new 	FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);




	}

	
	@AfterClass
	public void teardown(){
//		   zapUtility.stopZAP();
//		if (api != null) {
//			String title="iqxora security test";
//			String template="traditional-html";
//			String description="This is iqxora security test report";
//			String reportfilename="iqxora-ZAP-report-html";
//			String targetfolder=System.getProperty("user.dir");
//			try {
//				ApiResponse response =api.reports.generate(title, template, null,description, null,null,null,null,null,reportfilename,null, targetfolder,null);
//			System.out.println("ZAP report generate in this location:" + response.toString());
//			} catch (ClientApiException e) {
//				e.printStackTrace();
//				// TODO: handle exception
//			}
//			
//		}
	       driver.quit();

	 }








}
