import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTest extends TestInit {

    @Test
    public void enterBtnTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getEnterBtnTest().click();
        sleep(1);

    }

    @Test
    public void saleBtnTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getSaleBtnTest().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ua/promo"));
    }

    @Test
    public void newsBtnTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getNewsBtnTest().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ua/news"));
    }

    @Test
    public void deliveryBtnTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getDeliveryBtnTest().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ua/delivery"));
    }

    @Test
    public void paymentBtnTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getPaymentBtnTest().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ua/pay"));
    }

    @Test
    public void contactsBtnTest() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.contactsBtnTest().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ua/contacts"));
    }

    @Test
    public void gameBtnCheck() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getGameBtn().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ua/games"));
    }

    @Test
    public void booksBtnCheck() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getBooksBtn().click();
        Assert.assertTrue(driver.getCurrentUrl().contains(".ua/books"));
    }

    @Test
    public void travelBtnCheck() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getTravelBtn().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ua/outdoor-tourism"));
    }

    @Test
    public void giftsBtnCheck() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getGiftsBtn().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ua/gifts"));
    }

    @Test
    public void childrenBtnCheck() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getChildrenBtn().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ua/kids"));
    }

    @Test
    public void sportBtnCheck() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getSportBtn().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ua/outdoor"));
    }

    @Test
    public void houseBtnCheck() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getHouseBtn().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("household"));
    }

    @Test
    public void electronicsDeviceBtnCheck() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getElectronicsDeviceBtn().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ua/electronics-device"));
    }

    @Test
    public void fishingBtnCheck() {
        HomePage homePage = new HomePage(driver);
        homePage.getSite();
        homePage.getFishingBtn().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("fishing"));
    }
}
