import java.security.InvalidParameterException;
import java.util.ArrayList;

public class PrintMultiplicationTable {
	public static void printTable (ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size()==0) {
			throw new InvalidParameterException();
		}
		int l = numbers.size();
		// get largest number of the array
		int max= numbers.get(l-1);
		// get the max width to achieve alignment. 
		// can use string length also. 
		int width =(int)Math.floor(Math.log10(max * max)) + 2;
		for (int j=-1; j<l;j++ ) {
			if (j==-1) {
				System.out.print ("          ");
				for (Integer p : numbers)  {
					System.out.print(String.format("%10d",p));
				}
				System.out.println();
			} else if (j>=0){
				System.out.print(String.format("%10d",numbers.get(j)));
				for (int i=0;i<l;i++) {
					System.out.print(String.format("%10d",(numbers.get(j))*(numbers.get(i))));
				}
				System.out.println();
			}
				
		}
	}

}
