package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class Homep {
    WebDriver driver;

    By Sort = By.className("product_sort_container");
    By FirstProduct = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button");
    By Cart = By.id("shopping_cart_container");

    public Homep(WebDriver driver){

        this.driver = driver;

    }
    public void clicksortHtoL() {

        driver.findElement(Sort).click();
        Select order = new Select (driver.findElement(By.className("product_sort_container")));
        order.selectByVisibleText("Price (high to low)");

    }
    public void clicksortLtoH() {

        driver.findElement(Sort).click();
        Select order = new Select (driver.findElement(By.className("product_sort_container")));
        order.selectByVisibleText("Price (low to high)");

    }
    public void BuyFirstProduct() {

        driver.findElement(FirstProduct).click();

    }
    public String getHName(){

        return    driver.findElement(FirstProduct).getText();

    }
    public void BuyHpricedProduct() {

        this.clicksortHtoL();
        this.BuyFirstProduct();

    }
    public void BuyLpricedProduct() {

        this.clicksortLtoH();
        this.BuyFirstProduct();

    }
    public void EnterCart(){

        driver.findElement(Cart).click();

    }
}
