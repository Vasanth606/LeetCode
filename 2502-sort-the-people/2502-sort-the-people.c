/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 #include<string.h>

char** sortPeople(char** names, int namesSize, int* heights, int heightsSize, int* returnSize) {
    int size=namesSize;
    char** ans=(char **)malloc(size * sizeof(char *));
    for(int i=0;i<size-1;i++){
        for(int j=0;j<size-1-i;j++){
            if(heights[j]<heights[j+1]){
                char * temp=names[j];
                names[j]=names[j+1];
                names[j+1]=temp;

                int temp1=heights[j];
                heights[j]=heights[j+1];
                heights[j+1]=temp1;
            }
        }
    }
    for(int i=0;i<size;i++){
        ans[i]=(char *)malloc((strlen(names[i])+1)*sizeof(char));
        strcpy(ans[i],names[i]);
    }
    * returnSize=size;
    return ans;

}