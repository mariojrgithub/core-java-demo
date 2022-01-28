package arrays;

import classesandobjects.RoomToPaint;

public class RoomArrayDemo {

	public static void main(String[] args) {
		// initializing one by one
		RoomToPaint room1 = new RoomToPaint();
		
		// declare an array of RoomToPaint of size 3
		RoomToPaint[] myRooms = new RoomToPaint[3];
		
		myRooms[0] = new RoomToPaint();
		myRooms[1] = new RoomToPaint();
		myRooms[2] = new RoomToPaint();
		
		// doing above code in a for loop
		for(int i = 0; i < myRooms.length; i++) {
			myRooms[i] = new RoomToPaint();
		}
		
		// initialize an array of RoomToPaint objects
		RoomToPaint[] allRooms = { new RoomToPaint(), 
								   new RoomToPaint(), 
								   new RoomToPaint(),
								   new RoomToPaint()};
		
		
	}

}
