import org.testng.annotations.Test;
import pageobjects.Homepage;

public class Test2 extends BaseTest{
    @Test
    public void start(){
        driver.get("http://belavia.by");
        Homepage homepage = new Homepage(driver);
        homepage.setFieldOrigin("Minsk");
        homepage.setFieldDestination("Budapest");
        homepage.clickSubmit();

    }


}
