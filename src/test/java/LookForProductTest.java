import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LookForProductTest extends FunctionalTest{

    @BeforeClass
    public void setUpTest() {

        FunctionalTest.setUp();
    }


    @Test
    public void lookforproduct() {
        LookForProduct lookforproduct = new LookForProduct(driver);
        lookforproduct.introduceProduct("linnen hemd");
        lookforproduct.clickinSearch();
        lookforproduct.getTitlesofArticles();
        //lookforproduct.clickOnConexion();
        //lookforproduct.clickOnRegistrationLink();

    }
}
