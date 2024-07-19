/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* rearrangeArray(int* nums, int n, int* returnSize) {
    int *res = (int *)malloc( n * sizeof(int));
    int idx1 = 0, idx2 = 1;
    for(int i = 0;i < n; i++){
       if(nums[i] > 0){
        res[idx1] = nums[i];
        idx1 += 2;
       }
       if(nums[i] < 0) {
        res[idx2] = nums[i];
        idx2 += 2;
        }
    }
    *returnSize = n;
    return res;
    
}