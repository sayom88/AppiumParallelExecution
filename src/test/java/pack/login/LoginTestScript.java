package pack.login;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class LoginTestScript extends UserBaseTest{

	
	 private IOSDriver driver_ios;
	 private AndroidDriver driver_and;
	 DesiredCapabilities capabilities_local;
	 private String sTestCaseName;
	 private int iTestCaseRow;
	 
	 public String uname;
	 public String password;
	 public String text_uname;
	 public String text_pwd;
	 
	 @BeforeClass
	 private void createDriver() throws MalformedURLException, UnsupportedEncodingException {
		 try
		 {
			 
			 /*
		 capabilities_local = new DesiredCapabilities("appWaitActivity",null,null);
		  capabilities_local.setCapability("automationName", "Appium");
  		capabilities_local.setCapability("platformVersion", "5.1.1"); 
  		capabilities_local.setCapability("deviceName","Galaxy J2");
  		capabilities_local.setCapability("platformName","Android");
  		//capabilities_local.setCapability("app","C:\\Users\\IBM_ADMIN\\AppData\\Local\\Android\\android-sdk\\platform-tools\\nes.apk");
  		
//          capabilities_local.setCapability("appPackage", "com.ibm.mobility.asset4");
  //        capabilities_local.setCapability("appActivity","com.ibm.mobility.asset4.CordovaApp");
          capabilities_local.setCapability("appPackage","loginapp.android.javacodegeeks.com.loginapp");
          capabilities_local.setCapability("appActivity","loginapp.android.javacodegeeks.com.loginapp.MainActivity");

          
   		driver_and = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities_local);
  	
  		driver_and.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
           System.out.println("The Current Local Device capabilities are1: \n" + driver_and.getCapabilities().asMap());
           Thread.sleep(6000);
           
           */
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }		  
		  
	 }
	 
	 @Test
	    public void registration1() throws Exception {
	        try{
	        
	        	Thread.sleep(1000);
	        	
	        	
	        	uname="Username:";
	        	password="Password:";
	        	
	        	
	WebElement text=driver_and.findElement(By.xpath("//android.widget.TextView[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/textView2']"));
	         	text_uname=text.getAttribute("text");
	        	
	WebElement text1=driver_and.findElement(By.xpath("//android.widget.TextView[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/textView3']"));
	         	 text_pwd=text1.getAttribute("text");
	         	
	         //	System.out.println("UNAME:"+text_uname);
	        	//System.out.println("PWD:"+text_pwd);
	        	
	        	if ((uname.equals(text_uname)) && (password.equals(text_pwd)))
	        	{
	        		System.out.println("SUCCESS:: USERNAME AND PASSWORD MATCHES....!!!!");

		        	//Username
		        	//driver_and.findElement(By.xpath("//android.widget.EditText[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/usernameET']")).click();
		        	driver_and.findElement(By.xpath("//android.widget.EditText[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/usernameET']")).sendKeys("admin1");
		        	
		        	Thread.sleep(1000);
		        	//Password
		        	driver_and.findElement(By.xpath("//android.widget.EditText[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/passwordET']")).click();
		        	driver_and.findElement(By.xpath("//android.widget.EditText[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/passwordET']")).sendKeys("admin");
		        	
		        	
		        	driver_and.navigate().back();
		        	
		        	Thread.sleep(1000);
		        	
		        	//Login
		        	driver_and.findElement(By.xpath("//android.widget.Button[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/loginBtn']")).click();
		        	
	        		
	        	}
	        	else
	        	{
	        		
	        		// THROWS EXPECTEPTION AS THERE IS A SCREEN VALIDATION FAILURE BETWEEN EXPECTED & ACTUAL SCREEN USERNAME & PASSWORD FIELD VALUE
	        		throw new Exception();
	        	}
	        
	        }catch(Exception e)
	        {
	        	
	        	 //throw(e);
	        	
	    
	        	//e.printStackTrace();
	        	
	        	System.out.println("INTO EXCEPTION:");
	        	System.out.println("***************************************************************************");
        		System.out.println("FAILURE:: THERE IS A MISMATCH BETWEEN THE EXPECTED AND ACTUAL SCREEN USERNAME AND PASSWORD FIELD VALUES.");
        		System.out.println("***************************************************************************");
        		System.out.println("***************************************************************************");
        		System.out.println("EXPECTED USERNAME VALUE-> "+uname);
        		System.out.println("ACTUAL SCREEN USERNAME VALUE->"+text_uname);
        		System.out.println("***************************************************************************");
        		System.out.println("***************************************************************************");
        		System.out.println("EXPECTED PASSWORD VALUE->"+password);
        		System.out.println("ACTUAL SCREEN PASSWORD VALUE->"+text_pwd);
        		
	        	
	        	throw(e);
	        }
	        
	 }
	        
}
