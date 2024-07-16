int lengthOfLastWord(char* s) {
    int count = 0 , end = strlen(s) - 1;
    for(int i = end ; i >= 0; i--){
        if(!isspace(s[i])) count++;
        if(i != 0 && !isspace(s[i]) && isspace(s[i- 1]) ) break;
        else if(i==0) return count;
        
    }
    return count;
}