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
		
		Locale localeID = new Locale("id", "ID");

		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", localeID);

		try {
			long penalty=100;
			// parse method is used to parse
			// the text from a string to
			// produce the date
			Date d1 = sdf.parse(start_date);
			Date d2 = sdf.parse(end_date);

			long difference_In_Time = d2.getTime() - d1.getTime();

			//long difference_In_Seconds = TimeUnit.MILLISECONDS.toSeconds(difference_In_Time) % 60;

			//long difference_In_Minutes = TimeUnit.MILLISECONDS.toMinutes(difference_In_Time) % 60;

			//long difference_In_Hours = TimeUnit.MILLISECONDS.toHours(difference_In_Time) % 24;

			long difference_In_Days = TimeUnit.MILLISECONDS.toDays(difference_In_Time) % 365;

			//long difference_In_Years = TimeUnit.MILLISECONDS.toDays(difference_In_Time) / 365l;

			System.out.print("Total pinjam: ");

			System.out.println(difference_In_Days + " hari");
			
			//buku A
			if (difference_In_Days>14 && input.contains("A")) {
				System.out.println("denda: " + penalty*(difference_In_Days-14));
				
			}else if (difference_In_Days<=14 && input.contains("A")) {
				System.out.println("Denda : 0");
			}
			
			//buku B
			if (difference_In_Days>3 && input.contains("B")) {
				System.out.println("buku B");
				System.out.println("denda: " + penalty*(difference_In_Days-3));
			}else if (difference_In_Days<=3 && input.contains("B")) {
				System.out.println("Denda : 0");
			}
			
			//buku C
			if (difference_In_Days>7 && input.contains("C")) {
				System.out.println("buku C");
				System.out.println("denda: " + penalty*(difference_In_Days-7));
			}else if (difference_In_Days<=7 && input.contains("C")) {
				System.out.println("Denda : 0");
			}
			
			//buku D
			if (difference_In_Days>7 && input.contains("D")) {
				System.out.println("buku D");
				System.out.println("denda: " + penalty*(difference_In_Days-7));
			}else if (difference_In_Days<=7 && input.contains("D")) {
				System.out.println("Denda : 0");
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
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

			System.out.print("Difference" + " between two dates is: ");

			System.out.println(difference_In_Days + " days");
		
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}


}
