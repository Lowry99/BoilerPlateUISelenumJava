package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Homepage extends PageObject_Base {

    public Homepage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "menu-item-22")
    private WebElement aboutButton;

    public void get (){
        driver.get("http://www.matthewlowry.co.uk");
    }

    public void goToAboutPage() {
        aboutButton.click();
    }
}
