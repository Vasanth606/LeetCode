int mostWordsFound(char** sen, int n) {
    int count = 0, max = 0;
    for(int i = 0; i < n; i++){
           count = 0;
        for(int j = 0; j < strlen(sen[i]); j++){
           if(sen[i][j] != '\0') {
                if(isspace(sen[i][j])) count++;
           }
           if(max < count) max = count;
        }
    }
    return max+1;
}