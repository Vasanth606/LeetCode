class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int[] nums : accounts){
            sum = 0;
            for(int n : nums){
                sum += n;
            }
            if(ans < sum) ans = sum;
        }
        return ans;
    }
}