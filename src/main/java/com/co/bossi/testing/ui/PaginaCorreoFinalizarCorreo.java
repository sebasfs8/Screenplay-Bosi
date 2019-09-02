package com.co.bossi.testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaCorreoFinalizarCorreo extends PageObject  {
		
	public static final Target LblCorreoConfirmacion = Target.the("Correo de confirmacion").located(By.xpath("//span[contains(text(),'Ingresa tu mail para continuar la compra.')]"));
	
	public static Target getTextoCorreoConfirmacion() {
		
		return LblCorreoConfirmacion;
		
	}
}
