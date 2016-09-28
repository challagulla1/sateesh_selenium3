import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Gmail {
	WebDriver driver;
	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	}
	@Test(dataProvider="assigned username and password")
	public void login(String username,String password){
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("next")).click();
	    driver.findElement(By.id("Passwd")).sendKeys(password);
	    driver.findElement(By.id("signIn")).click();
	    driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	    driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[3]/div[2]/a")).click();
	}
	@DataProvider(name="assigned username and password")
	public Object[][] getusernameandpassword() throws FileNotFoundException, IOException{
		Properties prop=new Properties();
		prop.load(new FileInputStream(new File("C:\\Users\\KEETECH\\Desktop\\sateesh\\testing\\myworkspace\\Seleniumtraining\\Gmail.properties")));
		String str= prop.getProperty("Email");
		String st=prop.getProperty("Passwd");
		String[][] string = new String[1][2];
		string[0][0]=str;
		string[0][1]=st;
	return string;
	}
	 }
		

