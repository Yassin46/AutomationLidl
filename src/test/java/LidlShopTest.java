import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LidlShopTest extends  FunctionalTest{

    @BeforeClass
    public void setUpTest() {

        FunctionalTest.setUp();
    }

    @Test
    public void lidelshop() {

        LidlShop lidelshop = new LidlShop(driver);
        lidelshop.clickOntheLink();
        lidelshop.choseOnQuantity();
        lidelshop.submitQantity();
        lidelshop.checkPanier();
        lidelshop.intoBasket();
        lidelshop.checkoutProduct();

    }

}
