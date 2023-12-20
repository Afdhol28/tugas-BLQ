package no14;

import java.util.Arrays;
import java.util.Scanner;

public class Deret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan deret bilangan (pisahkan dengan spasi): ");
        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        int[] arr = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();

        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        int[] rotated = rotateArray(arr, n);
        System.out.println("Hasil perputaran deret: " + Arrays.toString(rotated));

        scanner.close();

	}
	
	public static int[] rotateArray(int[] arr, int n) {
        int length = arr.length;

        // Handle agar perputaran tidak melebihi panjang array
        n = n % length;

        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            int newIndex = (i + length - n) % length;
            result[newIndex] = arr[i];
        }

        return result;
	}

}
