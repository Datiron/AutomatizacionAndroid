package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.messages.internal.com.google.common.collect.ImmutableMap;
import javafx.scene.web.WebEngine;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class MLSearchScreen extends PageObject {
//    ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    @AndroidFindBy(xpath = "//androidx.drawerlayout.widget.DrawerLayout[@content-desc=\",abierto\"]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
    private WebElement searchInput;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]")
    private WebElement formlogin;

    @AndroidFindBy(id = "com.mercadolibre:id/home_onboarding_action_skip_text_view")
    private WebElement formloginOmitir;


    @AndroidFindBy(id = "2131431007")
    private WebElement resultText;

    @AndroidFindBy(id = "com.mercadolibre:id/search_input_edittext")
    private WebElement txtBusquedaProducto;


    @AndroidFindBy(xpath = "//androidx.drawerlayout.widget.DrawerLayout[@content-desc=\",abierto\"]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.view.View")
    private WebElement txtClickProducto;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Comprar ahora.\"]")
    private WebElement txtComprar;


    private WebEngine driver;

    public void clickSearchInput(){
        System.out.println("clickSearchInput ini");
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        formlogin.click();
        System.out.println("clickSearchInput ...");
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        formloginOmitir.click();
        System.out.println("clickSearchInput .....");
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        searchInput.click();
        System.out.println("clickSearchInput fin");
    }

    public void ingresarBusquedad(String sBusquedad){
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        txtBusquedaProducto.click();
        txtBusquedaProducto.sendKeys(sBusquedad);
        //driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
        //txtBusquedaProducto.sendKeys(Keys.ENTER);

//        txtBusquedaProducto.click();

//        Object driver;
//        ((AndroidDriver<MobileElement>)driver).pressKey(new KeyEvent(AndroidKey.ENTER));
//        driver.pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_ENTER );
//        txtBusquedaProducto.sendKeys(Keys.ENTER);


    }

    private WebDriver setDriver(WebEngine driver) {
        return getDriver();
    }

    public void enter(){
        Actions action = new Actions(setDriver(driver));
        action.sendKeys(Keys.ENTER).perform();
//        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        txtBusquedaProducto.sendKeys(Keys.ENTER);
    }

    public void selecProduc(){
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        txtClickProducto.click();
    }

    public void selecComprar(){
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        txtComprar.click();
    }

    public String getResultText(){
        return resultText.getText();
    }
}
