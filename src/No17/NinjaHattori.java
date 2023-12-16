package No17;

import java.util.Scanner;

public class NinjaHattori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner masukan = new Scanner(System.in);

		System.out.print("Masukkan jalur ekspedisi : ");
		String[] jalur = masukan.nextLine().toLowerCase().split(" ");

		int tinggi = 0;
		int gunung = 0;
		int lembah = 0;
		
		for (int i = 0; i < jalur.length; i++) {
			if (jalur[i].equals("n")) {
				tinggi++;
			} else if (jalur[i].equals("t")) {
				tinggi--;
			}
			if ((jalur[i].equals("t")) && (tinggi == 0)) {
				gunung++;
			} else if ((jalur[i].equals("n")) && (tinggi == 0)) {
				lembah++;
			}
		}
		
		System.out.println("Gunung yang sudah dilewati  = " + gunung);
		System.out.println("Lembah yang sudah dilewati  = " + lembah);
		masukan.close();
	}

}
