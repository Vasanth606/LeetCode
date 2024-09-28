class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        int s = peak(nums, n);
        int ans = search(nums,target,0,s);
        if(ans == -1) return search(nums,target,s + 1, n);
        return ans;
    }
    static int peak(int[] nums, int n){
        int s = 0, e = n;
        while(s < e){
            int m = s + (e - s) / 2;
            if(m < n && nums[m] > nums[m + 1]) return m;
            else if(m > 0 && nums[m] < nums[m - 1]) return m-1;
            else if(nums[m] > nums[0]) s = m + 1;
            else e = m - 1;
        }
        return -1;
    }
    static int search(int[] nums,int tar,int s,int e){
        while(s <= e){
            int m = s + (e - s) / 2;;
            if(nums[m] < tar) s = m + 1;
            else if(nums[m] > tar) e = m - 1;
            else return m;
        }
        return -1;
    }
}