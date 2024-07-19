int maxProfit(int* nums, int n) {
    int min = nums[0], max = 0;
    for(int i = 1; i < n; i++){
        if(nums[i] < min) min = nums[i];
        if(nums[i] - min > max) max = nums[i] - min;    
    }
        return max;
}
