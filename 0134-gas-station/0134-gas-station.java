class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tG = 0, tC = 0, cG = 0, s = 0;
        for(int i = 0; i < gas.length ; i++){
            tG += gas[i];
            tC += cost[i];
            cG += gas[i] - cost[i];
            if(cG < 0){
                s = i + 1;
                cG = 0;
            }
            
        }
        if(tG < tC) return -1;
        return s;
    }
}