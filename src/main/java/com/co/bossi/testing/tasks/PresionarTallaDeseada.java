package com.co.bossi.testing.tasks;

import java.util.List;

import com.co.bossi.testing.models.BuscarProducto;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class PresionarTallaDeseada implements Task {
	
	private List<BuscarProducto> data;
	
	
	public PresionarTallaDeseada(List<BuscarProducto> data) {
		this.data = data;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(By.xpath("//li[@class='talla customDimension'][contains(text(),'"+data.get(0).gettalla()+"')]")));;
	}
	
	public static Performable enBossi(List<BuscarProducto> data) {
		
		return instrumented(PresionarTallaDeseada.class,data);
	}

	

}
