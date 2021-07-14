package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;



public class Loginpage {
    WebDriver driver;

    By user = By.id("user-name");

    By pass = By.id("password");

    By login = By.name("login-button");

    public Loginpage(WebDriver driver) {

        this.driver = driver;

    }
    public void setUserName(String strUserName) {

        driver.findElement(user).sendKeys(strUserName);

    }

    public void setPassword(String strPassword) {

        driver.findElement(pass).sendKeys(strPassword);

    }

    public void clickLogin() {

        driver.findElement(login).click();

    }

    public void DO_login(String strUserName, String strPasword) {

        this.setUserName(strUserName);
        this.setPassword(strPasword);
        this.clickLogin();
    }
}
