class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int p = 0;
        int ls = 0, rs = 0, idx = -1;
        while(true){
            if(p==n)break;
            for(int i = 0;i < p ; i++)
                ls += nums[i];
            for(int i = p + 1;i < n; i++)
                rs += nums[i];
            if(ls == rs){
                idx = p;
                break;
            } 
            p++;
            ls=0;
            rs=0;
        }
        return idx;
    }
}