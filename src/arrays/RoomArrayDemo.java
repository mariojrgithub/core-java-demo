package arrays;

import classesandobjects.RoomToPaint;

public class RoomArrayDemo {

	public static void main(String[] args) {
		// initializing one by one
		RoomToPaint room1 = new RoomToPaint(26, 55);
		
		// declare an array of RoomToPaint of size 3
		RoomToPaint[] myRooms = new RoomToPaint[3];
		
		myRooms[0] = new RoomToPaint(50, 50);
		myRooms[1] = new RoomToPaint(20, 30);
		myRooms[2] = new RoomToPaint(15, 10);
		
		// doing above code in a for loop
//		for(int i = 0; i < myRooms.length; i++) {
//			myRooms[i] = new RoomToPaint();
//		}
		
		// initialize an array of RoomToPaint objects
		RoomToPaint[] allRooms = { new RoomToPaint(20, 30), 
								   new RoomToPaint(10, 25), 
								   new RoomToPaint(8, 9),
								   new RoomToPaint(30, 40)};
		
		
	}

}
