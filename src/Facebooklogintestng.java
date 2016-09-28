import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Facebooklogintestng {
WebDriver driver;
public Facebooklogintestng(WebDriver driver){
	this.driver=driver;
	
}
public void login(String username,String password){
	driver.findElement(By.linkText("login")).click();
}
}
