/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findWordsContaining(char** words, int n, char x, int* returnSize) {
    int *ans = (int *)malloc(n * sizeof(int));
    int idx = 0;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < strlen(words[i]); j++)
            if(words[i][j] == x){
                ans[idx++] = i;
                break;
            }
    }
    *returnSize = idx;
    return ans;
}