package com.co.bossi.testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaResultadoBusqueda extends PageObject {
	
	public static final Target Producto = Target.the("imagen del producto").located(By.xpath("//div[@class='contentImg']"));
	
}
