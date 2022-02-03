package collections;

import java.util.SortedSet;
import java.util.TreeSet;

import classesandobjects.RoomToPaint;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		// very efficient at storing large amounts of data
		// must implement comparable interface

		SortedSet<Integer> treeSet = new TreeSet<>();
		
		// add
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		
		// read first (lowest)
		Integer first = treeSet.first();
		
		// read last (highest)
		Integer last = treeSet.last();
		
	
		System.out.println("The treeSet contains: " + treeSet);
		System.out.println("The first or lowest element is: " + first);
		System.out.println("THe last or highest element is: " + last);
		
		// update
		treeSet.add(10);
		
		System.out.println("After update, the treeSet contains: " + treeSet);
		
		// delete
		treeSet.remove(2);
		
		System.out.println("After deleting an element, treeSet contains: " + treeSet);
		
		// check for the presence of an element
		System.out.println("Is 2 contained in the treeSet? " + treeSet.contains(2));
		
		SortedSet<RoomToPaint> allRooms = new TreeSet<RoomToPaint>();
		
		allRooms.add(new RoomToPaint(200, 100));
		allRooms.add(new RoomToPaint(500, 400));
		allRooms.add(new RoomToPaint(20, 10));
		
		System.out.println(allRooms);
			
		
	}

}
