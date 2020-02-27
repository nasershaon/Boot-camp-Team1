package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testhomepage.TestHomePage;

public class HomePageStepDefination extends TestHomePage {

    @Given("I am Clicking LeftMenuButton")
    public void i_am_Clicking_LeftMenuButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
   testLeftMenu();
    }

    @Given("I am Clicking Information")
    public void i_am_Clicking_Information() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testInformation();
    }

    @Given("I am Clicking Main menu Gaico home page")
    public void i_am_Clicking_Main_menu_Gaico_home_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testMainMenu();
    }

    @Given("I am Clicking GPS Button")
    public void i_am_Clicking_GPS_Button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testGps();
    }

    @Given("I am Clicking ZipCode Button and putting zip code")
    public void i_am_Clicking_ZipCode_Button_and_putting_zip_code() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        tesZipCode();
    }
    @Given("I am Clicking LogIn Button")
    public void i_am_Clicking_LogIn_Button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        tesLogIn();
    }
    @Given("I am Clicking Search Button")
    public void i_am_Clicking_Search_Button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        searchButton();
    }
    @Given("I am Clicking Test Vehicle Insurance Button")
    public void i_am_Clicking_Test_Vehicle_Insurance_Button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testVehicleInsurance();
    }
    @Given("I am Clicking Test Property Insurance Button")
    public void i_am_Clicking_Test_Property_Insurance_Button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testPropertyInsurance();
    }
    @Given("I am Clicking Test business Insurance Button")
    public void i_am_Clicking_Test_business_Insurance_Button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        businessInsurance();
    }
    @Given("I am Clicking additional Insurance Test additional Insurance link")
    public void i_am_Clicking_additional_Insurance_Test_additional_Insurance_link() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        additionalInsurance();
    }
    @Given("I am Clicking myAccount Test myAccount link")
    public void i_am_Clicking_myAccount_Test_myAccount_link() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        myAccount();
    }
    @Given("I am Clicking claims link")
    public void i_am_Clicking_claims_link() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        claims();
    }
    @Given("i am checking gaico homepage")
    public void i_am_checking_gaico_homepage() throws InterruptedException{
        // Write code here that turns the phrase above into concrete actions
        clickMainMenu();
    }


    @Given("im in gaoco homepage")
    public void imInGaocoHomepage() throws InterruptedException {
        clickOverallValue();
    }

    @Then("im press search button")
    public void imPressSearchButton() throws InterruptedException {

    }
}
