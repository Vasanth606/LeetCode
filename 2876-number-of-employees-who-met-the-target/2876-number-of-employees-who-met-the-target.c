int numberOfEmployeesWhoMetTarget(int* hours, int n, int target){
     int c = 0;
     for(int i = 0; i < n; i++)
        if(hours[i] >= target) c++;
     return c;   
}