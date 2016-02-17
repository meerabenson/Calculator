package cse360assign3;
	
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest 
{
	@Test
	public void testCalculator() 
	{
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	@Test
	public void testgetTotal() 
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.subtract(1);
		calc.multiply(-4);
		calc.divide(4);
		assertEquals(-4, calc.getTotal());
	}
		
	@Test
	public void testadd() 
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.add(1);
		calc.add(-4);
		calc.add(0);
		assertEquals(2, calc.getTotal());
	}
		
	@Test
	public void testsubtract() 
	{
		Calculator calc = new Calculator();
		calc.subtract(5);
		calc.subtract(1);
		calc.subtract(-4);
		calc.subtract(0);
		assertEquals(-2, calc.getTotal());
	}
	
	@Test
	public void testmultiply() 
	{
		Calculator calc = new Calculator();
		calc.multiply(5);
		calc.add(2);
		calc.multiply(-1);
		calc.multiply(4);
		assertEquals(-8, calc.getTotal());
	}
	
	@Test
	public void testdivide() 
	{
		Calculator calc = new Calculator();
		calc.divide(3);
		calc.add(10);
		calc.divide(2);
		calc.divide(-4);
		assertEquals(-1, calc.getTotal());
	}
	
	@Test
	public void testDivideByZero()
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testgetHistory() 
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.subtract(1);
		calc.multiply(-4);
		calc.divide(2);
		assertEquals("0 + 5 - 1 * -4 / 2", calc.getHistory());
	}
	
}