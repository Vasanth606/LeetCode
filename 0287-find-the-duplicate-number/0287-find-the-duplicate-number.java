class Solution {
    public int findDuplicate(int[] nums) {
        // Set<Integer> num = new HashSet();
        // for(int i : nums){
        //     if(num.contains(i)) return i;
        //     num.add(i);
        // }
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }
                else return nums[i];
            }
            else i++;
        }
        return -1;
    }
    public static void swap(int[] arr,int f,int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}