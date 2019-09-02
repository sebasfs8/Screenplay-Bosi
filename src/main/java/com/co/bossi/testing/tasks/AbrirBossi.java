package com.co.bossi.testing.tasks;



import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirBossi implements Task {
	
	PageObject pagina;
	
	public AbrirBossi(PageObject pagina) {
		this.pagina = pagina;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(pagina));
		
	}

	public static Performable En(PageObject paginadeinicio) {
		
		return Tasks.instrumented(AbrirBossi.class, paginadeinicio);
	}

	
}
