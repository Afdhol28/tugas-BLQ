package No19;

import java.util.Iterator;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Your String:");

		// membaca karakter sampai akhir
		String str = scan.nextLine();

		//hilangkan spasi & lowercase
		str = str.replaceAll("", "").toLowerCase();

		// empty string
		String s = "";

		// checking characters (a-z or A-Z)
		for (char i = 'a'; i <= 'z'; i++) {

			// indexOf(char i)--> This method returns '-1' substring not found, if the
			// position of substrings 'i' in 'str'
			if (str.indexOf(i) != -1) {

				s = s + i;// empty string+character
			}
		}
		if (s.length() == 26) {
			System.out.println("Pangram");
		} else {
			System.out.println(" Bukan Pangram");
		}
	}

}
