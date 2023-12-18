package no9;

import java.util.Scanner;

public class Deret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("input: ");
		int angka = input.nextInt();

		int awal = angka;

		for (int i = 0; i < angka; i++) {
			System.out.print(awal + " ");

			awal = awal + angka;
		}
		
	}

}
