package Appium_Licita;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Iniciar_Sesion {

AppiumDriver<MobileElement> driver;
@BeforeClass
public void SetUp() {
	
	try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.PLATFORM_NAME, "android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "150");
		caps.setCapability("appPackage"," com.licitaciones.info");
		caps.setCapability("appActivity","com.licitaciones.info.MainActivity");
		caps.setCapability("noReset", true);
		caps.setCapability("noSign", true);
		caps.setCapability("autoGrantPermissions", true);
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, caps);
	} catch (Exception e) {System.out.println("jhon tester: "+e);}
		// TODO: handle exception
	}
@Test
private void test() {

	try {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");
		el1.click();
		  MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
		  el8.click();
		  el8.sendKeys("jhon.rojas@licitaciones.info");
		  //esperar 30 segundos para hacer clic en elcampo de contraseña
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Hacer clic en el campo de contraseña  y ingresar JHONrojas1234
	MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
		  el9.click();
		  el9.sendKeys("JHONrojas1234"); 
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");
//		el1.click();	
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]");
//		el2.click();
//		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.EditText");
//		el3.sendKeys("jhonjaderrojas1998@gmail.com");
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.widget.EditText");
//		el4.click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		el4.sendKeys("JHONrojas1234");
//		MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.widget.Button");
//		el5.click();

		
		
		WebDriver augment= new Augmenter().augment(driver);
		File srcFile=((TakesScreenshot)augment).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("Screenshot.png"));
	} catch (IOException e) {System.out.println("Error en test: "+e);}
		// TODO: handle exception
	 
	}
	
@AfterClass
public void testend() throws Exception{
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	driver.quit();
}
	// TODO Auto-generated method stub

}