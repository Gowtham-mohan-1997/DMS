package DMS_page;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_function.common_function;

public class utility extends common_function {
	public static void clickWithWait(WebElement ele) throws InterruptedException {

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

                wait.until(ExpectedConditions.elementToBeClickable(ele));


                for (int i = 0; i < 20; i++) {

                    try {
                        ele.click();
                        break;

                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                        Thread.sleep(1000);
                    }

                }
}

	
	public static void randomnumber() {
		 Random rand = new Random();
		   
	   int num = rand.nextInt(10);
	}
	
}
