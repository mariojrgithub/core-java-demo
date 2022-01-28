package classesandobjects;

public class FordFigo {
	
	int modelNum;
	String color;
	String carType;
	
	String unlockCar() {
		return "Car unlocked";
	}
	
	String lockCar() {
		return "Ford Figo locked";
	}
	
	String accelerate() {
		return "Ford Figo accelerated!";
	}
	
	String applyBrake() {
		manualBrakeSystem();
		return "Ford Figo applied brake";
	}
	
	void manualBrakeSystem() {
		System.out.println("Manual brakes applied");
	}
}
