class Solution {
    public int pivotIndex(int[] nums) {
        int n  = nums.length;
        int idx = 0, flag = 0;
        int ls[] = new int[n];
        int rs[] = new int[n];
        ls[0] = 0;
        rs[n - 1] = 0;
        for(int i = 1; i < n; i++) 
            ls[i] = ls[i - 1] + nums[i - 1];
        for(int i = n - 2; i >= 0; i--) 
            rs[i] = rs[i + 1] + nums[i + 1];
        for(int i = 0; i < n; i++)
            if(ls[i] == rs[i]){
                flag = 1;
                idx = i;
                break;
            }
        if(flag == 1) return idx;
        else return -1;
    }
}