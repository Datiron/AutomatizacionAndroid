package com.nttdata.stepsdefinitions;
import com.nttdata.steps.LgSwagSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.lang.Thread;

public class LoginAppSwStepdefs {

    @Steps
    LgSwagSteps swagApp;


    @When("inicio sesion con el usuario {string}")
    public void inicioSesionConElUsuario(String usuario) {
        System.out.println("inicioSesionConElUsuario ini");
        //swagApp.LogUsuario(usuario);
        swagApp.ClickLog();
        System.out.println("inicioSesionConElUsuario fin");

    }

    @And("contraseña {string}")
    public void contraseña(String cont) {
        System.out.println("contraseña ini");
        swagApp.LogContrasena(cont);
        System.out.println("contraseña fin");
    }

    @Then("le doy click a login")
    public void leDoyClickALogin() {
        swagApp.ClickLog();
    }

    @Given("estoy en la aplicacion Swag")
    public void estoyEnLaAplicacionSwag() {
        System.out.println("Thread ini");
        try {
            Thread.sleep(12000);
        }catch (Exception e){

        }
        System.out.println("Thread fin");

    }
}
