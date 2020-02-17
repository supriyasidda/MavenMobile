package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChromeBrowser {

	
@Test
public void youtube() throws MalformedURLException {
  // TODO Auto-generated method stub
  DesiredCapabilities cap = new DesiredCapabilities();
  cap.setCapability("deviceName", "abc");
  cap.setCapability("platformName", "android");
  //cap.setCapability("browserName", "chrome");
 // cap.setCapability("automationName", "android");
  cap.setCapability("app", "C:\\Users\\Home\\Downloads\\Khan Academy_v6.3.0_apkpure.com.apk");
 // cap.setCapability("chromedriverExecutable", "C:\\Users\\Home\\Downloads\\chromedriver.exe");
  AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//driver.get("http://google.com");

	//driver.findElement(MobileBy.xpath(" //input[@name='q']")).sendKeys("selenium");

/* driver.get("http://magento.com");
   driver.findElement(By.xpath("//*[@id=\"navbar\"]/button")).click();
   driver.findElement(By.partialLinkText("My Account")).click();
  // driver.findElement(By.id("email")).clear();
   driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com");
   driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcd");
   driver.findElement(By.id("send2")).click(); */
   
   

 }

	}

