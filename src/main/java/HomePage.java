import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;


public class HomePage extends BasePage {

    HomePage(WebDriver driver) {
        super(driver);
    }

    private By enterBtn = By.xpath("//span[@id='xlt1']");
    private By saleBtn = By.xpath("//span[text()='Акції']");
    private By newsBtn = By.xpath("//span[text()='Новини']");
    private By deliveryBtn = By.xpath("//span[text()='Доставка']");
    private By paymentBtn = By.xpath("//span[text()='Оплата']");
    private By contactsBtn = By.xpath("//span[text()='Контакти']");

    public void getSite() {
        driver.get("https://grenka.ua/");
    }

    public WebElement getEnterBtnTest() {
        return driver.findElement(enterBtn);
    }
    public WebElement getSaleBtnTest() {
        return driver.findElement(saleBtn);
    }
    public WebElement getNewsBtnTest() {
        return driver.findElement(newsBtn);
    }
    public WebElement getDeliveryBtnTest() {
        return driver.findElement(deliveryBtn);
    }
    public WebElement getPaymentBtnTest() {
        return driver.findElement(paymentBtn);
    }
    public WebElement contactsBtnTest() {
        return driver.findElement(contactsBtn);
    }

    public WebElement getRegistration() {
        return driver.findElement(By.xpath("//span[@id='xlt3']"));
    }

    public WebElement getGameBtn() {
        return driver.findElement(By.xpath("//a[@href='https://grenka.ua/games']"));
    }

    public WebElement getBooksBtn() {
        return driver.findElement(By.xpath("//a[@href='https://grenka.ua/books']"));
    }

    public WebElement getTravelBtn() {
        return driver.findElement(By.xpath("//a[@href='https://grenka.ua/outdoor-tourism']"));
    }

    public WebElement getGiftsBtn() {
        return driver.findElement(By.xpath("//a[@href='https://grenka.ua/gifts']"));
    }

    public WebElement getChildrenBtn() {
        return driver.findElement(By.xpath("//a[@href='https://grenka.ua/kids']"));
    }

    public WebElement getSportBtn() {
        return driver.findElement(By.xpath("//a[@href='https://grenka.ua/outdoor']"));
    }

    public WebElement getHouseBtn() {
        return driver.findElement(By.xpath("//a[@href='https://grenka.ua/household']"));
    }

    public WebElement getElectronicsDeviceBtn() {
        return driver.findElement(By.xpath("//a[@href='https://grenka.ua/electronics-device']"));
    }

    public WebElement getFishingBtn() {
        return driver.findElement(By.xpath("//a[@href='https://grenka.ua/fishing']"));
    }
    
}



