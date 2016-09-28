import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Freechargelogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.freecharge.in/desktop/");
driver.manage().window().maximize();
driver.findElement(By.xpath("html/body/div[2]/div/header/div/div[2]/div/a")).click();
driver.findElement(By.id("html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div[3]/div[2]/span[1]")).click();

	}

}
