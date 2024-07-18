int numberOfPairs(int* nums1, int n1, int* nums2, int n2, int k) {
    int sum = 0;
    for(int i = 0; i < n1; i++){
        for(int j = 0;j < n2; j++){
            if(nums1[i] % (nums2[j] * k) == 0) sum++;
        }
    }
    return sum;
}