int maximumWealth(int** accounts, int n, int* c) {
    int max = 0,sum = 0;
    for(int i = 0; i < n ; i++){
       sum = 0;
       for(int j = 0; j < *c; j++){
           sum += accounts[i][j]; 
       }
       if(max < sum) max = sum;  
    }
    return max;
}