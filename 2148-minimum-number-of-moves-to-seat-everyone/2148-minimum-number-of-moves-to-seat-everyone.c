int minMovesToSeat(int* sea, int s, int* std, int st) {
    int c = 0;
    for(int i = 0; i < s; i++){
        for(int j = i + 1; j < s; j++){
            if(std[i] > std[j]){
                int temp = std[i];
                std[i] = std[j];
                std[j] = temp;
            }
            if(sea[i] > sea[j]){
                int temp = sea[i];
                sea[i] = sea[j];
                sea[j] = temp;
            }
        }
    }
   for(int i = 0; i < s; i++) c += abs(std[i] - sea[i]);    
   return c;
}
