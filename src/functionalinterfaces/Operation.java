package functionalinterfaces;

@FunctionalInterface
public interface Operation {

	// methods are by default in an interface are public and abstract
	int operate(int num1, int num2);
	
	
}
