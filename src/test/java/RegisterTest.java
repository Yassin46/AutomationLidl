import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterTest extends FunctionalTest{

    @BeforeClass
    public void setUpTest() {
        FunctionalTest.setUp();
    }

    @Test
    public void conexion() {
        Register register = new Register(driver);
        register.writeEmail("yassinahmed1989@gmail.com");
        register.writeEmailAgain("yassinahmed1989@gmail.com");
        register.introducePassword("yassin5656");
        register.introducePassword("yassin5656");

    }
}
