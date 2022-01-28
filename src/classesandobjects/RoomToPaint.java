package classesandobjects;

public class RoomToPaint {
	int width;
	int height;
	int numOfWalls;
	double costToPaintPerWall;
	
	// method to calculate floor area
	int calculateFloorArea() {
		return width * height;
	}
	
	// method to calculate the cost of painting the walls
	double calculateCostToPaintWalls() {
		return numOfWalls * costToPaintPerWall;
	}

}
