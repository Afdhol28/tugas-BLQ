package No8;

import java.util.Arrays;
import java.util.Collections;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Integer[] num = { 8 ,7, 0, 2, 7, 1, 7, 6, 3, 0, 7, 1, 3, 4, 6, 1, 6, 4, 3 };
 
        //  Collections.min() 
        int min = Collections.min(Arrays.asList(num));
 
        //  Collections.max()
        int max = Collections.max(Arrays.asList(num));
 
        // print
        System.out.println("Min  : "
                           + min);
        System.out.println("Max  : "
                           + max);
		
	}

}
