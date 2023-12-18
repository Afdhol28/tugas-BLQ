package no2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class HitungDenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Pilih buku :");
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");

		String input = scan.nextLine().toUpperCase();

		System.out.println("Pinjam: ");
		String start_date = scan.nextLine();

		// Given end_date
		System.out.println("Kembali: ");
		String end_date = scan.nextLine();
		
		countDays(start_date, end_date);
		
		long days=0;

		if (input.contains("A")) {

			
						
		} else if (input.contains("B")) {

		} else if (input.contains("C")) {

		} else if (input.contains("D")) {

		} else {
			System.out.println("input salah");
		}

		

//		String start_date = "10-01-2018 01:10:20";
//
//		// Given end_date
//		String end_date = "10-06-2020 06:30:50";
//
//		// Function Call
//		findDifference(start_date, end_date);
	}

	static void findDifference(String start_date, String end_date) {
		// SimpleDateFormat converts the
		// string format to date object
		Locale localeID = new Locale("id", "ID");

		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", localeID);

		// Try Class
		try {

			// parse method is used to parse
			// the text from a string to
			// produce the date
			Date d1 = sdf.parse(start_date);
			Date d2 = sdf.parse(end_date);

			// Calculate time difference
			// in milliseconds
			long difference_In_Time = d2.getTime() - d1.getTime();

			// Calculate time difference in seconds,
			// minutes, hours, years, and days
			//long difference_In_Seconds = TimeUnit.MILLISECONDS.toSeconds(difference_In_Time) % 60;

			//long difference_In_Minutes = TimeUnit.MILLISECONDS.toMinutes(difference_In_Time) % 60;

			//long difference_In_Hours = TimeUnit.MILLISECONDS.toHours(difference_In_Time) % 24;

			long difference_In_Days = TimeUnit.MILLISECONDS.toDays(difference_In_Time) % 365;

			//long difference_In_Years = TimeUnit.MILLISECONDS.toDays(difference_In_Time) / 365l;

			// Print the date difference in
			// years, in days, in hours, in
			// minutes, and in seconds
			System.out.print("Difference" + " between two dates is: ");

			// Print result
			System.out.println(difference_In_Days + " days");
		
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	static void countDays(String start_date, String end_date) {
		// String start_date = "10 Januari 2018";

		//// Given end_date
		// String end_date = "10 Januari 2020";

		// Function Call
		findDifference(start_date, end_date);

	}

}
