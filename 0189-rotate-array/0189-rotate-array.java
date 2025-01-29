class Solution {
    public static void reverse(int[] temp,int s ,int e){
        while(s < e){
            int t = temp[s];
            temp[s] = temp[e];
            temp[e] = t;
            s++;e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n - 1);
        reverse(nums,0,k - 1);
        reverse(nums,k, n - 1 );
    }
}