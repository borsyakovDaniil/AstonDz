import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.awt.SystemColor.text;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By COOKIE = By.cssSelector("button#cookie-agree");
    private final By HEADING = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > h2");
    private final By PAYMENT_SYSTEMS = By.cssSelector("div.pay__partners");
    private final By VISA = By.cssSelector("div.pay__partners ul li img[alt='Visa'");
    private final By VISA_2 = By.cssSelector("div.pay__partners ul li img[alt= 'Verified By Visa'");
    private final By MASTER_CARD = By.cssSelector("div.pay__partners ul li img[alt= 'MasterCard'");
    private final By MASTER_CARD_SECURE_CODE = By.cssSelector("div.pay__partners ul li img[alt= 'MasterCard Secure Code'");
    private final By BEL_CARD = By.cssSelector("div.pay__partners ul li img[alt= 'Белкарт'");
    private final By BUTTON_MORE_DETAILED = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > a");
    private final By PHONE = By.cssSelector("input.phone#connection-phone");
    private final By SUM_RUB = By.cssSelector("input#connection-sum");
    private final By BUTTON_NEXT = By.cssSelector("div.pay__forms form#pay-connection button.button.button__default ");
    private final By PHONE_NUMBER = By.cssSelector("input#connection-phone");
    private final By SUMMA = By.cssSelector("input#connection-sum");
    private final By EMAIL = By.cssSelector("input#connection-email");
    private final By BUTTON_DROP_DOWN_LIST = By.cssSelector("div.select__wrapper button.select__header");
    private final By LIST_DROP_DOWN = By.cssSelector("ul.select__list");
    private final By INTERNET_NUMBER_PHONE = By.cssSelector("input#internet-phone");
    private final By SUM_HOME_INTERNET = By.cssSelector("input#internet-sum.total_rub");
    private final By EMAIL_INTERNET_HOME = By.cssSelector("input#internet-email");
    private final By ACCOUNTNUMBER = By.cssSelector("input#score-instalment");
    private final By INSTALMENT_SUM = By.cssSelector("input#instalment-sum");
    private final By EMAIL_INSTALLMENT_PLAN = By.cssSelector("input#instalment-email");
    private final By SCORE_ARREARS = By.cssSelector("input#score-arrears");
    private final By ARREARS_SUM = By.cssSelector("input#arrears-sum");
    private final By ARREARS_EMAIL = By.cssSelector("input#arrears-email");

    //принять куки
    public MainPage coockiClic() {
        waitAndClick(COOKIE);
        return this;
    }

    //заголовок
    public String getHeading() {
        return waitAndGetText(HEADING);
    }

    //логотипы платежных систем
    public boolean checkPaymentSystems() {
        return waitForElementIsVisible(PAYMENT_SYSTEMS);
    }

    public boolean checkVisa() {
        return waitForElementIsVisible(VISA);
    }

    public boolean checkVisa2() {
        return waitForElementIsVisible(VISA_2);
    }

    public boolean checkMasterCard() {
        return waitForElementIsVisible(MASTER_CARD);
    }

    public boolean checkMasterCardSecureCode() {
        return waitForElementIsVisible(MASTER_CARD_SECURE_CODE);
    }

    public boolean checkBelcard() {
        return waitForElementIsVisible(BEL_CARD);
    }


    //ссылка подробнее о сервисе
    public MainPage clickButtonMoreDetailed() {
        waitAndClick(BUTTON_MORE_DETAILED);
        return this;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    //проверки кнопки продолжить
    public MainPage numberPhone(String phone) {
        waitClearAndType(this.PHONE, phone);
        return this;
    }

    public MainPage rubSum(String sum) {
        waitClearAndType(this.SUM_RUB, sum);
        return this;
    }

    public MainPage next() {
        waitAndClick(BUTTON_NEXT);
        return this;
    }

    //Услуги связи
    public String checkphoneNumber() {
        return getAttribute(PHONE_NUMBER, "placeholder");
    }

    public String checkSumma() {
        return getAttribute(SUMMA, "placeholder");
    }

    public String checkEmail() {
        return getAttribute(EMAIL, "placeholder");
    }

    //кнопка выпадающего списка
    public MainPage clickButtonDropDownList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_DROP_DOWN_LIST));
        waitAndClick(BUTTON_DROP_DOWN_LIST);
        return this;
    }

    //метод для нажатия на кнопку по тексту
    public MainPage selectByText(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_DROP_DOWN_LIST));
        waitAndClick(BUTTON_DROP_DOWN_LIST);
        By liLocator = By.xpath("//li[contains(@class,'select__item') and .//p[contains(text(),'" + text + "')]]");
        wait.until(ExpectedConditions.elementToBeClickable(liLocator));
        waitAndClick(liLocator);
        return this;
    }

    public MainPage clickButtonByNumber(int number) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_DROP_DOWN_LIST));
        waitAndClick(BUTTON_DROP_DOWN_LIST);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LIST_DROP_DOWN));
        By liLocator = By.cssSelector("li.select__item:nth-child(" + number + ")");
        wait.until(ExpectedConditions.elementToBeClickable(liLocator));
        waitAndClick(liLocator);
        return this;
    }

    //домашний интернет
    public String getinternetNumberPhone() {
        return getAttribute(INTERNET_NUMBER_PHONE, "placeholder");
    }

    public String getSumHomeInternet() {
        return getAttribute(SUM_HOME_INTERNET, "placeholder");
    }

    public String getEmailInternetHome() {
        return getAttribute(EMAIL_INTERNET_HOME, "placeholder");
    }

    //рассрочка
    public String getAccountNumber() {
        return getAttribute(ACCOUNTNUMBER, "placeholder");
    }

    public String getInstalmentSum() {
        return getAttribute(INSTALMENT_SUM, "placeholder");
    }

    public String getEmailInstallmentPlan() {
        return getAttribute(EMAIL_INSTALLMENT_PLAN, "placeholder");
    }

    //задолженность
    public String getScoreArrears() {
        return getAttribute(SCORE_ARREARS, "placeholder");
    }

    public String getArrearsSum() {
        return getAttribute(ARREARS_SUM, "placeholder");
    }

    public String getArrearsEmail() {
        return getAttribute(ARREARS_EMAIL, "placeholder");
    }
    //iframe

    // переход в iframe
    public PaymentFramePage switchToPaymentFrame() {
        WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe.payment-widget-iframe")));
        driver.switchTo().frame(iframe);
        return new PaymentFramePage(driver);
    }
}

