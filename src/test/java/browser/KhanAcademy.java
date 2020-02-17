package browser;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class KhanAcademy {
	public static void main(String[] args) throws MalformedURLException {
		  // TODO Auto-generated method stub
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "abc");
		  cap.setCapability("platformName", "android");
		  cap.setCapability("appPackage","com.google.android.youtube");
		  cap.setCapability("appActivity", "com.google.android.youtube.HomeActivity");
		  
		  //cap.setCapability("appPackage","org.khanacademy.android");
		  //cap.setCapability("appActivity", "org.khanacademy.android.ui.library.MainActivity");
		  
		  //cap.setCapability("app", "C:\\Users\\Home\\Downloads\\Khan Academy_v6.3.0_apkpure.com.apk");
		  AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.findElement(MobileBy.AccessibilityId("Search")).click();
		  driver.findElement(MobileBy.id("com.google.android.youtube:id/search_edit_text")).sendKeys("selenium");
		  driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"selenium tutorial for beginners\")")).click();
				  


driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
Dimension d = driver.manage().window().getSize();
while(driver.findElements(MobileBy.AccessibilityId("Selenium Training | TestNG Framework For Selenium | Selenium Tutorial For Beginners | Edureka - 2 hours, 19 minutes - - edureka! - 122K views - 2 years ago - play video")).size()==0)
  {
   driver.executeScript("mobile:shell",ImmutableMap.of("command","input swipe "+d.width/2+" "+3*d.height/4+" "+d.width/2+" "+d.height/4));
  }
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
}
