import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentFramePage extends BasePage {

    public PaymentFramePage(WebDriver driver) {
        super(driver);
    }

    private final By sumHeder = By.cssSelector("div.pay-description__cost"); //100.00 BYN
    private final By phoneHeder = By.cssSelector("div.pay-description__text"); //Оплата: Услуги связи Номер:375297777777
    private final By numberCard = By.cssSelector("#cc-number + label");
    private final By validityPeriod = By.cssSelector("div.content.ng-tns-c2312288139-4 input.date-input.ng-tns-c2312288139-4.ng-untouched.ng-pristine.ng-invalid + label");
    private final By cvc = By.cssSelector("div.content.ng-tns-c2312288139-5 label.ng-tns-c2312288139-5.ng-star-inserted");
    private final By firstNameLastName = By.cssSelector("div.content.ng-tns-c2312288139-3 label.ng-tns-c2312288139-3.ng-star-inserted");
    private final By cardsBrands = By.cssSelector("div.icons-container.ng-tns-c2312288139-2");
    private final By button = By.cssSelector("button.colored.disabled");

    public String getSumHeder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sumHeder)).getText();
    }

    public String getPhoneHeder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(phoneHeder)).getText();
    }

    public String getNumberCard() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(numberCard)).getText();
    }

    public String getValidityPeriod() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(validityPeriod)).getText();
    }

    public String getCvc() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cvc)).getText();
    }
    public String getFirstNameLastName(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameLastName)).getText();
    }
    public boolean cardsBrandsVisible() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(cardsBrands));
        return driver.findElements(By.cssSelector("div.icons-container.ng-tns-c2312288139-2")).size() > 0;
    }

    public String getButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(button)).getText();
    }

}
