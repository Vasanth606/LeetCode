class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, currentGas = 0, startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];
            // If currentGas is negative, reset the starting index and currentGas
            if (currentGas < 0) {
                startIndex = i + 1;
                currentGas = 0;
            }
        }

        // If totalGas is less than totalCost, it's impossible to complete the circuit
        if (totalGas < totalCost) {
            return -1;
        }

        return startIndex;
    }
}
