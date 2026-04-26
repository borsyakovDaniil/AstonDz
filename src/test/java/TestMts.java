import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class TestMts extends BaseTest {

    @Test
    public void testHeading() {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .coockiClic();
        String actualResult = mainPage.getHeading();
        System.out.println(actualResult);
        Assert.assertEquals("заголовок не соответствует", "Онлайн пополнение\n" + "без комиссии", actualResult);

    }

    @Test
    public void testPaymentSystems() {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .coockiClic();
        boolean actualResult = mainPage.checkPaymentSystems();
        Assert.assertTrue("платежные системы не отображаются", actualResult);
    }

    @Test
    public void testVisa() {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .coockiClic();
        boolean actualResult = mainPage.checkVisa();
        Assert.assertTrue("Visa не отображается", actualResult);
    }

    @Test
    public void testVisa2() {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .coockiClic();
        boolean actualResult = mainPage.checkVisa2();
        Assert.assertTrue("Visa не отображается", actualResult);
    }

    @Test
    public void testMasterCard() {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .coockiClic();
        boolean actualResult = mainPage.checkMasterCard();
        Assert.assertTrue("MasterCard не отображается", actualResult);
    }

    @Test
    public void testMasterCardSecureCode() {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .coockiClic();
        boolean actualResult = mainPage.checkMasterCardSecureCode();
        Assert.assertTrue("MasterCardSecureCode не отображается", actualResult);
    }

    @Test
    public void testBelcard() {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .coockiClic();
        boolean actualResult = mainPage.checkBelcard();
        Assert.assertTrue("Belcard не отображается", actualResult);
    }

    @Test
    public void testMoreDetailed() {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .coockiClic()
                .clickButtonMoreDetailed();
        Assert.assertEquals("не верный переход", mainPage.getCurrentUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }

    @Test
    public void testButtonNext() {
        String phoneNumber = "(29)777-77-77";
        String rub = "100";
        MainPage mainPage = new MainPage(driver);
        mainPage
                .coockiClic()
                .numberPhone(phoneNumber)
                .rubSum(rub)
                .next();
        Assert.assertEquals(phoneNumber, driver.findElement(By.cssSelector("#connection-phone")).getAttribute("value"));
        Assert.assertEquals(rub, driver.findElement(By.cssSelector("#connection-sum")).getAttribute("value"));
        Assert.assertTrue(driver.findElements(By.tagName("iframe")).size() > 0);
    }
}
