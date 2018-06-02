import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Conexion extends PageObject {

    @FindBy(id = "notLoggedIn")
    private WebElement LoginConexion;

    @FindBy(id = "loginForm")
    private WebElement loginForm;

    @FindBy(id = "email-existing-account-checkout")
    private WebElement existinEmailAcount;

    @FindBy(id = "password-existing-account-checkout")
    private WebElement passwordAcount;

    @FindBy(id = "chooseaccountbutton-login-checkout")
    private WebElement enterButton;


    @FindBy(xpath = "//*[@id=\"loginForm\"]/fieldset/div[4]/a")
    private WebElement linkRegistration;


    public void clickOnConexion() {
        LoginConexion.click();
    }

    public void clickOnRegistrationLink() {
        linkRegistration.click();
    }



    public Conexion(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
}
