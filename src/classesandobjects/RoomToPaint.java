package classesandobjects;

public class RoomToPaint {
	int width;
	int length;
	int numOfWalls;
	double costToPaintPerWall;
	
	// constructor
	public RoomToPaint(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public String toString() {
		return "[width: " + width + ", length: " + length + "]";
	}
	
	// method to calculate floor area
	int calculateFloorArea() {
		return width * length;
	}
	
	// method to calculate the cost of painting the walls
	double calculateCostToPaintWalls() {
		return numOfWalls * costToPaintPerWall;
	}

}
