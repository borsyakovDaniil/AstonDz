import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentFramePage extends BasePage {

    public PaymentFramePage(WebDriver driver) {
        super(driver);
    }

    private final By SUM_HEADER = By.cssSelector("div.pay-description__cost"); //100.00 BYN
    private final By PHONE_HEADER = By.cssSelector("div.pay-description__text"); //Оплата: Услуги связи Номер:375297777777
    private final By NUMBER_CARD = By.cssSelector("#cc-number + label");
    private final By VALIDITY_PERIOD = By.cssSelector("div.content.ng-tns-c2312288139-4 input.date-input.ng-tns-c2312288139-4.ng-untouched.ng-pristine.ng-invalid + label");
    private final By CVC = By.cssSelector("div.content.ng-tns-c2312288139-5 label.ng-tns-c2312288139-5.ng-star-inserted");
    private final By FIRST_NAME_LAST_NAME = By.cssSelector("div.content.ng-tns-c2312288139-3 label.ng-tns-c2312288139-3.ng-star-inserted");
    private final By CARDS_BRANDS = By.cssSelector("div.icons-container.ng-tns-c2312288139-2");
    private final By BUTTON = By.cssSelector("button.colored.disabled");

    public String getSumHeder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(SUM_HEADER)).getText();
    }

    public String getPhoneHeder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(PHONE_HEADER)).getText();
    }

    public String getNumberCard() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(NUMBER_CARD)).getText();
    }

    public String getValidityPeriod() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(VALIDITY_PERIOD)).getText();
    }

    public String getCvc() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(CVC)).getText();
    }
    public String getFirstNameLastName(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(FIRST_NAME_LAST_NAME)).getText();
    }
    public boolean cardsBrandsVisible() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(CARDS_BRANDS));
        return driver.findElements(By.cssSelector("div.icons-container.ng-tns-c2312288139-2")).size() > 0;
    }

    public String getButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON)).getText();
    }

}
