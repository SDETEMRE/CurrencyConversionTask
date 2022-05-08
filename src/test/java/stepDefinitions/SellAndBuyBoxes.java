package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SellAndBuyBoxes {

    BasePage basePage = new BasePage();

    @Given("the user is in the webPage")
    public void the_user_is_in_the_webPage() {
        Driver.get().get(ConfigurationReader.get("url"));
        basePage.sellBox.clear();

    }

    @When("the user enters a value into the sell box and buy box returns empty")
    public void the_user_enters_a_value_into_the_sell_box_and_buy_box_returns_empty() {
        basePage.sellBox.sendKeys("200");
        Assert.assertTrue(basePage.buyBox.getAttribute("value").equals(""));
    }

    @Then("the user enters a value into the buy box the sell bux returns empty")
    public void the_user_enters_a_value_into_the_buy_box_the_sell_bux_returns_empty() {
        basePage.buyBox.sendKeys("200");
        Assert.assertTrue(basePage.sellBox.getAttribute("value").equals(""));

    }



}
