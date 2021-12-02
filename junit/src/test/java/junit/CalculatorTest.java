package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator cal;
	
	@BeforeAll
	static void BeforeAllInit() {
		System.out.println("It will run for before all");
	}

	
	@BeforeEach

	void Init() {
		cal = new Calculator();
		System.out.println("It will run before each");
	}
	
	@AfterEach
	
	void AfterEachinit() {
		System.out.println("It will run after each");
	}
	
	

	@Test
	@DisplayName("Testing add")
	void testadd() {

		int actual = cal.add(2, 2);
		int expected = 4;
		assertEquals(expected, actual, "The method should add two numbers ");

	}

	@Test
	@DisplayName("Testing area of circle")
	void testcircleradius() {
		assertEquals(78.5, cal.circlearea(5), "Should return right circle area");

	}
	/*
	 * @Test void divide() { assertThrows(ArithmeticException.class, () ->
	 * cal.divide(4, 2), "Divide by zero should throws an error" ); }
	 */
}
