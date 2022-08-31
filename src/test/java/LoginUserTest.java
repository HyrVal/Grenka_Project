import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUserTest extends TestInit{

    @Test
    public void loginTest(){

   UserLogin userLogin= new UserLogin(driver);
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        sleep(3);
        homePage.getEnterBtnTest().click();
        sleep(3);
//        homePage.getEnterBtnTest().click();
//        sleep(3);
//        sleep(7);
//        userLogin.getEnterBtn().click();

       Assert.assertTrue(userLogin.closeLoginWindow());

//        registrationPage.passwordButton().sendKeys("Ilikegrenka");
//        sleep(3);
//        registrationPage.phoneButton().sendKeys("0661234567");
//        sleep(5);
//        registrationPage.getRegistrationButton().click();
    }


}
