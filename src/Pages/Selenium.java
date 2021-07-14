package Pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium {

    public static void main(String... args) {

        Loginpage objLog;
        Homep objHomePage;
        Shoppincart objCart;



            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            objLog = new Loginpage(driver);
            objLog.DO_login("standard_user", "secret_sauce"); //enter the login user and password and click on the login button
            objHomePage = new Homep(driver);
            objHomePage.BuyHpricedProduct(); //sort High to low price and buy the first item

            objHomePage.BuyLpricedProduct(); //sort low to high price and buy the first item

            objHomePage.EnterCart(); //enter to the shopping cart

            objCart = new Shoppincart(driver);
            objCart.FillInfoandContinue("testing","technical","111000"); //Fill the information and submit the purchase

    }
}
