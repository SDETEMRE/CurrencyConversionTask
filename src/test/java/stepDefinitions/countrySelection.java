package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.BasePage;
import utilities.Driver;

public class countrySelection {

    BasePage basePage = new BasePage();

    @When("the user selects {string}")
    public void the_user_selects(String country) throws InterruptedException {
        basePage.countrySelectionBtn.click();
        Thread.sleep(2000);
        basePage.countryListBtn.click();
        Thread.sleep(3000);
        basePage.selectCountry(country).click();
        Thread.sleep(3000);
    }

    @Then("option should be changed to the respective default currency for that country")
    public void option_should_be_changed_to_the_respective_default_currency_for_that_country() throws InterruptedException {

        System.out.println(basePage.currency.getText());
        Thread.sleep(2000);
        Assert.assertEquals("BGN",basePage.currency.getText());
    }

}
