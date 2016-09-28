import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Webmaillogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.keetechsoft.com:2095/");
driver.findElement(By.id("user")).sendKeys("sateesh_c@keetechsoft.com");
driver.findElement(By.id("pass")).sendKeys("samsungj7");
driver.findElement(By.id("login_submit")).click();
driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div[2]/table[1]/tbody/tr/td[2]/a[2]")).click();
	}

}
