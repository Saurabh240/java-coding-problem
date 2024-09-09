public class ContainerWithMostWater {
    public int maxArea(ArrayList<Integer> A) {
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
}
