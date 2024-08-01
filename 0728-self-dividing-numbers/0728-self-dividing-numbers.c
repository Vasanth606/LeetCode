/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int divide(int n){
    int temp = n;
    if(n < 9 ) return 1;
    while(n){
        int r = n % 10;
        if(r == 0) return 0;
        if(temp % r != 0) return 0;
        n /= 10;
    }
    return 1;
}
int* selfDividingNumbers(int left, int right, int* returnSize) {
    int *ans = (int *)malloc(sizeof(int) * right);
    int c = 0;
    for(int i = left; i <= right; i++){
        if(divide(i)){ 
            ans[c++] = i;
        }
    }
    *returnSize = c;
    return ans;
}