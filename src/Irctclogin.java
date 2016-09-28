import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Irctclogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.irctc.co.in/eticketing/home");
driver.manage().window().maximize();
driver.findElement(By.id("usernameId")).sendKeys("ch_sati");
driver.findElement(By.id("loginPassword")).sendKeys("");
	}

}
