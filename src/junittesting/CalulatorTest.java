package junittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalulatorTest {
	
	@BeforeAll
	public static void first() {
		System.out.println("BeforeAll is called");
	}
	
	@AfterAll
	public static void last() {
		System.out.println("AfterAll is called");
	}
	
	@BeforeEach
	public void eachBefore( ) {
		System.out.println("BeforeEach is called");
	}
	
	@AfterEach
	public void eachAfter() {
		System.out.println("AfterEach is called");
	}
	
	@Test
	public void testAddPositive() {
		
		Calculator calc = new Calculator();
		int actualOutput = calc.add(5, 7);
		
		int expectedOutput = 12;
		
		
		assertEquals(expectedOutput, actualOutput);
		
	}
	
	@Test
	public void testAddZero() {
		
		Calculator calc = new Calculator();
		int actualOutput = calc.add(0, 0);
		
		int expectedOutput = 0;
		
		
		assertEquals(expectedOutput, actualOutput);
		
	}
	
	@Test
	public void testAddNegative() {
		
		Calculator calc = new Calculator();
		int actualOutput = calc.add(-4, -8);
		
		int expectedOutput = -12;
		
		
		assertEquals(expectedOutput, actualOutput);
		
	}
	
	// multiply
	@Test
	public void testMultiplyPositive() {
		
		Calculator calc = new Calculator();
		int actualOutput = calc.multiply(5, 4);
		
		int expectedOutput = 20;
		
		
		assertEquals(expectedOutput, actualOutput);
		
	}
	
	@Test
	public void testMultiplyZero() {
		
		Calculator calc = new Calculator();
		int actualOutput = calc.multiply(0, 9);
		
		int expectedOutput = 0;
		
		
		assertEquals(expectedOutput, actualOutput);
		
	}
	
	@Test
	public void testMultiplyNegative() {
		
		Calculator calc = new Calculator();
		int actualOutput = calc.multiply(-4, 8);
		
		int expectedOutput = -32;
		
		
		assertEquals(expectedOutput, actualOutput);
		
	}

}
