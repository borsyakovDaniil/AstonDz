import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private final By cooki = By.cssSelector("button#cookie-agree");
    private final By heading = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > h2");
    private final By paymentSystems = By.cssSelector("div.pay__partners, footer .partner-list");
    private final By visa = By.cssSelector("img[alt='Visa'], img[alt='VISA']");
    private final By visa2 = By.cssSelector("img[alt='Verified By Visa'], img[alt='Visa'], img[alt='VISA']");
    private final By masterCard = By.cssSelector("img[alt='MasterCard']");
    private final By masterCardSecureCode = By.cssSelector("img[alt='MasterCard Secure Code'], img[alt='MasterCard']");
    private final By belCard = By.cssSelector("img[alt='Белкарт'], img[alt='BELKART']");
    private final By buttonMoreDetailed = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > a");
    private final By phone = By.cssSelector("input.phone#connection-phone");
    private final By sumRub = By.cssSelector("input#connection-sum");
    private final By buttonNext = By.cssSelector("div.pay__forms form#pay-connection button.button.button__default");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage coockiClic() {
        if (!driver.findElements(cooki).isEmpty()) {
            waitAndClick(cooki);
        }
        return this;
    }

    public String getHeading() {
        return waitAndGetText(heading);
    }

    public boolean checkPaymentSystems() {
        return waitForElementIsVisible(paymentSystems);
    }

    public boolean checkVisa() {
        return waitForElementIsVisible(visa);
    }

    public boolean checkVisa2() {
        return waitForElementIsVisible(visa2);
    }

    public boolean checkMasterCard() {
        return waitForElementIsVisible(masterCard);
    }

    public boolean checkMasterCardSecureCode() {
        return waitForElementIsVisible(masterCardSecureCode);
    }

    public boolean checkBelcard() {
        return waitForElementIsVisible(belCard);
    }

    public MainPage clickButtonMoreDetailed() {
        waitAndClick(buttonMoreDetailed);
        return this;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public MainPage numberPhone(String phone) {
        waitClearAndType(this.phone, phone);
        return this;
    }

    public MainPage rubSum(String sum) {
        waitClearAndType(this.sumRub, sum);
        return this;
    }

    public MainPage next() {
        waitAndClick(buttonNext);
        return this;
    }
}
