package classesandobjects;

public class FordFigoDemo {

	public static void main(String[] args) {
		// primitive type
		int mark;
		mark = 50;
		
		// derived type
		FordFigo fordFigo; 			// no object created here
		fordFigo = new FordFigo();  // object IS created
		
		fordFigo.modelNum = 123456;
		fordFigo.color = "black";
		fordFigo.carType = "hatch back";
		
		System.out.println("Car color: " + fordFigo.color);
		System.out.println(fordFigo.unlockCar());
		System.out.println(fordFigo.accelerate());
		System.out.println(fordFigo.applyBrake());
		System.out.println(fordFigo.lockCar());
		
		System.out.println("----------------------");
		
		FordFigo fordFigo2 = new FordFigo();
		
		fordFigo2.modelNum = 123477;
		fordFigo2.color = "silver";
		fordFigo2.carType = "hatch back";
		
		System.out.println("Car color: " + fordFigo2.color);
		System.out.println(fordFigo2.unlockCar());
		System.out.println(fordFigo2.accelerate());
		System.out.println(fordFigo2.applyBrake());
		System.out.println(fordFigo2.lockCar());
		
	}

}
