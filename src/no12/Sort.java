package no12;

public class Sort {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 1, 3, 4, 7, 1, 1, 5, 6, 1, 8 };
		int index = -1;

		for (int i = 0; i < array.length; i++) {
			index = i;
			for (int j = i; j <= array.length - 1; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
			}
	}
}
