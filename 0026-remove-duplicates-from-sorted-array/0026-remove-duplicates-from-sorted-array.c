int removeDuplicates(int* nums, int numsSize) {
    //if(numsSize<=0) return 0;
    int k = 1;
    for(int i = 1;i < numsSize; i++){
      if(nums[i-1] != nums[i]){
          nums[k] = nums[i];
          k++;
      }
   }
   printf("%d",k);
   return k;
}