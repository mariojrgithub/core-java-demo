package classesandobjects;

public class FordFigoTitanium extends FordFigo {
	
	String popAirBags() {
		return "Airbags are popped";
	}
	
	String applyBrake() {
		super.applyBrake(); // used to call the overridden method of the parent class
		
		return "ABS brakes applied";
	}

}
