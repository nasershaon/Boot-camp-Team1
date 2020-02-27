package testhomepage;

import common.WebAPI;
import homepage.pageobject.HomePage;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class TestHomePage extends HomePage {

    public void getInitElements(){
        PageFactory.initElements(driver,HomePage.class);

    }
    @Test(priority=1)
    public void testEnglishUsButton() throws InterruptedException {

        getInitElements();
        driver.manage().window().maximize();
        clickEnglishUSButtton();
        sleepFor(2);
        clickSelectEnglish();
        sleepFor(2);
    }
}
