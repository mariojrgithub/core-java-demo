package classesandobjects;

public class RoomToPaint<T> implements Comparable<T> {
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

	// returns three possible values
	// positive
	// 0
	// negative
	@Override
	public int compareTo(T o) {
		// compute area of current object
		int currentFA = length * width;
		RoomToPaint incoming = (RoomToPaint) o;
		int incomingFA = incoming.length * incoming.width;
		
		return currentFA - incomingFA;
		
	}

}
