bool isPalindrome(char* s) {
    int len = strlen(s);
    char str[len + 1]; 
    int idx = 0, c = 0;
    for (int i = 0; i < len; i++) {
        if (isalnum(s[i])) {
            str[idx++] = tolower(s[i]); 
        }
    }
    str[idx] = '\0'; 
    int start = 0;
    int end = idx - 1;
    while (start < end) {
        if (str[start] != str[end]) return false;
        start++;
        end--;
    }
    return true;
}
