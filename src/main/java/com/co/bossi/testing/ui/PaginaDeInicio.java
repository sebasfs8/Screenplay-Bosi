package com.co.bossi.testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bosi.com.co")
public class PaginaDeInicio extends PageObject {
	
	public static final Target lblBusquedaDeProducto = Target.the("Barra de busqueda").located(By.xpath("//input[@placeholder='¿Qué estas buscando?']"));
	public static final Target btnBuscar = Target.the("boton de busqueda").located(By.xpath("//span[@id='btnSearch']"));

}
