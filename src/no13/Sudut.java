package no13;

import java.util.Scanner;

public class Sudut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input: ");
		
		String[] clock = scanner.nextLine().split(":");
		
        int hour = Integer.parseInt(clock[0]);
        int minute = Integer.parseInt(clock[1]);
        
		
    System.out.println(cal_angle(hour,minute));
	}

	public static int cal_angle(int hour, int min) {
		int h_angle = (int) ((hour * 60 + min) * 0.5);
		int angle = (min * 6) - h_angle;
		// now calculate minimum angle...

		if (angle < 0)
			angle = -angle;
		return Math.min(360 - angle, angle);

	}

}
