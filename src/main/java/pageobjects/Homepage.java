package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends AbstractPage {

    @FindBy( id = "OriginLocation_Combobox")
    WebElement fieldOrigin;

    @FindBy( id = "DestinationLocation_Combobox")
    WebElement fieldDestination;

    @FindBy( xpath = "//button[@type='submit']")
    WebElement buttonSubmit;



    public Homepage(WebDriver driver){
        this.driver = driver;
       // wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }

    public void setFieldOrigin(String origin){
        fieldOrigin.sendKeys(origin);
    }

    public void setFieldDestination(String destination){
        fieldOrigin.sendKeys(destination);
    }

    public void clickSubmit(){
        buttonSubmit.click();
    }
}
