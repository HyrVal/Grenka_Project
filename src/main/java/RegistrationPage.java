import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegistrationPage extends BasePage{

    RegistrationPage(WebDriver driver) {
        super(driver);
    }

//    private By emailButton = By.xpath("//input[@id='registration_top_email']");
//    private By passwordButton = By.xpath("//input[@id='registration_top_password']");
//    input[@id='registration_top_password']
//    public By makePasswordButton = By.xpath("//div[@id='registration_top_givemepassword-icon']");
//    public By phoneButton = By.xpath("//input[@id='registration_top_telephone']");
//    public By registrationButton = By.xpath("//button[@id='registration_top_save']");
//    //button[text()='Зарегистрироватьcя']
//    private final By iAgreeButton = By.xpath("//div[@id='registration_top_iagree-icon']");


    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@id='registration_top_email']"));
    }

    public WebElement getRegistrationButton() {
        return driver.findElement(By.xpath("//button[@id='registration_top_save']"));
    }

    public WebElement passwordButton() {
        return driver.findElement(By.xpath("//input[@id='registration_top_password']"));
    }

    public WebElement phoneButton() {
        return driver.findElement(By.xpath("//input[@id='registration_top_telephone']"));
    }
}
