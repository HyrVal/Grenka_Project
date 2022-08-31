import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestInit {

    @Test
    public void reButtonTest() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        sleep(3);
        homePage.getRegistration().click();
        sleep(3);
//        registrationPage.getEmailField().sendKeys("7gal1k@gmail.com");
//        sleep(3);
//        registrationPage.passwordButton().sendKeys("Ilikegrenka");
//        sleep(3);
//        registrationPage.phoneButton().sendKeys("0661234567");
//        sleep(2);
//        registrationPage.getRegistrationButton().click();

    }

}

