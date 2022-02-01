package classesandobjects;

public class FordFigoDemo {

	public static void main(String[] args) {
		// primitive type
//		int mark;
//		mark = 50;
		
		// derived type
		FordFigo fordFigo; 			// no object created here
		fordFigo = new FordFigo();  // object IS created
		
//		fordFigo.modelNum = 123456;
//		fordFigo.color = "black";
//		fordFigo.carType = "hatch back";
//		fordFigo.carName = "Ford Figo";
		
		// above with setters
		fordFigo.setModelNum(123456);
		fordFigo.setColor("black");
		fordFigo.setCarType("Hatch Back");
		fordFigo.setCarName("Ford Figo");
		
		System.out.println("Car color: " + fordFigo.getColor());
		System.out.println(fordFigo.unlockCar());
		System.out.println(fordFigo.accelerate());
		System.out.println(fordFigo.applyBrake());
		System.out.println(fordFigo.lockCar());
		
		System.out.println("----------------------");
		
		FordFigo fordFigo2 = new FordFigo();
		
//		fordFigo2.modelNum = 123477;
//		fordFigo2.color = "silver";
//		fordFigo2.carType = "hatch back";
//		fordFigo2.carName = "Ford Figo";
		
		// above with setters
		fordFigo2.setModelNum(123477);
		fordFigo2.setColor("silver");
		fordFigo2.setCarType("Hatch Back");
		fordFigo2.setCarName("Ford Figo");
		
		System.out.println("Car color: " + fordFigo2.getColor());
		System.out.println(fordFigo2.unlockCar());
		System.out.println(fordFigo2.accelerate());
		System.out.println(fordFigo2.applyBrake());
		System.out.println(fordFigo2.lockCar());
		
		System.out.println("----------------------");
		
		// extended class
		FordFigoTitanium  titanium = new FordFigoTitanium();
		
		titanium.setCarName("Ford Figo Titanium");
		
		System.out.println(titanium.unlockCar());
		System.out.println(titanium.accelerate());
		System.out.println(titanium.applyBrake());
		System.out.println(titanium.popAirBags());
		System.out.println(titanium.lockCar());
		
		System.out.println("----------------------");
		
		// a parent class reference variable can point to 
		// a child class object
		FordFigo titanium2 = new FordFigoTitanium();
		
		titanium2.setCarName("Ford Figo Titanium 2");

		System.out.println(titanium2.unlockCar());
		System.out.println(titanium2.accelerate());
		System.out.println(titanium2.applyBrake());
		System.out.println(titanium2.lockCar());
		
		// System.out.println(titanium2.popAirBags()); <-- not allowed
		// must cast first
		FordFigoTitanium titanium3 = (FordFigoTitanium)titanium2;
		
		System.out.println("----------------------");
		
		System.out.println(titanium3.popAirBags());
		
	}

}
