class Solution {
    public int missingNumber(int[] nums) {
        return findMissing(nums);
    }
    public static int findMissing(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index) return index;
        }
        return arr.length;
    }
    public static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}