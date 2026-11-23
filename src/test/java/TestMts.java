import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMts extends BaseTest {

    @Test
    public void testHeading() {
        MainPage mainPage = new MainPage(driver);
        mainPage.coockiClic();
        String actualResult = mainPage.getHeading();
        System.out.println(actualResult);
        assertEquals("онлайн пополнение без комиссии", normalizeWhitespace(actualResult),
                "заголовок не соответствует");
    }

    @Test
    public void testPaymentSystems() {
        MainPage mainPage = new MainPage(driver);
        mainPage.coockiClic();
        assertTrue(mainPage.checkPaymentSystems(), "платежные системы не отображаются");
    }

    @Test
    public void testVisa() {
        MainPage mainPage = new MainPage(driver);
        mainPage.coockiClic();
        assertTrue(mainPage.checkVisa(), "Visa не отображается");
    }

    @Test
    public void testVisa2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.coockiClic();
        assertTrue(mainPage.checkVisa2(), "Visa не отображается");
    }

    @Test
    public void testMasterCard() {
        MainPage mainPage = new MainPage(driver);
        mainPage.coockiClic();
        assertTrue(mainPage.checkMasterCard(), "MasterCard не отображается");
    }

    @Test
    public void testMasterCardSecureCode() {
        MainPage mainPage = new MainPage(driver);
        mainPage.coockiClic();
        assertTrue(mainPage.checkMasterCardSecureCode(), "MasterCardSecureCode не отображается");
    }

    @Test
    public void testBelcard() {
        MainPage mainPage = new MainPage(driver);
        mainPage.coockiClic();
        assertTrue(mainPage.checkBelcard(), "Belcard не отображается");
    }

    @Test
    public void testMoreDetailed() {
        MainPage mainPage = new MainPage(driver);
        mainPage.coockiClic().clickButtonMoreDetailed();
        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
                mainPage.getCurrentUrl(), "неверный переход");
    }

    @Test
    public void testButtonNext() {
        String phoneNumber = "(29)777-77-77";
        String rub = "100";
        MainPage mainPage = new MainPage(driver);
        mainPage.coockiClic().numberPhone(phoneNumber).rubSum(rub).next();
        assertEquals(phoneNumber, driver.findElement(By.cssSelector("#connection-phone")).getAttribute("value"));
        assertEquals(rub, driver.findElement(By.cssSelector("#connection-sum")).getAttribute("value"));
        assertTrue(waitForElementIsVisible(By.cssSelector("form#pay-connection button[data-method='krok']")));
        assertTrue(waitForElementIsVisible(By.cssSelector("form#pay-connection button[data-method='card']")));
    }

    private String normalizeWhitespace(String value) {
        return value.replaceAll("[^\\p{L}\\p{N}]+", " ").trim().toLowerCase(java.util.Locale.ROOT);
    }

    private boolean waitForElementIsVisible(By locator) {
        try {
            wait.until(webDriver -> webDriver.findElement(locator).isDisplayed());
            return true;
        } catch (org.openqa.selenium.TimeoutException exception) {
            return false;
        }
    }
}
