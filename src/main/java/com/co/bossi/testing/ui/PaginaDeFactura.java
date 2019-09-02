package com.co.bossi.testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaDeFactura  extends PageObject  {
	
	public static final Target btnAceptarCondiciones = Target.the("boton de aceptacion de condiciones").located(By.xpath("//input[@id='checboxAcceptTerms']"));
	public static final Target btnFinalizarCompra = Target.the("boton de confirmar compra de carrito de compras").located(By.xpath("//span[@class='btn-place-order-wrapper']"));
	
}
