package com.co.bossi.testing.interations;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

public class Wait implements Interaction {
	
	private int seconds = 0;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			Thread.sleep(seconds * 1000);
		}catch(InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public static Performable thisSeconds(int seconds) {
		
		return Instrumented.instanceOf(Wait.class).withProperties(seconds);
		
	}

}
