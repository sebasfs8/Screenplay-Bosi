package com.co.bossi.testing.exceptions;

public class ComparacionFinal extends AssertionError {
	
	public static final String ErrorCompra="Error compra incompleta.";
	
	public static String getMensaje() {
		
		return ErrorCompra;
	}
	
	public ComparacionFinal(String message,Throwable cause) {
		
		super(message,cause);
	}

}
