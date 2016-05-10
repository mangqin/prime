import java.util.ArrayList;
import java.util.Scanner;

public class PrimeMultiplication {

	public static void main(String[] args) {
		int n = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of prime numbers you want or type 0 to quit: ");
		n = in.nextInt();
		while (n >= 1) {
			ArrayList<Integer> numbers = PrimePopulate.populate(n);
			PrintMultiplicationTable.printTable(numbers);
			System.out.println("Enter the number of prime numbers you want or type 0 to quit: ");
			n = in.nextInt();

		}
	}

}
