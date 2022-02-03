package collections;

import java.util.Set;
import java.util.TreeSet;

import classesandobjects.FordFigo;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		FordFigo figo1 = new FordFigo(999, "Silver", "Hatch Back", "Ford Figo");
		FordFigo figo2 = new FordFigo(222, "Black", "Hatch Back", "Ford Figo");
		FordFigo figo3 = new FordFigo(555, "White", "Hatch Back", "Ford Figo");
		
		Set<FordFigo> allCars = new TreeSet<FordFigo>(new CarComparisonLogic());
		
		allCars.add(figo1);
		allCars.add(figo2);
		allCars.add(figo3);
		
		System.out.println(allCars);

	}

}
