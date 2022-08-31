import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserLogin extends BasePage {
    UserLogin(WebDriver driver) {
        super(driver);
    }

    private By loginTopEmail = By.xpath("//input[@id='login_top_email']");
    private By loginTopPassword = By.xpath("//input[@id='login_top_password']");
    private By facebookBtn = By.xpath("//i[@class='icon18-fb']");
    private By twitterBtn = By.xpath("//i[@class='icon18-twitter']");
    private By loginWindow = By.xpath("//div[@id='xlt2']");
    private By forgotPassword = By.xpath("//button[@id='xlt5']");
    private By enterBtn = By.xpath("//button[@id='login_top_save']");

    public boolean closeLoginWindow() {
        try {
            driver.findElement(By.xpath("//div[@id='xlt2']"));
        } catch (NoSuchElementException e) {
            return true;
        }
        return false;
    }

    public WebElement presentOnDisplay() {
        return driver.findElement(loginWindow);
    }

    public WebElement getEnterBtn() {
        return driver.findElement(enterBtn);
    }
}
