package no22;

public class Lilin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] panjangLilin = { 3, 3, 9, 6, 7, 8, 23 };

		int hasil = lilinPertamaHabisMeleleh(panjangLilin);

		if (hasil != -1) {
			System.out.println("Lilin yang paling pertama habis meleleh: Lilin ke-" + hasil);
		} else {
			System.out.println("Semua lilin meleleh.");
		}

	}

	public static int lilinPertamaHabisMeleleh(int[] panjangLilin) {
		int n = panjangLilin.length;

		if (n <= 2) {
			return n; // Lilin ke-1 atau ke-2 yang pertama habis meleleh
		}

		int a = 1, b = 1;
		int c = 0;
		int i = 2;

		while (i < n) {
			c = panjangLilin[i];
			int melted = a + b;
			if (c <= melted) {
				return i + 1;
			}
			a = b;
			b = melted;
			i++;
		}

		return -1; // Semua lilin meleleh
	}

}
