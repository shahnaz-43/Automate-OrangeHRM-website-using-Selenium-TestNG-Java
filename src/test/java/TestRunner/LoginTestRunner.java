package TestRunner;

import Pages.LoginPage;
import Setup.Setup;
import org.testng.annotations.Test;

public class LoginTestRunner extends Setup {


    @Test
    public void doLogin(){
        LoginPage loginpage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginpage.doLogin("Admin","admin123");
    }
}
