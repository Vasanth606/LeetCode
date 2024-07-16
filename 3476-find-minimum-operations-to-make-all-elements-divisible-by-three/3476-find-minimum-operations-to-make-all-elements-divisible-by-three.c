int minimumOperations(int* nums, int n) {
    int count = n;
    for(int i = 0;i < n; i++){
        if(nums[i] % 3 == 0) count--;
    }   
    return count;
}