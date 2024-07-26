/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* targetIndices(int* nums, int n, int target, int* returnSize) {
    int *res = (int *)malloc(n * sizeof(int));
    for(int i = 0; i < n; i++){
        for(int j = i + 1; j < n; j++){
            if(nums[i] > nums[j]){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            }
        }
    }
    int idx = 0, flag = 0;
    for(int i = 0; i < n; i++){
        if(nums[i] == target){
            res[idx++] = i ; 
            flag++;
        }
    }
    *returnSize = flag;
    return res;
}