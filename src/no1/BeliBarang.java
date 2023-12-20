package no1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeliBarang {

	static class Barang {
		String nama;
		List<Integer> harga;

		Barang(String nama, List<Integer> harga) {
			this.nama = nama;
			this.harga = harga;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Barang> daftarBarang = new ArrayList<>();
		daftarBarang.add(new Barang("Kacamata", Arrays.asList(500, 600, 700, 800)));
		daftarBarang.add(new Barang("Baju", Arrays.asList(200, 400, 350)));
		daftarBarang.add(new Barang("Sepatu", Arrays.asList(400, 350, 200, 300)));
		daftarBarang.add(new Barang("Buku", Arrays.asList(100, 50, 150)));

		int uang = 1000;

		int maxUang = 0;
		int maxItem = 0;

		List<Integer> itemTerpilih = new ArrayList<>();

		for (int i = 0; i < daftarBarang.get(0).harga.size(); i++) {
			for (int j = 0; j < daftarBarang.get(1).harga.size(); j++) {
				for (int k = 0; k < daftarBarang.get(2).harga.size(); k++) {
					for (int l = 0; l < daftarBarang.get(3).harga.size(); l++) {
						int total = daftarBarang.get(0).harga.get(i) + daftarBarang.get(1).harga.get(j)
								+ daftarBarang.get(2).harga.get(k) + daftarBarang.get(3).harga.get(l);
						if (total <= uang) {
							int itemCount = 0;
							itemCount += (i > 0) ? 1 : 0;
							itemCount += (j > 0) ? 1 : 0;
							itemCount += (k > 0) ? 1 : 0;
							itemCount += (l > 0) ? 1 : 0;

							if (total > maxUang || (total == maxUang && itemCount > maxItem)) {
								maxUang = total;
								maxItem = itemCount;
								itemTerpilih.clear();
								if (i > 0)
									itemTerpilih.add(daftarBarang.get(0).harga.get(i));
								if (j > 0)
									itemTerpilih.add(daftarBarang.get(1).harga.get(j));
								if (k > 0)
									itemTerpilih.add(daftarBarang.get(2).harga.get(k));
								if (l > 0)
									itemTerpilih.add(daftarBarang.get(3).harga.get(l));
							}
						}
					}
				}
			}
		}

		System.out.println("Jumlah uang yang dipakai: " + maxUang);
		System.out.print("Jumlah item yang bisa dibeli: " + maxItem + " (");
		for (int item : itemTerpilih) {
			System.out.print(item + " ");
		}
		System.out.println(")");
	}

}
