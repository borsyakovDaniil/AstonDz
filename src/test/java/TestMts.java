
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class TestMts extends BaseTest {

//    @Test
//    public void testHeading() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic();
//        String actualResult = mainPage.getHeading();
//        Assert.assertEquals("заголовок не соответствует", "Онлайн пополнение\n" + "без комиссии", actualResult);
//
//    }
//}

//    @Test
//    public void testPaymentSystems() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic();
//        boolean actualResult = mainPage.checkPaymentSystems();
//        Assert.assertTrue("платежные системы не отображаются", actualResult);
//    }
//
//    @Test
//    public void testVisa() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic();
//        boolean actualResult = mainPage.checkVisa();
//        Assert.assertTrue("Visa не отображается", actualResult);
//    }
//
//    @Test
//    public void testVisa2() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic();
//        boolean actualResult = mainPage.checkVisa2();
//        Assert.assertTrue("Visa не отображается", actualResult);
//    }
//
//    @Test
//    public void testMasterCard() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic();
//        boolean actualResult = mainPage.checkMasterCard();
//        Assert.assertTrue("MasterCard не отображается", actualResult);
//    }
//
//    @Test
//    public void testMasterCardSecureCode() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic();
//        boolean actualResult = mainPage.checkMasterCardSecureCode();
//        Assert.assertTrue("MasterCardSecureCode не отображается", actualResult);
//    }
//
//    @Test
//    public void testBelcard() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic();
//        boolean actualResult = mainPage.checkBelcard();
//        Assert.assertTrue("Belcard не отображается", actualResult);
//    }
//
//    @Test
//    public void testMoreDetailed() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic()
//                .clickButtonMoreDetailed();
//        Assert.assertEquals("не верный переход", mainPage.getCurrentUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
//    }
//
//    @Test
//    public void testButtonNext() {
//        String phoneNumber = "(29)777-77-77";
//        String rub = "100";
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic()
//                .numberPhone(phoneNumber)
//                .rubSum(rub)
//                .next();
//        Assert.assertEquals(phoneNumber, driver.findElement(By.cssSelector("#connection-phone")).getAttribute("value"));
//        Assert.assertEquals(rub, driver.findElement(By.cssSelector("#connection-sum")).getAttribute("value"));
//        Assert.assertTrue(driver.findElements(By.tagName("iframe")).size() > 0);
//    }
//
//    //ДЗ 2.10
//    //услуги связи
//
//    @Test
//    public void testUslugiNumber() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic();
//        String result = mainPage.checkphoneNumber();
//        Assert.assertEquals("error", "Номер телефона", result);
//    }
//
//    @Test
//    public void testSuma() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic();
//        String result = mainPage.checkSumma();
//        Assert.assertEquals("error", "Сумма", result);
//    }
//
//    @Test
//    public void testEmail() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic();
//        String actual = mainPage.checkEmail();
//        Assert.assertEquals("error", "E-mail для отправки чека", actual);
//    }
//
//    //домашний интернет
//    @Test
//    public void testInternetNumberPhone() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic()
//                .selectByText("Домашний интернет");
//        String result = mainPage.getinternetNumberPhone();
//        Assert.assertEquals("error", "Номер абонента", result);
//    }
//
//    @Test
//    public void testSumHomeInternet() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic()
//                .selectByText("Домашний интернет");
//        String result = mainPage.getSumHomeInternet();
//        Assert.assertEquals("error", "Сумма", result);
//    }
//
//    @Test
//    public void testEmailInternetHome() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic()
//                .selectByText("Домашний интернет");
//        String result = mainPage.getEmailInternetHome();
//        Assert.assertEquals("error", "E-mail для отправки чека", result);
//    }
//
//    //рассрочка
//    @Test
//    public void testAccountNumber() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic()
//                .selectByText("Рассрочка");
//        String result = mainPage.getAccountNumber();
//        Assert.assertEquals("error", "Номер счета на 44", result);
//    }
//
//    @Test
//    public void testInstalmentSum() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic()
//                .selectByText("Рассрочка");
//        String result = mainPage.getInstalmentSum();
//        Assert.assertEquals("error", "Сумма", result);
//    }
//
//    @Test
//    public void testEmailInstallmentPlan() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic()
//                .selectByText("Рассрочка");
//        String result = mainPage.getEmailInstallmentPlan();
//        Assert.assertEquals("error", "E-mail для отправки чека", result);
//    }
//
//    //задолженность
//    @Test
//    public void testScoreArrears() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic()
//                .selectByText("Задолженность");
//        String result = mainPage.getScoreArrears();
//        Assert.assertEquals("error", "Номер счета на 2073", result);
//    }
//
//    @Test
//    public void testArrearsSum() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic()
//                .selectByText("Задолженность");
//        String result = mainPage.getArrearsSum();
//        Assert.assertEquals("error", "Сумма", result);
//    }
//
//    @Test
//    public void testArrearsEmail() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage
//                .coockiClic()
//                .selectByText("Задолженность");
//        String result = mainPage.getArrearsEmail();
//        Assert.assertEquals("error", "E-mail для отправки чека", result);
//    }
//
//    //iframe
//
    @Test
    public void testSumHeder() {
        String phoneNumber = "(29)777-77-77";
        String rub = "100";
        MainPage mainPage = new MainPage(driver);
        PaymentFramePage frame = mainPage
                .coockiClic()
                .numberPhone(phoneNumber)
                .rubSum(rub)
                .next()
                .switchToPaymentFrame();
        Assert.assertEquals("error", "100.00 BYN", frame.getSumHeder());
    }

    @Test
    public void testPhoneHeder() {
        MainPage mainPage = new MainPage(driver);
        PaymentFramePage frame = mainPage
                .coockiClic()
                .numberPhone("(29)777-77-77")
                .rubSum("100")
                .next()
                .switchToPaymentFrame();
        Assert.assertEquals("error", "Оплата: Услуги связи Номер:375297777777", frame.getPhoneHeder());
    }

    @Test
    public void testNumberCard() {
        MainPage mainPage = new MainPage(driver);
        PaymentFramePage frame = mainPage
                .coockiClic()
                .numberPhone("(29)777-77-77")
                .rubSum("100")
                .next()
                .switchToPaymentFrame();
        Assert.assertEquals("error", "Номер карты", frame.getNumberCard());
    }

    @Test
    public void testValidityPeriod() {
        MainPage mainPage = new MainPage(driver);
        PaymentFramePage frame = mainPage
                .coockiClic()
                .numberPhone("(29)777-77-77")
                .rubSum("100")
                .next()
                .switchToPaymentFrame();
        Assert.assertEquals("error", "Срок действия", frame.getValidityPeriod());
    }

    @Test
    public void testCvc() {
        MainPage mainPage = new MainPage(driver);
        PaymentFramePage frame = mainPage
                .coockiClic()
                .numberPhone("(29)777-77-77")
                .rubSum("100")
                .next()
                .switchToPaymentFrame();
        Assert.assertEquals("error", "CVC", frame.getCvc());
    }

    @Test
    public void testFirstNameLastName() {
        MainPage mainPage = new MainPage(driver);
        PaymentFramePage frame = mainPage
                .coockiClic()
                .numberPhone("(29)777-77-77")
                .rubSum("100")
                .next()
                .switchToPaymentFrame();
        Assert.assertEquals("error", "Имя и фамилия на карте", frame.getFirstNameLastName());
    }

    @Test
    public void testcardsBrandsVisibl() {
        MainPage mainPage = new MainPage(driver);
        PaymentFramePage frame = mainPage
                .coockiClic()
                .numberPhone("(29)777-77-77")
                .rubSum("100")
                .next()
                .switchToPaymentFrame();
        Assert.assertTrue("error", frame.cardsBrandsVisible());
    }

    @Test
    public void testButton() {
        MainPage mainPage = new MainPage(driver);
        PaymentFramePage frame = mainPage
                .coockiClic()
                .numberPhone("(29)777-77-77")
                .rubSum("100")
                .next()
                .switchToPaymentFrame();
        Assert.assertEquals("error", "Оплатить 100.00 BYN", frame.getButton());
    }

}
