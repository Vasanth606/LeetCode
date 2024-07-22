int add(int n){
   int sum = 0;
    while(n){
        sum += n % 10;
        n /= 10;
    }
    return sum;
}
int getLucky(char* s, int k) {
    int sum = 0;
    int seen[27] ={ 0 };
    for(int i = 1;i < 27; i++)
        seen[i] = i ;
    for(int i = 0; s[i] != '\0'; i++){
        if(seen[s[i] - 96] > 9) sum += add(seen[s[i] - 96]);
        else sum += seen[s[i] - 96];
    }
    printf("%d",sum);
    if(k == 1 ) return sum;
    if(k == 2) {
        sum = add(sum);
        return sum;
    }
    else 
        for(int i = k;i > 0; i--) 
             sum = add(sum);
                 
    
    return sum;
}