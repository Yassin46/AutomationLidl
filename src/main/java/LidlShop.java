import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LidlShop extends PageObject {

    //Elements

    @FindBy(xpath =  "//*[@id=\"home-page-layout\"]/div[2]/section/div[1]/div[2]/div/div[1]/div/div/div/div/a")
    private WebElement swimbad;

    @FindBy(className = "js-amount-product-detail")
    private WebElement quantity;

    @FindBy(id = "addToCartButton")
    private WebElement add;

    @FindBy(xpath = "/html/body")
    private WebElement pannier;

    @FindBy(xpath = "/html/body")
    private WebElement faceebook;

    @FindBy(className= "btn proceed m-l m-bs")
    private WebElement checkout;

    @FindBy(className = "icon-user-nav-basket")
    private WebElement basket;





    public LidlShop(WebDriver driver) {
        super(driver);
    }

    public void clickOntheLink(){
        swimbad.click();
    }

    public void choseOnQuantity(){
        quantity.click();
    }

    public void submitQantity(){
        add.submit();

    }

    public void checkPanier(){
        pannier.click();
    }

    public void checkoutProduct(){
        checkout.click();
    }

    public void intoBasket(){
        basket.click();
    }

    public void moveMouse(){

    }
}
