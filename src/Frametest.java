import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Frametest {
WebDriver driver;

@BeforeClass

public void setup(){
	
driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("file:///E:/sateesh/SeleniumTest/home.html");
driver.manage().window().maximize();
}
@Test

public void frame1HandleTest(){ 
	driver.switchTo().frame("myHeader");
	WebElement headerelement=driver.findElement(By.xpath("html/body/div/h3"));
	System.out.println(headerelement.getText());
	driver.switchTo().defaultContent();
	driver.switchTo().frame("myNavigation");
	driver.findElement(By.linkText("tree")).click();
	try{
		driver.findElement(By.linkText("Handle Alhghghert"));
	}
	catch(Exception e){
		System.out.println("Handle Alert link is not found");
	}
	finally{
		driver.switchTo().defaultContent();
	}
}

/*		Actions action = new Actions(driver);
	action.moveToElement(btn);
	action.build().perform();
	btn.click();
	System.out.println("Button Text: "+btn.getAttribute("value"));*/

@Test
public void frame2HandleTest(){
	driver.switchTo().frame("myDetail");
	WebElement selectelement = driver.findElement(By.id("mySelect"));
	Select select = new Select(selectelement);
	select.selectByVisibleText("option3");
	driver.switchTo().defaultContent();
}
@Test
public void frame3HandleTest(){
	driver.switchTo().frame("subFrame");
	driver.switchTo().frame("frameDetail");
	WebElement btn = driver.findElement(By.id("myBtn2"));
	System.out.println("Button Text: "+btn.getAttribute("value"));
}

	}
	





