package no18;

public class Kalori {

	public static void main(String[] args) {

				int[] waktuMakanKue = { 9, 13, 15, 17 }; // Jam makan kue
				int[] kaloriKue = { 30, 20, 50, 80 }; // Kalori dari setiap kue
				int waktuMulaiOlahraga = 18; // Jam mulai olahraga

				int totalWaktuOlahraga = waktuMulaiOlahraga - waktuMakanKue[waktuMakanKue.length - 1];
				double totalKalori = 0;

				for (int kalori : kaloriKue) {
					totalKalori += kalori;
				}

				double durasiOlahraga = 0.1 * totalKalori; // Dalam jam
				int jumlahInterval = (int) (durasiOlahraga / 0.5); // Jumlah interval minum air
				int volumeAir = jumlahInterval * 100 + 500; // Volume air yang diminum Donna

				System.out.println("Volume air yang diminum Donna selama berolahraga: " + volumeAir + " cc");

	}

}
