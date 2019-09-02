package com.co.bossi.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.bossi.testing.ui.PaginaDeFactura.btnAceptarCondiciones;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.co.bossi.testing.interations.Wait;
public class PresionarAceptoCondiciones implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Wait.thisSeconds(4),
				Click.on(btnAceptarCondiciones),
				Wait.thisSeconds(10));
	}
	
	public static Performable enBossi() {
		return instrumented(PresionarAceptoCondiciones.class);
	}

	

}
