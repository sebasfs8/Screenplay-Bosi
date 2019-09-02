#Author: sebasfranco_sfs@hotmail.com	

@tag
Feature: Busqueda de un producto en la tienda Bosi

Background:
	Given sebastian abrio el navegador

  Scenario Outline: Busqueda de un producto Bosi
    Given sebastian entra a bossi
    When el busca un producto especifico y lo agrega al carrito
    	|  producto  |  talla  | 
      | <producto> | <talla> |
    Then genera compra y pide correo de confirmacion.

    Examples: 
      |    producto      |   talla |
      |   BOTA ATKINS    |    40   | 
			|   BOTA ZIGOR 		 |    39	 | 