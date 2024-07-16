int lengthOfLongestSubstring(char* s) {
    int count = 0, maxCount = 0;
    int seen[256] = {0};
    int start = 0 , end = 0;
    int len = strlen(s);
    for(int i = 0;i < 256; i++) seen[i] = -1;
    for(end = 0; end < len ; end++){
       if(seen[s[end]] >= start){
             start = seen[s[end]] + 1;
       }
       seen[s[end]] = end;
       count = end - start + 1;
       if(count > maxCount) maxCount = count;
    }
    return maxCount;
}