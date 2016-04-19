package pack.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTestScript extends UserBaseTest {

    public String uname;
    public String password;
    public String text_uname;
    public String text_pwd;

    @Test
    public void registration1() throws Exception {
        try {

            uname = "Username:";
            password = "Password:";


            WebElement text = getDriver().findElement(By.xpath("//android.widget.TextView[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/textView2']"));
            text_uname = text.getAttribute("text");

            WebElement text1 = getDriver().findElement(By.xpath("//android.widget.TextView[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/textView3']"));
            text_pwd = text1.getAttribute("text");

            if ((uname.equals(text_uname)) && (password.equals(text_pwd))) {
                System.out.println("SUCCESS:: USERNAME AND PASSWORD MATCHES....!!!!");

                //Username
                //getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/usernameET']")).click();
                getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/usernameET']")).sendKeys("admin1");

                Thread.sleep(1000);
                //Password
                getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/passwordET']")).click();
                getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/passwordET']")).sendKeys("admin");


                getDriver().navigate().back();

                Thread.sleep(1000);

                //Login
                getDriver().findElement(By.xpath("//android.widget.Button[@resource-id='loginapp.android.javacodegeeks.com.loginapp:id/loginBtn']")).click();


            } else {

                // THROWS EXPECTEPTION AS THERE IS A SCREEN VALIDATION FAILURE BETWEEN EXPECTED & ACTUAL SCREEN USERNAME & PASSWORD FIELD VALUE
                throw new Exception();
            }

        } catch (Exception e) {

            //throw(e);


            //e.printStackTrace();

            System.out.println("INTO EXCEPTION:");
            System.out.println("***************************************************************************");
            System.out.println("FAILURE:: THERE IS A MISMATCH BETWEEN THE EXPECTED AND ACTUAL SCREEN USERNAME AND PASSWORD FIELD VALUES.");
            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");
            System.out.println("EXPECTED USERNAME VALUE-> " + uname);
            System.out.println("ACTUAL SCREEN USERNAME VALUE->" + text_uname);
            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");
            System.out.println("EXPECTED PASSWORD VALUE->" + password);
            System.out.println("ACTUAL SCREEN PASSWORD VALUE->" + text_pwd);


            throw (e);
        }

    }

}
