package collections;

import java.util.Comparator;

import classesandobjects.FordFigo;

public class CarComparisonLogic implements Comparator<FordFigo> {

	@Override
	public int compare(FordFigo o1, FordFigo o2) {
		
		return o1.getModelNum() - o2.getModelNum();
	}
	

}
