package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FacebookLogin {
  @Test
  public void login() throws Exception
  {
	System.setProperty("webdriver.chrome.driver","E:\\mindq\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	Thread.sleep(3000);
	driver.findElement(By.name("email")).sendKeys("jayadeep.senapatii@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("jayenj0y");
	driver.findElement(By.xpath("//*[@value='Log In']")).click();
	Thread.sleep(30000);
	driver.close();
  
  }
}

