package Appium_Licita;



import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculadora_ejemplo {
By nueve =By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]/android.widget.ImageView[15]");
By mas=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]/android.widget.ImageView[24]");
By cinco=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]/android.widget.ImageView[18]");
By igual=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]/android.widget.ImageView[28]\r\n"
		+ "");
WebDriver driver;
@BeforeClass
public void SetUp() {
	try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.PLATFORM_NAME, "android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		caps.setCapability("appPackage"," com.digitalchemy.calculator.freedecimal");
		caps.setCapability("appActivity","com.digitalchemy.calculator.droidphone.CalculatorMainActivity");
		caps.setCapability("noReset", true);
		caps.setCapability("noSign", true);
		caps.setCapability("autoGrantPermissions", true);
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new RemoteWebDriver(url,caps);
		
	} catch (Exception e) {System.out.println("ERROR en before class: "+e);}
		// TODO: handle exception
	}
@Test
private void test() {
	try {
		
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(nueve).click();
		driver.findElement(mas).click();
		driver.findElement(cinco).click();
		driver.findElement(igual).click();
	
		WebDriver augment= new Augmenter().augment(driver);
		File srcFile=((TakesScreenshot)augment).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("test.png"));
	} catch (Exception e) {System.out.println("Error en test: "+e);}
		// TODO: handle exception
	}
@AfterClass
public void testend() throws Exception{
	driver.quit();
}
	// TODO Auto-generated method stub

}