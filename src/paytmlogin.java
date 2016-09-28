import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class paytmlogin {

	public static void main(String[] args){ 
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://paytm.com/");
driver.findElement(By.xpath(".//*[@id='user-detail']/div/div[3]/div[3]/div/div[1]/a[1]")).click();
driver.findElement(By.id("input_0")).sendKeys("satishchallagulla1@gmail.com");
driver.findElement(By.id("input_1")).sendKeys("9640217333");
driver.findElement(By.xpath(".//*[@id='loginForm']/div/md-content/button[1")).click();

	}
}


	


