package com.co.bossi.testing.tasks;

import static com.co.bossi.testing.ui.PaginaDeFactura.btnFinalizarCompra;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.co.bossi.testing.interations.Wait;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PresionarCompraFactura implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Wait.thisSeconds(4),
				Click.on(btnFinalizarCompra),
				Wait.thisSeconds(10));
	}

	public static Performable enBossi() {
		return instrumented(PresionarCompraFactura.class);
	}

}
