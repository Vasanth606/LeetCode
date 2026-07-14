class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st= new HashSet<>();
        for(int n : nums){
            st.add(n);
        }
        if(st.size()== nums.length) return false;
        return true;
    }
}