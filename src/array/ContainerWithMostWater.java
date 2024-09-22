package src.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerWithMostWater {
    public static int maxArea(ArrayList<Integer> A) {
        int ans = 0  ;
        int low = 0; 
        int high = A.size() - 1 ;
    
        while( low < high )
        {
            if ( A.get(low)< A.get(high) )
            {
                ans = Math.max( ans , ( A.get(low) * ( high - low )   ) ) ;
                low++ ; 
            }
            else
            {
                ans = Math.max( ans , A.get(high) * ( high - low ) ) ;
                high-- ;
            }
            
            
        }
        return ans ; 
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,4,7,2,9,5));
        System.out.println("Max Area "+maxArea(A));

    }
}
