import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }


    //принять куки
    private final By cooki = By.cssSelector("button#cookie-agree");

    public MainPage coockiClic() {
        waitAndClick(cooki);
        return this;
    }

    //заголовок
    private final By heading = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > h2");

    public String getHeading() {
        return waitAndGetText(heading);
    }

    //логотипы платежных систем
    private final By paymentSystems = By.cssSelector("div.pay__partners");
    private final By visa = By.cssSelector("div.pay__partners ul li img[alt='Visa'");
    private final By visa2 = By.cssSelector("div.pay__partners ul li img[alt= 'Verified By Visa'");
    private final By masterCard = By.cssSelector("div.pay__partners ul li img[alt= 'MasterCard'");
    private final By masterCardSecureCode = By.cssSelector("div.pay__partners ul li img[alt= 'MasterCard Secure Code'");
    private final By belCard = By.cssSelector("div.pay__partners ul li img[alt= 'Белкарт'");

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


    //ссылка подробнее о сервисе
    private final By buttonMoreDetailed = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > a");

    public MainPage clickButtonMoreDetailed() {
        waitAndClick(buttonMoreDetailed);
        return this;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    //локаторы для проверки кнопки продолжить

    private final By phone = By.cssSelector("input.phone#connection-phone");
    private final By sumRub = By.cssSelector("input#connection-sum");
    private final By buttonNext = By.cssSelector("div.pay__forms form#pay-connection button.button.button__default ");

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

