int singleNumber(int* nums, int n) {
    for(int i = 0; i < n; i++){
        int temp = nums[i];
        for(int j = i + 1; j < n; j++){
           if(temp == nums[j]){
                nums[i] = 0;
                nums[j] = 0;
           }
        }
    } 
       for(int i = 0; i < n; i++)
          if(nums[i] != 0) return nums[i];
        return 0;        
}