class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        List<Integer> res = new ArrayList();
        for(int i : nums){
            if(num.contains(i)){
                res.add(i);
            }
            num.add(i);
        } 
        return res;
    }
}