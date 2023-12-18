package no1;

import java.util.Arrays;

public class BeliBarang {

	static int number(int[] a, int n, int p, int k) {

// Sort the given array
		Arrays.sort(a);

// Variables to store the prefix
// sum, answer and the counter
// variables
		int[] pre = new int[n];
		int val, i, j, ans = 0;

// Initializing the first element
// of the prefix array
		pre[0] = a[0];

// If we can buy at least one item
		if (pre[0] <= p)
			ans = 1;

// Iterating through the first
// K items and finding the
// prefix sum
		for (i = 1; i < k - 1; i++) {
			pre[i] = pre[i - 1] + a[i];

			// Check the number of items
			// that can be bought
			if (pre[i] <= p)
				ans = i + 1;
		}
		pre[k - 1] = a[k - 1];

// Finding the prefix sum for
// the remaining elements
		for (i = k - 1; i < n; i++) {
			if (i >= k) {
				pre[i] += pre[i - k] + a[i];
			}

			// Check the number of items
			// that can be bought
			if (pre[i] <= p)
				ans = i + 1;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
	    int[] arr = { 2, 4, 3, 5, 7 };
	    int p = 11;
	    int k = 2;
	 
	    System.out.println(number(arr, n, p, k));
		
	}

}
