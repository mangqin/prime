import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author mangqin
 *
 */
public class PrimeMultiplication {

	/**
	 * main method to find prime numbers and print multiplication table
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of prime numbers you want or type 0 to quit: ");
		
		while (n >= 1) {
			try {
				String s = in.next();
				n = Integer.valueOf(s);
				ArrayList<Integer> numbers = PrimePopulate.populate(n);
				PrintMultiplicationTable.printTable(numbers);
				System.out.println("Enter the number of prime numbers you want or type 0 to quit: ");
				
	
			}
			catch (NumberFormatException  exp) {
				System.out.println("Please enter a valid number: ");
			}
		}
		
	}

}
