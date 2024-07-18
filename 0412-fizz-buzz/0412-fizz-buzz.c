/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
char** fizzBuzz(int n, int* returnSize) {
    char **ans = (char **)malloc(n * sizeof(char*));
    for(int i = 0;i < n ; i++) 
        ans[i] = (char *)malloc(10);
    for(int i = 1; i <= n ; i++){
          if(i % 3 == 0 && i % 5 == 0) strcpy(ans[i-1] , "FizzBuzz");
          else if(i % 3 == 0 ) strcpy(ans[i-1], "Fizz");
          else if(i % 5 == 0) strcpy(ans[i-1] , "Buzz");
          else sprintf(ans[i-1] ,"%d" , i);
    }
    *returnSize = n;
    return ans;
}