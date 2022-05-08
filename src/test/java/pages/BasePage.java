package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id=\"currency-exchange-app\"]/div/div/div[2]/div[1]/form/div[1]/input")
    public WebElement sellBox;

    @FindBy(xpath = "//*[@id=\"currency-exchange-app\"]/div/div/div[2]/div[1]/form/div[3]/input")
    public WebElement buyBox;

    @FindBy(xpath = "//span[@class='dropup']")
    public WebElement countrySelectionBtn;

    @FindBy(id = "countries-dropdown")
    public WebElement countryListBtn;

    @FindBy(xpath = "(//span[@class='ng-binding ng-scope'])[1]")
    public WebElement currency;

    @FindBy(xpath = "//*[@id=\"currency-exchange-app\"]/div/div/div[2]/table/tbody/tr[1]/td[4]/span/span/span")
    public WebElement payseraAmount;

    @FindBy(xpath = "//*[@id=\"currency-exchange-app\"]/div/div/div[2]/table/tbody/tr[1]/td[5]/span/span/span[1]")
    public WebElement bankAmount;

    @FindBy(xpath = "//tr[1]//td[5]//span[starts-with(@class, 'other-bank-loss')]")
    public WebElement loss;

    public WebElement selectCountry(String country){
        return Driver.get().findElement(By.xpath("//a[contains(.,'"+country+"')]"));
    }

}
