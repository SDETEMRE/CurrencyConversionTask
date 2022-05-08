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
        basePage.countryListBtn.click();
        Thread.sleep(3000);
        basePage.selectCountry(country).click();
//        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", basePage.selectCountry(country));
//        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", basePage.selectCountry(country));
        Thread.sleep(3000);
    }

    @Then("option should be changed to the respective default currency for that country")
    public void option_should_be_changed_to_the_respective_default_currency_for_that_country() {

        System.out.println(basePage.currency.getText());
        Assert.assertEquals("UAH",basePage.currency.getText());
    }


}
