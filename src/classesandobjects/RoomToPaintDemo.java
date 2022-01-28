package classesandobjects;

public class RoomToPaintDemo {

	public static void main(String[] args) {
		// initialize a new room
		RoomToPaint room1 = new RoomToPaint();
		
		// add attributes
		room1.length = 15;
		room1.width = 10;
		room1.numOfWalls = 4;
		room1.costToPaintPerWall = 25.00;
		
		// invoke methods
		int floorArea = room1.calculateFloorArea();
		double paintCost = room1.calculateCostToPaintWalls();
		
		//output
		System.out.println(
				"The total floor area of a room with a length of " + 
				room1.length + " and width of " + room1.width + " is " + floorArea);
		
		System.out.println(
				"The total cost to paint a room with " + 
				room1.numOfWalls + " walls at " + room1.costToPaintPerWall + " per wall is " + 
				paintCost);
		
		System.out.println("------------------------------------");

		// initialize a new room
		RoomToPaint room2 = new RoomToPaint();
		
		// add attributes
		room2.length = 1;
		room2.width = 25;
		room2.numOfWalls = 6;
		room2.costToPaintPerWall = 35.99;
		
		// invoke methods
		int floorArea2 = room2.calculateFloorArea();
		double paintCost2 = room2.calculateCostToPaintWalls();
		
		//output
		System.out.println(
				"The total floor area of a room with a length of " + 
				room2.length + " and width of " + room2.width + " is " + floorArea2);
		
		System.out.println(
				"The total cost to paint a room with " + 
				room2.numOfWalls + " walls at " + room2.costToPaintPerWall + " per wall is " + 
				paintCost2);
		
		
	}

}
