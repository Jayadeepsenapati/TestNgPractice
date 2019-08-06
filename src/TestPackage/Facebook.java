package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class Facebook {
	public WebDriver driver;
  
  @BeforeMethod
  public void openBrowser()
  {
	  	ChromeOptions co=new ChromeOptions();
	  	co.addArguments("--disable-notifications");
	  	System.setProperty("webdriver.chrome.driver","E:\\mindq\\chromedriver.exe");
		driver=new ChromeDriver(co);
  }
  @Test
  public void login() 
  {
	  	driver.get("https://facebook.com");
	  	driver.manage().window().maximize();
	  	driver.findElement(By.name("email")).sendKeys("jayadeep.senapatii@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jayenj0y");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("pageLoginAnchor")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[contains(@data-gt,'menu_logout')]")).click();
		
	}

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.close();
  }

}
