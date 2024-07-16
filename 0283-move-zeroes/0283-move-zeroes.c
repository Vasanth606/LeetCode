void moveZeroes(int* nums, int numsSize) {
    int ind = 0;
    for(int i = 0;i < numsSize; i++)
        if(nums[i] != 0) nums[ind++] = nums[i];
    for(int i = ind;i <numsSize; i++) nums[i]=0;
}