char* intToRoman(int num) {
         int nums[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
         const char *sym[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
         char *arr[50];
         int i = 12,j=0;
         char *res = (char*)malloc(20*sizeof(char));
         int idx = 0;
         while(num){
            int rem = num / nums[i];
            num = num % nums[i];
            while(rem--){
                int len =strlen(sym[i]);
                res[idx++] = sym[i][0];
                if(len==2) res[idx++] = sym[i][1]; 
            }
            i--;
         }
         res[idx] = '\0';
        return res;
}