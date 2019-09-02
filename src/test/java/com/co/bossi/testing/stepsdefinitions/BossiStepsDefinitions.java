package com.co.bossi.testing.stepsdefinitions;


import java.util.List;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import com.co.bossi.testing.exceptions.ComparacionFinal;
import com.co.bossi.testing.models.BuscarProducto;
import com.co.bossi.testing.questions.EnBussi;
import com.co.bossi.testing.tasks.AbrirBossi;
import com.co.bossi.testing.ui.PaginaDeInicio;
import com.co.bossi.testing.tasks.BuscarProductoEspecifico;
import com.co.bossi.testing.tasks.PresionarAceptoCondiciones;
import com.co.bossi.testing.tasks.PresionarCompraFactura;
import com.co.bossi.testing.tasks.PresionarComprar;
import com.co.bossi.testing.tasks.PresionarConfirmarCompra;
import com.co.bossi.testing.tasks.PresionarProductoEncontrado;
import com.co.bossi.testing.tasks.PresionarTallaDeseada;

public class BossiStepsDefinitions {
	
	PaginaDeInicio paginadeinicio;
	

	@Managed(driver = "chrome")
	WebDriver SuNavegador;
	
	Actor sebastian = Actor.named("sebastian");
	//precondicion.
	@Given("^sebastian abrio el navegador$")
	public void sebastianAbrioElNavegador() throws Exception {
		sebastian.can(BrowseTheWeb.with(SuNavegador));
		SuNavegador.manage().window().maximize();
	}
	//entrada
	@Given("^sebastian entra a bossi$")
	public void sebastianEntraABossi() throws Exception { 
		sebastian.wasAbleTo(AbrirBossi.En(paginadeinicio));
	}
	//accion
    @When("^el busca un producto especifico y lo agrega al carrito$")
	public void elBuscaUnProductoEspecificoYLoAgregaAlCarrito(List <BuscarProducto> data) throws Exception {
    		
    		sebastian.attemptsTo(BuscarProductoEspecifico.enBossi(data));
    		sebastian.attemptsTo(PresionarProductoEncontrado.enBossi());
    		sebastian.attemptsTo(PresionarTallaDeseada.enBossi(data));
    		sebastian.attemptsTo(PresionarComprar.enBossi());
    		sebastian.attemptsTo(PresionarConfirmarCompra.enBossi());
    		sebastian.attemptsTo(PresionarAceptoCondiciones.enBossi());
    		sebastian.attemptsTo(PresionarCompraFactura.enBossi());
    		
	}
    //validacion
	@Then("^genera compra y pide correo de confirmacion\\.$")
	public void generaCompraYPideCorreoDeConfirmacion() throws Exception {
	   
		sebastian.should(seeThat(EnBussi.confirmarCorreo(),equalTo("Ingresa tu mail para continuar la compra."))
				.orComplainWith(ComparacionFinal.class,ComparacionFinal.getMensaje()));
		
	}
	
}
