int numJewelsInStones(char* jewels, char* stones) {
    int seen[256] = {0};
    int sum = 0;
    for(int i = 0; i < strlen(jewels); i++) 
        for(int j = 0;j < strlen(stones); j++)
            if(jewels[i] == stones[j]) sum++;
    return sum;  
}