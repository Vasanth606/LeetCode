int countPairs(int* nums, int n, int target){
    int count = 0;
    for(int i = 0; i < n; i++)
        for(int j = i + 1; j < n; j++)
            if(nums[i] + nums[j] < target) count++;
    return count;
}