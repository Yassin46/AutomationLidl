import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends PageObject {

    @FindBy(id = "register.email")
    private WebElement email;

    @FindBy(id = "register.checkEmail")
    private WebElement checkEmail;

    @FindBy(id = "password-new-account-checkout")
    private WebElement password;

    @FindBy(id = "password-repeat-new-account-checkout")
    private WebElement repeatPassword;

    public void writeEmail(String Email){
        this.email.clear();
        this.email.sendKeys(Email);

    }
    public void writeEmailAgain(String Check){
        this.checkEmail.clear();
        this.checkEmail.sendKeys(Check);

    }
    public void introducePassword(String Pass){
        this.password.clear();
        this.password.sendKeys(Pass);

    }
    public void introducePasswordAgain(){
        this.password.clear();
        this.password.sendKeys();

    }

    public Register(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
}
