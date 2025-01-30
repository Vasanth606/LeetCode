class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0, j = 0,max = 0;
        while(j < nums.length){
            if(nums[j] == 1){
                j++;
                continue;
            }else{
                max = Math.max(max,j - i);
                j++; i = j;
        }
        }
                max = Math.max(max,j - i);

        return max;
    }
}