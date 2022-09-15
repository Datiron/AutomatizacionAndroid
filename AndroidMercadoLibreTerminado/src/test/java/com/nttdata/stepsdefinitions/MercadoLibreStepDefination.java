package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MercadoLibreSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.lang.Thread;

public class MercadoLibreStepDefination {


    @Steps
    MercadoLibreSteps mercadolibre;
    @Given("que me encuentro en el mercado libre")
    public void queMeEncuentroEnElMercadoLibre() {
        System.out.println("Thread ini");
        try {
            Thread.sleep(12000);
        }catch (Exception e){

        }
        System.out.println("Thread fin");
    }

    @When("busco el producto {string}")
    public void buscoElProducto(String busqueda) {
        System.out.println("Thread ini");
        mercadolibre.searchByText(busqueda);
        System.out.println("Thread fin");
    }

    @Then("valido el texto {string}")
    public void validoElTexto(String arg0) {
        try {
            Thread.sleep(12000);
        }catch (Exception e){

        }


    }

    @And("selecciono producto {string}")
    public void seleccionoProducto(String arg0) {
        mercadolibre.SelecionarP();
    }
    @And("compro producto {string}")
    public void comproProducto(String arg0) {
        mercadolibre.Comprar();
    }


}
