package No4;

import java.util.Scanner;

public class BilPrimaPertama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("input: ");
		int N = Integer.parseInt( scan.nextLine());
		int count = 0;
		int num = 2;
		while(count != N) { // while count!= number of prime numbers entered keep searching..
		    boolean prime = true;// to determine whether the number is prime or not
		    for (int i = 2; i <= Math.sqrt(num); i++) { //efficiency matters
		        if (num % i == 0) {
		            prime = false; // if number divides any other number its not a prime so set prime to false and break the loop.
		            break;
		        }

		    }
		    if (prime) {
		        count++;
		        System.out.println(num);
		    }
		    num++; //see if next number is prime or not.
		}
		
	}

}
