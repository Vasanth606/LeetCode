/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* numberGame(int* nums, int n, int* returnSize) {
    int min = 0;
    int *res = (int *)malloc(n * sizeof(int));
    for(int i = 0;i < n; i++)
        for(int j = i + 1; j < n; j++)
            if(nums[i] > nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } 
    for(int i = 0; i < n; i++)
        printf("%d ",nums[i]);
    for(int i = 0; i < n-1; i++){
        res[i] = nums[i + 1];
        res[i + 1] = nums[i];
        i++;
       
    }
    *returnSize = n;
    return res;
}
