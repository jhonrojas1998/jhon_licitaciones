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

public class Registrarme {

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
          //esperar 60 segundos para que se cargue la interfaz inicial 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//hacer clic en el boton de REGISTRAME POR 30 DIAS GRATIS
		 MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
		    el1.click();
		  //esperar 30 segundos para que se cargue la interfaz delformulario 
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  //hacer clic en el boton de seleccionar pais
		 MobileElement el2= (MobileElement) driver.findElementByXPath("//*[@text='Elige el país de interés:']");
		    el2.click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  //Escoger a panama
		 MobileElement el3 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.Button' and ./parent::*[@text='Panamá']]");
		    el3.click();
		    //Hcaer clci en la opcion de tratamiento
		 MobileElement el4 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='lici desplegar lista'] and ./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Tratamiento:']]]]]]]");
		    el4.click();
		    //Escoger señor
		 MobileElement el5 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.Button' and ./parent::*[@text='Sr.']]"); el5.click();
		 //Hacer clic en el boton de seleccionar 
		 MobileElement el6 = (MobileElement) driver.findElementByXPath("//*[@text='Seleccionar']");
		    el6.click();
		 //Hacer clic en el campo minombre  es  y ingresar jhon jader
		 MobileElement el7 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[./parent::*[./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Mi nombre es:']]]]]]]");
			  el7.sendKeys("jhon hader");
			//Hacer clic en el campo de correo electronico  y ingresar jhon.rojas@licitaciones.info
	     MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
			  el8.click();
			  el8.sendKeys("jhon.rojas@licitaciones.info");
			  //esperar 30 segundos para hacer clic en elcampo de contraseña
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Hacer clic en el campo de contraseña  y ingresar JHONrojas1234
		MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
			  el9.click();
			  el9.sendKeys("JHONrojas1234"); 
			//Hacer clic en el boton de mostrar contraseña
	     MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.widget.Button");
			  el10.click();
			  //Hacer clic en el boton siguiente
			  MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[9]/android.view.View/android.widget.Button");
			  el11.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[10]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
			  el12.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
			  el13.click();
			  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[11]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
			  el14.click();
			  el14.sendKeys("3126762317");
		 MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[12]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
			  el15.click();
			  el15.sendKeys("Medellin");
		 MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[13]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
			  el16.click();
			  el16.sendKeys("0346762317");
			  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[14]/android.view.View[2]/android.view.View[1]/android.widget.CheckBox/android.widget.Button");
			  el17.click();
			  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[15]/android.view.View/android.widget.Button");
			  el18.click();
		 

		WebDriver augment= new Augmenter().augment(driver);
		File srcFile=((TakesScreenshot)augment).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("Screenshot.png"));
	} catch (IOException e) {System.out.println("Error en test: "+e);}
		// TODO: handle exception
	 
	}



@AfterClass
public void testend() throws Exception{
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.quit();
}
	// TODO Auto-generated method stub

}



