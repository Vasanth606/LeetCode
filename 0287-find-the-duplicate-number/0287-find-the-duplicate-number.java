class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> num = new HashSet();
        for(int i : nums){
            if(num.contains(i)) return i;
            num.add(i);
        }
        return 0;
    }
}