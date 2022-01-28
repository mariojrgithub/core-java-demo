package classesandobjects;

public class RoomToPaint {
	int width;
	int length;
	int numOfWalls;
	double costToPaintPerWall;
	
	// method to calculate floor area
	int calculateFloorArea() {
		return width * length;
	}
	
	// method to calculate the cost of painting the walls
	double calculateCostToPaintWalls() {
		return numOfWalls * costToPaintPerWall;
	}

}
