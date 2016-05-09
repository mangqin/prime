import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PrimePopulateTest {

	@Test
	public void populateWith0 () {
		ArrayList<Integer> a = PrimePopulate.populate(0);
		assertEquals (a.size(),0);
	}
	
	@Test
	public void populateWith10 () {
		ArrayList<Integer> a = PrimePopulate.populate(10);
		assertEquals (a.size(),10);
	}
	
	@Test
	public void populateWith100 () {
		ArrayList<Integer> a = PrimePopulate.populate(100);
		assertEquals (a.size(),100);
	}
}
