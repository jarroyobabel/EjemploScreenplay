package stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class EjemploScreenplayStepsDefinbitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Jose");

    @Given("^Que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras(){

    }

    @When("^el agrega productos al carrito$")
    public void elAgregaProductosAlCarrito(List<String> datos) {

    }

    @Then("^el ve los productos listados en el carrito de compras$")
    public void elVeLosProductosListadosEnElCarritoDeCompras() {

    }
}
