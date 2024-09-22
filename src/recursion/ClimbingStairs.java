package src.recursion;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }
    public static int climb_Stairs(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
    /**
     * //Brute Force Approach
     *     public int climbStairs(int n) {
     *         return climb_stairs(0, n);
     *     }
     *
     *     public int climb_stairs(int i, int n) {
     *         if(i > n) return 0;
     *         if(i == n) return 1;
     *
     *         return climb_stairs(i + 1, n) + climb_stairs(i + 2, n);
     *     }
     */
}

