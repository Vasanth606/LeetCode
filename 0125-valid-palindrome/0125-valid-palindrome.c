
bool isPalindrome(char* s) {
    int len = strlen(s);
    char str[len + 1]; // Include space for the null terminator
    int idx = 0, c = 0;
    
    for (int i = 0; i < len; i++) {
        if (isalnum(s[i])) {
            str[idx++] = tolower(s[i]); // Store only alphanumeric characters in lowercase
        }
    }
    
    str[idx] = '\0'; // Null-terminate the string
    
    int start = 0;
    int end = idx - 1;
    
    while (start < end) {
        if (str[start] != str[end]) {
            return false;
        }
        start++;
        end--;
    }
    
    return true;
}
