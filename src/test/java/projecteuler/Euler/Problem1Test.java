package projecteuler.Euler;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Problem1Test {

	int expected;
	int actual;

	@Test
	public void zeroInputReturnsZero() {
		actual = Problem1.compute(0);
		expected = 0;
		assertEquals(expected, actual);
		}
	
	@Test
	public void threeInputReturnsThree() {
		actual = Problem1.compute(3);
		expected = 3;
		assertEquals(expected, actual);
		}
	

	@Test
	public void fiveInputReturnsFive() {
		actual = Problem1.compute(5);
		expected = 5;
		assertEquals(expected, actual);
		}
	}