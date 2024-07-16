char* longestCommonPrefix(char** strs, int strsSize) {
    char* res=(char*)malloc(strlen(strs[0] )+ 1 * sizeof(char));
    res[0]='\0';
    if(strsSize < 2) return strs[0];
    for(int i = 0; i < strlen(strs[0]); i++){
        int flag=1;
        for(int j = 1; j < strsSize; j++){
            if(strs[0][i] != strs[j][i]) flag=0;
        }
        if(flag){
            res[i] = strs[0][i];
            res[i+1]='\0';
        }
        else {
            if(res[0]) return res;          
            return "";
        }
    }
             
    return res;
}