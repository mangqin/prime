import java.util.ArrayList;


public class PrimePopulate {
	public static ArrayList<Integer> populate(int n) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		if (n<=0) {
			return numbers;
		}
		boolean prime = true;
		int num = 3;
		if (num >= 1) {
    		numbers.add(2);
    	}
		for ( int count = 2 ; count <=n ;  ) {
			for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) {
				if ( num%j == 0 ){
					prime = false;
					break;
				}
			}
			if ( prime ) {
				numbers.add(new Integer(num));
				count++;
			}
			prime=true;
			num++;
		}
		return numbers;
	}        
    
}
