/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* smallerNumbersThanCurrent(int* nums, int n, int* returnSize) {
    int *res = (int *)malloc(n * sizeof(int));
    int c = 0;
    for(int i = 0;i < n; i++){
    c = 0;
        for(int j = 0;j < n; j++){
            if(nums[i] > nums[j]) c++; 
        }
    res[i] = c;
    }
    *returnSize = n;
    return res;
}