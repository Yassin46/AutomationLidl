import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConectionTest extends FunctionalTest{

    @BeforeClass
    public void setUpTest() {
        FunctionalTest.setUp();
    }

    @Test
    public void conexion() {
        Conexion conexion = new Conexion(driver);
        conexion.clickOnConexion();
        conexion.clickOnRegistrationLink();

    }

}
