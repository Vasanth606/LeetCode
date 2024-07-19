/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
//  #include<string.h>

char** sortPeople(char** names, int n, int* heights, int h, int* returnSize) {
    for(int i = 0;i < n - 1; i++){
        for(int j = 0;j < n - 1 - i; j++){
            if(heights[j] < heights[j + 1]){
                char *name = names[j];
                names[j] = names[j + 1];
                names[j + 1] = name;

                int t = heights[j];
                heights[j] = heights[j + 1];
                heights[j + 1] = t;
            }
        }
    }
    
    *returnSize = n;
    return names;
        
}