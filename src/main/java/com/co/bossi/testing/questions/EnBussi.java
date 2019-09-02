package com.co.bossi.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import com.co.bossi.testing.ui.PaginaCorreoFinalizarCorreo;

public class EnBussi implements Question<String> {
	
	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(PaginaCorreoFinalizarCorreo.getTextoCorreoConfirmacion()).viewedBy(actor).asString();
	}
	
	public static EnBussi confirmarCorreo() {
		
		return new EnBussi();
	}

	

}
