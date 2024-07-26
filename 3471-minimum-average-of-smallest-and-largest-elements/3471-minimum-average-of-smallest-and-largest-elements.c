#include <stdio.h>
#include <limits.h>
#include <float.h>

int min(int arr[], int n) {
    int minEle = INT_MAX, idx = -1;
    for (int i = 0; i < n; i++) {
        if (arr[i] != -1 && arr[i] < minEle) {
            minEle = arr[i];
            idx = i;
        }
    }
    if (idx != -1) {
        arr[idx] = -1; 
    }
    return minEle;
}

int max(int arr[], int n) {
    int maxEle = INT_MIN, idx = -1;
    for (int i = 0; i < n; i++) {
        if (arr[i] != -1 && arr[i] > maxEle) {
            maxEle = arr[i];
            idx = i;
        }
    }
    if (idx != -1) {
        arr[idx] = -1; 
    }
    return maxEle;
}

double minimumAverage(int* nums, int n) {
    double minAvg = DBL_MAX;
    int original_n = n;
    
    while (n > 1) { 
        int currentMin = min(nums, original_n);
        int currentMax = max(nums, original_n);

        if (currentMin == -1 || currentMax == -1) break;

        double avg = (currentMin + currentMax) / 2.0; 
        if (avg < minAvg) minAvg = avg;  
        n -= 2; 
    }

    return minAvg;
}
