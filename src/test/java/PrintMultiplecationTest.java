import java.security.InvalidParameterException;
import java.util.ArrayList;

import org.junit.Test;

public class PrintMultiplecationTest {
	
	@Test (expected=InvalidParameterException.class)
	public void printWithNull (){
		PrintMultiplicationTable.printTable(null);
	}

	@Test (expected=InvalidParameterException.class)
	public void printEmpty () {
		ArrayList<Integer> a = new ArrayList<Integer>();
		PrintMultiplicationTable.printTable(a);
		
	}
	
	@Test
	public void printWorks () {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(44);
		a.add(12);
		PrintMultiplicationTable.printTable(a);
		
	}
}
