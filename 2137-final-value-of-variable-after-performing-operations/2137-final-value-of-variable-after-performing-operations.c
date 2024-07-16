int finalValueAfterOperations(char** operations, int n) {
    int x = 0;
    for(int i = 0; i < n; i++){
        if(operations[i][1] == '+') x++;
        else x--;
    }
    return x;
}