package homework;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		Calc calc = new Calc();
		assertTrue(calc.add(1, 2) == 3);
		
	}

	@Test
	public void testSubtract() {
		Calc calc = new Calc();
		assertTrue(calc.subtract(5, 3) == 2);
	}

	@Test
	public void testMultiply() {
		Calc calc = new Calc();
		assertTrue(calc.multiply(4, 5) == 20);
	}

}
