package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;

public class exchangeAmount {

    BasePage basePage = new BasePage();

    @When("the pays amount bigger than bank amount")
    public void the_pays_amount_bigger_than_bank_amount() {
        basePage.sellBox.clear();
        basePage.sellBox.sendKeys("500");

        double paysAmount = Double.parseDouble(basePage.paysAmount.getText().trim());
        double bankAmount =  Double.parseDouble(basePage.bankAmount.getText().trim());

        Assert.assertTrue(paysAmount>bankAmount);

    }

    @Then("the loss is displayed")
    public void the_loss_is_displayed() {
        double ExpectedLoss = Double.parseDouble(basePage.bankAmount.getText().trim())-
                Double.parseDouble(basePage.paysAmount.getText().trim());

        String loss = basePage.loss.getText().trim();
        double ActualLoss = Double.parseDouble(loss.substring(1,loss.length()-1));

        Assert.assertEquals(ExpectedLoss,ActualLoss,0.1);

    }

}
