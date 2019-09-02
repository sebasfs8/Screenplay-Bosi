package com.co.bossi.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.bossi.testing.ui.PaginaSeleccionProducto.btnCompraAhora;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.co.bossi.testing.interations.Wait;

public class PresionarComprar implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Scroll.to(btnCompraAhora).andAlignToBottom(),
				Wait.thisSeconds(4),
				Click.on(btnCompraAhora),
				Wait.thisSeconds(10));
	}
	
	public static Performable enBossi() {
		
		return instrumented(PresionarComprar.class);
	}

	

}
