package no3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TarifParkir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Given start Date
        String start_date
            = "02-27-2023 01:00:00";
 
        // Given end Date
        String end_date
            = "03-27-2023 21:00:00";
 
        // Function Call
        findDifference(start_date, end_date);
        
       
        
	}

	static void findDifference(String start_date, String end_date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		try {
			// parse method is used to parse
			// the text from a string to
			// produce the date
			Date d1 = sdf.parse(start_date);
			Date d2 = sdf.parse(end_date);

			// Calculate time difference
			// in milliseconds
			long difference_In_Time = d2.getTime() - d1.getTime();

			// Calculate time difference in
			// seconds, minutes, hours, years,

			long difference_In_Hours = (difference_In_Time / (1000 * 60 * 60)) % 24;


			// Print the date difference in
			// years, in days, in hours, in
			// minutes, and in seconds

			System.out.print("Total : ");

			System.out.println(difference_In_Hours+" jam " );
			
			long fee=0;
			
			if (difference_In_Hours<=8) {
				long total_fee = fee + 1000 * difference_In_Hours;
				System.out.println("Total fee= "+total_fee);
			}else if (difference_In_Hours>8) {
				long total_fee = fee + 8000;
				System.out.println("Total fee= "+total_fee);
			}else if (difference_In_Hours>=24) {
				long total_fee = fee + 15000;
				System.out.println("Total fee= "+total_fee);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
