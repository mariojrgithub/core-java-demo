package classesandobjects;

public class FordFigo {
	
	private int modelNum;
	private String color;
	private String carType;
	private String carName;
	
	
	public FordFigo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FordFigo(int modelNum, String color, String carType, String carName) {
		super();
		this.modelNum = modelNum;
		this.color = color;
		this.carType = carType;
		this.carName = carName;
	}

	// getter for modelNum
	public int getModelNum() {
		return modelNum;
	}
	
	// setter for modelNum
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}
	
	// getter for color
	public String getColor() {
		return color;
	}
	
	// setter for color
	public void setColor(String color) {
		this.color = color;
	}
	
	// getter for carType
	public String getCarType() {
		return carType;
	}
	
	// setter for carType
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	// getter for carName
	public String getCarName() {
		return carName;
	}
	
	// setter for carName
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	
	String unlockCar() {
		return carName + " unlocked";
	}
	
	String lockCar() {
		return carName + " locked";
	}
	
	String accelerate() {
		return carName + " accelerated!";
	}
	
	String applyBrake() {
		manualBrakeSystem();
		return carName + " applied brake";
	}
	
	void manualBrakeSystem() {
		System.out.println("Manual brakes applied");
	}

	@Override
	public String toString() {
		return "FordFigo [modelNum=" + modelNum + ", color=" + color + ", carType=" + carType + ", carName=" + carName
				+ "]";
	}
	
	
}
