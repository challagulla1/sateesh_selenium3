import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmaillogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");

driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("satishchallagulla1");
driver.findElement(By.id("next")).click();

driver.findElement(By.id("Passwd")).sendKeys("9640217333");
driver.findElement(By.id("signIn")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
driver.findElement(By.id("gb_71")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);






	}

}
