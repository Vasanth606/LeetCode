int firstUniqChar(char* s) {
    int seen[26] = {0};
    int numsSize = strlen(s);
    for(int i = 0;i < numsSize; i++) seen[s[i]-97]++;
    for(int i = 0;i < numsSize; i++) 
       if(seen[s[i]-97] == 1) return i;
    return -1;    
}