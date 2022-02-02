package collections;

class A {
	A() {
		System.out.println("In A");
	}
}

class B extends A {
	B() {} // second solution
	
	B(int mark) {
		System.out.println("In B");
	}
}

class C extends B {
	C() {
//		super(50); // first solution
		System.out.println("In C");
	}
}

public class ConstructorCallDemo {
	
	public static void main(String[] args) {
		
		C c = new C();
		System.out.println(c);

	}

}
