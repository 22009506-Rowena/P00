import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest { //change comment 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@Before
	public void setUp() throws Exception {
	}
	
	
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		calculator cal = new calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	@Test
	public void testsubstract() {
		int a = 4321;
		int b = 1234;
			
		calculator cal = new calculator();
		int actual = cal.substract(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);
		}
	@Test
	public void testmultiple() {
		int a = 4;
		int b = 2;
			
		calculator cal=new calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 8;
		assertEquals (expected, actual);
		}

	public void testdivide() {
		int a = 4;
		int b = 2;
			
		calculator cal = new calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 2;
		assertEquals (expected, actual);
		}

	
	@After
	public void tearDown() throws Exception {
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}



	


}
