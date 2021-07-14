package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shoppincart {

    WebDriver driver;
    By checkout = By.id("checkout");
    By FName = By.id("first-name");
    By LName = By.id("last-name");
    By Zip = By.id("postal-code");
    By Continue = By.id("continue");
    public Shoppincart(WebDriver driver){

        this.driver = driver;

    }
    public void setFname(String strFName) {

        driver.findElement(FName).sendKeys(strFName);

    }
    public void setLname(String strLname) {

        driver.findElement(LName).sendKeys(strLname);

    }
    public void setzip(String strZip) {

        driver.findElement(Zip).sendKeys(strZip);

    }
    public void clickContinue() {

        driver.findElement(Continue).click();

    }
    public void clickCheckout() {

        driver.findElement(checkout).click();

    }
    public void FillInfoandContinue(String strFName, String strLname, String strZip) {


        this.clickCheckout();
        this.setFname(strFName);
        this.setLname(strLname);
        this.setzip(strZip);

        this.clickContinue();
    }
}
