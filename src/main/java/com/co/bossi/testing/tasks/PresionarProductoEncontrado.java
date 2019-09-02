package com.co.bossi.testing.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.bossi.testing.ui.PaginaResultadoBusqueda.Producto;

public class PresionarProductoEncontrado implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(Producto));
		
	}
	
	public static Performable enBossi() {
		
		return instrumented(PresionarProductoEncontrado.class);
	}

	
	
	
	
		
}
