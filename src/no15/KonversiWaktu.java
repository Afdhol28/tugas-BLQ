package no15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KonversiWaktu {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Input: ");

		String input = scan.nextLine();
		try {
			SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
			SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
			Date date = parseFormat.parse(input);
			System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));

		} catch (Exception e) {
			System.out.println("input salah, contoh = 03:40:44 PM");
		}
	}
}
