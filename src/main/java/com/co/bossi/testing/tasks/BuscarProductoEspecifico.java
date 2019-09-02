package com.co.bossi.testing.tasks;



import static com.co.bossi.testing.ui.PaginaDeInicio.lblBusquedaDeProducto;
import static com.co.bossi.testing.ui.PaginaDeInicio.btnBuscar;
import java.util.List;

import com.co.bossi.testing.models.BuscarProducto;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class BuscarProductoEspecifico implements Task {
	
	private List<BuscarProducto> data;
	
	
	public BuscarProductoEspecifico(List<BuscarProducto> data) {
		this.data = data;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(data.get(0).getproducto()).into(lblBusquedaDeProducto),
				Click.on(btnBuscar));
		
		
	}
	
	public static Performable enBossi(List<BuscarProducto> data) {
		// TODO Auto-generated method stub
		return instrumented(BuscarProductoEspecifico.class,data);
	}

	

}
