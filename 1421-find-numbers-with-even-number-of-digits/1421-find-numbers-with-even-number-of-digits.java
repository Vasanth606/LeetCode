class Solution {
    public int findNumbers(int[] nums) {
        int c = 0; 
        for(int i : nums){
            if(even(i)){
                c++;
            }
        }
        return c;
    }
    public static boolean even(int num){
        return ((int)(Math.log10(num)) + 1) % 2 == 0;
    }
}