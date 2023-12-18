package no11;

import java.util.Arrays;
import java.util.Scanner;

public class No11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("input : ");
		String[] input = scan.nextLine().toLowerCase().split("");
		
		
		for (int i = input.length-1; i >=0 ; i--) {
			System.out.println("**"+input[i]+"**");
		}
		
	}

}
