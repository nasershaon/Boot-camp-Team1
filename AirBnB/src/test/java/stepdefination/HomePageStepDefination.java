package stepdefination;


import homepage.pageobject.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import testhomepage.TestHomePage;

public class HomePageStepDefination extends TestHomePage {

    @Given("I am at AirBnB HomePage")
    public void i_am_at_AirBnB_HomePage() {
        // Write code here that turns the phrase above into concrete actions
        getLocalDriver("windows","chrome");
        driver.get("https://www.airbnb.com/");
        driver.manage().window().maximize();
    }

    @Given("I click On EnglishUs Button")
    public void i_click_On_EnglishUs_Button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath(xPathEnglishUsButton)).click();
    }

    @Then("I Select EnglishUs By click on it")
    public void i_Select_EnglishUs_By_click_on_it() {
        // Write code here that turns the phrase above into concrete actions
           driver.findElement(By.xpath(xPathSelectEnglish)).click();
    }


}
