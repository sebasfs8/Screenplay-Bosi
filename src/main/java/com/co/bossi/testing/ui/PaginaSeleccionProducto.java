package com.co.bossi.testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaSeleccionProducto extends PageObject {
	
	public static final Target btnCompraAhora = Target.the("boton de comprar").located(By.xpath("//div[@class='boxButtons']//div[@class='buyButton']//a[@class='buy-in-page-button'][contains(text(),'COMPRA AHORA')]"));
	public static final Target btnConfirmarComprarCarrito = Target.the("boton de confirmar compra de carrito de compras").located(By.xpath("//a[@class='btnPagarProductsCart']"));
	
}
