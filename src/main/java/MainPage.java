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

    //Услуги связи
    private final By phoneNumber = By.cssSelector("input#connection-phone");

    public String checkphoneNumber() {
        return getAttribute(phoneNumber, "placeholder");
    }

    private final By summa = By.cssSelector("input#connection-sum");

    public String checkSumma() {
        return getAttribute(summa, "placeholder");
    }

    private final By email = By.cssSelector("input#connection-email");

    public String checkEmail() {
        return getAttribute(email, "placeholder");
    }

    //кнопка выпадающего списка
    private final By buttonDropDownList = By.cssSelector("div.select__wrapper button.select__header");

    public MainPage clickButtonDropDownList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonDropDownList));
        waitAndClick(buttonDropDownList);
        return this;
    }

    //список
    private final By listDropDown = By.cssSelector("ul.select__list");


    //метод для нажатия на кнопку по тексту
    public MainPage selectByText(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonDropDownList));
        waitAndClick(buttonDropDownList);
        By liLocator = By.xpath("//li[contains(@class,'select__item') and .//p[contains(text(),'" + text + "')]]");
        wait.until(ExpectedConditions.elementToBeClickable(liLocator));
        waitAndClick(liLocator);
        return this;
    }


    public MainPage clickButtonByNumber(int number) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonDropDownList));
        waitAndClick(buttonDropDownList);
        wait.until(ExpectedConditions.visibilityOfElementLocated(listDropDown));
        By liLocator = By.cssSelector("li.select__item:nth-child(" + number + ")");
        wait.until(ExpectedConditions.elementToBeClickable(liLocator));
        waitAndClick(liLocator);
        return this;
    }

    //домашний интернет
    private final By internetNumberPhone = By.cssSelector("input#internet-phone");

    public String getinternetNumberPhone() {
        return getAttribute(internetNumberPhone, "placeholder");
    }

    private final By sumHomeInternet = By.cssSelector("input#internet-sum.total_rub");

    public String getSumHomeInternet() {
        return getAttribute(sumHomeInternet, "placeholder");
    }

    private final By emailInternetHome = By.cssSelector("input#internet-email");

    public String getEmailInternetHome() {
        return getAttribute(emailInternetHome, "placeholder");
    }

    //рассрочка
    private final By accountNumber = By.cssSelector("input#score-instalment");

    public String getAccountNumber() {
        return getAttribute(accountNumber, "placeholder");
    }

    private final By instalmentSum = By.cssSelector("input#instalment-sum");

    public String getInstalmentSum() {
        return getAttribute(instalmentSum, "placeholder");
    }

    private final By emailInstallmentPlan = By.cssSelector("input#instalment-email");

    public String getEmailInstallmentPlan() {
        return getAttribute(emailInstallmentPlan, "placeholder");
    }

    //задолженность
    private final By scoreArrears = By.cssSelector("input#score-arrears");

    public String getScoreArrears() {
        return getAttribute(scoreArrears, "placeholder");
    }

    private final By arrearsSum = By.cssSelector("input#arrears-sum");

    public String getArrearsSum() {
        return getAttribute(arrearsSum, "placeholder");
    }

    private final By arrearsEmail = By.cssSelector("input#arrears-email");

    public String getArrearsEmail() {
        return getAttribute(arrearsEmail, "placeholder");
    }
    //iframe

// переход в iframe
    public PaymentFramePage switchToPaymentFrame(){
        WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe.payment-widget-iframe")));
        driver.switchTo().frame(iframe);
        return new PaymentFramePage(driver);
    }
}

