class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int s = SearchIndex(nums,target,true);
        int e = SearchIndex(nums,target,false);
        ans[0] = s;
        ans[1] = e;
        return ans;
        }
    public int SearchIndex(int[] nums, int target, boolean firstOccurence){
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;
        while(s <= e){
            int m = s + e - s / 2;
            if(target < nums[m]) e = m - 1;
            else if(target > nums[m]) s = m + 1;
            else{
                ans = m;
                if(firstOccurence) e = m - 1;
                else s = m + 1;
            }
        }
        return ans;
    }
}