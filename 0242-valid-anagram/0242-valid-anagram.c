bool isAnagram(char* s, char* t) {
    int seen[26] = {0};
    for(int i = 0; i < strlen(s); i++) seen[s[i] - 97]++;
    for(int i = 0; i < strlen(t); i++) seen[t[i] - 97]--;
    for(int i = 0; i < 26; i++)
        if(seen[i] != 0) return false;
    return true; 
}