package interfacesandabstractclasses;

// class must be abstract if there is at least one abstract method

// we cannot create an object of abstract class
// they are incomplete classes
// meant to be inherited

abstract public class Animal {
	
	void breathe() {
		System.out.println("Animal breathes");
	}
	
	// abstract method, no body
	// abstract methods are declared not defined
	abstract void mobility(); 

}
