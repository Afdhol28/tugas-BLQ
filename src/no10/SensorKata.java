package no10;

import java.util.Scanner;

public class SensorKata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("input: ");
		
		String str = scan.nextLine();
		String repl = str.replaceAll("\\B\\w\\B", "*");
		//=> s***********w
		
		System.out.println(repl);
		
	}

}
