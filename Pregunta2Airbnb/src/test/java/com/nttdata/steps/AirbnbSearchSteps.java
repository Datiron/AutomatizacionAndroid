package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import net.serenitybdd.core.pages.PageObject;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;

    @Step("Click en cerrar")
    public void clickClose(){
        System.out.println("Cerrar Ventana");
        loginScreen.clickClose();
        System.out.println("Fin Cerrar Ventana");
    }

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){

        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        searchScreen.clickSearchInput();
        searchDetailsScreen.enterSearchInput(place);
        searchDetailsScreen.clickFirstOption();
        searchDetailsScreen.clickNext();
        searchDetailsScreen.clickSearch();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return searchScreen.getResultText();
    }
}
