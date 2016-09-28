import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;


public class CaptureScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



 



       WebDriver driver;

     //  @Before

      // public void setUp() throws Exception {

            FirefoxDriver driver1 = new FirefoxDriver();

            driver1.get("https://google.com");

     }

     //@After

    // public void tearDown() throws Exception {

            RemoteWebDriver driver;
		//	driver.quit();

     

 

    // @Test

    // public void test() throws IOException {

            // Code to capture the screenshot

//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            // Code to copy the screenshot in the desired location

//FileUtils.copyFile(scrFile, new File("C:\\CaptureScreenshot\\google.jpg"));                  

     



	}


