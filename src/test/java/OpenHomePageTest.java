import org.testng.annotations.Test;

public class OpenHomePageTest extends BaseTest {

    @Test
    public void start(){
         driver.get("http://belavia.by");
    }


}
