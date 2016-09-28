import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class abhibuslogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://www.abhibus.com/");
driver.findElement(By.xpath(".//*[@id='AccLogin']/span/a")).click();
/*Alert alert=driver.switchTo().alert();
alert.accept();*/
driver.findElement(By.xpath(".//*[@id='EmailID']")).sendKeys("satishchallagulla1@gmail.com");
driver.findElement(By.id("LoginPassword")).sendKeys("9640217333");
driver.findElement(By.id("SignINAjx")).click();
driver.findElement(By.id("source")).sendKeys("Vijayawada");
driver.findElement(By.id("destination")).sendKeys("Bangalore");
driver.findElement(By.xpath(".//*[@id='ui-id-5']")).click();

	}

}
