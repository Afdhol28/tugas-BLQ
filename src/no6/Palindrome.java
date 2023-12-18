package no6;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String r = ""; //To store the reverse
		    Scanner scan = new Scanner(System.in);
		    System.out.println("input: ");
		    String s = scan.next(); // Entering the string

		    for(int i= s.length() - 1;i>=0;i--) {
		        r = r + s.charAt(i);
		    }

		    if(r.equals(s)) {
		        System.out.println("Palindrome");
		    }
		    else {
		        System.out.println("Bukan Palindrome");
		    }
		    
	}

}
