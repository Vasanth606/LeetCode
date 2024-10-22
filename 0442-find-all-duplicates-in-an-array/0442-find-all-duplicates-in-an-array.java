class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // HashSet<Integer> num = new HashSet<>();
        // List<Integer> res = new ArrayList();
        // for(int i : nums){
        //     if(num.contains(i)){
        //         res.add(i);
        //     }
        //     num.add(i);
        // } 
        // return res;
         int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1) ans.add(arr[index]);
        }
        return ans;
    }
    public static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}