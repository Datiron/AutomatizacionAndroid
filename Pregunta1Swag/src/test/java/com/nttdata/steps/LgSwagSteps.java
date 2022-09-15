package com.nttdata.steps;

import com.nttdata.screens.LoginSWSearchScreen;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;


public class LgSwagSteps {
    private WebDriver driver;


    LoginSWSearchScreen searchScreen;

    @Step("Búsqueda por texto {0}")
    public void LogUsuario(String LogUser){
        System.out.println("LogUser ini");
        searchScreen.LoginApp(LogUser);
        System.out.println("LogUser fin");

    }
    public void LogContrasena(String LogContra){
        System.out.println("LogContra ini");
        searchScreen.LoginContra(LogContra);
        System.out.println("LogContra fin");
    }

    public void ClickLog(){
        System.out.println("ClickLog ini");
        searchScreen.ClickLogin();
        System.out.println("ClickLog fin");
    }




}
