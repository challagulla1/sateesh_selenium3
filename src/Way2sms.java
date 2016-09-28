import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.gson.FieldAttributes;


public class Way2sms {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://site21.way2sms.com/content/index.html?");
driver.findElement(By.id("username")).sendKeys("9948222577");
driver.findElement(By.id("password")).sendKeys("9640217333");
driver.findElement(By.id("loginBTN")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath(".//*[@id='traphead']/div[1]/div/a")).click();


	}

}
