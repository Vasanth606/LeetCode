int digitsum(int n){
    int sum = 0;
    while(n){
        sum += n % 10;
        n /= 10;
    }
    return sum;
}
int differenceOfSum(int* nums, int n) {
    int sum1 = 0, sum2 = 0;
    for(int i = 0; i < n; i++){
        sum1 += nums[i];
        if(nums[i] < 10)
            sum2 += nums[i];
        else sum2 += digitsum(nums[i]);
    }
     return sum1 - sum2;
}