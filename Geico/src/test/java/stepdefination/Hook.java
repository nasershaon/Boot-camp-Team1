package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import testhomepage.TestHomePage;

public class Hook extends TestHomePage {

    @Given("I am at Gieco HomePage")
    public void i_am_at_Gieco_HomePage() {
        // Write code here that turns the phrase above into concrete actions
    getLocalDriver("windows","chrome");
    driver.get("https://www.geico.com/");
    driver.manage().window().maximize();
    }



    @Then("Browser close")
    public void browser_close() {
        // Write code here that turns the phrase above into concrete actions
    driver.close();
    }

}
