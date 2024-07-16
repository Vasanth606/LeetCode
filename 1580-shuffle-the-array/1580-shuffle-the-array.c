

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
   int *ans = (int *)malloc(sizeof(int) * numsSize);
   int j = 0;
   for(int i = 0; i < n; i++){
      ans[j] = nums[i];
      ans[j + 1] = nums[i + n];
      j+=2;
      
   }
   *returnSize = numsSize;
   return ans;
}