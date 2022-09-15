package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import javafx.scene.web.WebEngine;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;


public class LoginSWSearchScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUsuario;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-standard_user\"]/android.widget.TextView")
    private WebElement Clik;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtContraseña;

//

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement txtBtnLogin;




    private WebEngine driver;



    public void LoginApp(String Userr){
        System.out.println("LoginApp ini");
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        txtUsuario.click();
        txtUsuario.sendKeys(Userr);
//        WebElement userInputElement = driver.();
//        userInputElement.sendKeys(User);

    }
    public void LoginContra(String Contrasena){
        System.out.println("LoginApp ini");
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        txtContraseña.sendKeys(Contrasena);
    }

    public void ClickLogin(){
        System.out.println("LoginApp ini");
        getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        txtBtnLogin.click();

    }

    private WebDriver setDriver(WebEngine driver) {
        return getDriver();
    }

    public void enter(){
        Actions action = new Actions(setDriver(driver));
        action.sendKeys(Keys.ENTER).perform();

    }
}
