bool uniqueOccurrences(int* arr, int n) {
   int seen[2001] = { 0 };
   for(int i = 0; i < n; i++){
        if(arr[i] < 0) seen[arr[i] + 1001]++;
        else seen[arr[i]]++;
   }
   for(int i = 0; i < 2001; i++){
        for(int j = i + 1; j < 2001; j++){
            if(seen[i] == seen[j] && seen[i] != 0){
                    return false;
            }
        }
   }
    return true;
}