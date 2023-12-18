package no7;

import java.util.Arrays;

public class MeanMedianModus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 8, 7, 0, 2, 7, 1, 7, 6, 3, 0, 7, 1, 3, 4, 6, 1, 6, 4, 3 };
        int n = a.length;
       
        // Function call
        System.out.println("Mean = " + findMean(a, n));
        System.out.println("Median = " + findMedian(a, n));
        System.out.println("Modus = " + mode(a));

	}
	
	// Function for calculating mean
    public static double findMean(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];
 
        return (double)sum / (double)n;
    }
 
    // Function for calculating median
    public static double findMedian(int a[], int n)
    {
        // First we sort the array
        Arrays.sort(a);
 
        // check for even case
        if (n % 2 != 0)
            return (double)a[n / 2];
 
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }
    
    public static int mode( int[] n) {
        int maxKey = 0;
        int maxCounts = 0;

        int[] counts = new int[n.length];

        for (int i=0; i < n.length; i++) {
            counts[n[i]]++;
            if (maxCounts < counts[n[i]]) {
                maxCounts = counts[n[i]];
                maxKey = n[i];
            }
        }
        return maxKey;
    }

}
