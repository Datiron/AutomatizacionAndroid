package com.nttdata.steps;

import com.nttdata.screens.MLSearchScreen;
import net.thucydides.core.annotations.Step;


public class MercadoLibreSteps {


    MLSearchScreen searchScreen;

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){
        System.out.println("searchByText ini");
        searchScreen.clickSearchInput();
        searchScreen.ingresarBusquedad(place);
        searchScreen.enter();

        System.out.println("searchByText fin");

    }
    public void Comprar(){
        searchScreen.selecComprar();
    }
    public void SelecionarP(){
        searchScreen.selecProduc();
    }


    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return searchScreen.getResultText();
    }
}
