import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ace2threelogin {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.ace2three.com/");
driver.findElement(By.id("userid")).sendKeys("challagulla1");
driver.findElement(By.id("passwordlogindum")).sendKeys("ch_sati123");
driver.findElement(By.xpath(".//*[@id='signin_submit']")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath(".//*[@id='header']/div/div/a")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


	}

}
