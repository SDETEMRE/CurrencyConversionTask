package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class currencyChanges {

    BasePage basePage = new BasePage();

    double defaultCurrency;

    @When("the default currencies display")
    public void the_default_currencies_display() {
        defaultCurrency = Double.parseDouble(basePage.offRate.getText().trim());
        System.out.println(basePage.offRate.getText());
    }

    @Then("currencies changes")
    public void currencies_changes() throws InterruptedException {
        System.out.println(basePage.offRate.getText());

        double newCurrency = Double.parseDouble(basePage.offRate.getText().trim());
        Thread.sleep(4000);
        Assert.assertNotEquals(defaultCurrency,newCurrency);
    }
}
