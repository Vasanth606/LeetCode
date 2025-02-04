class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        long ans = 0;
        for(int i : nums1) list.add(i);
        for(int i : nums2) list.add(i);
        Collections.sort(list);
        System.out.print(list.size());
        if(list.size() % 2 == 0){
            int t = list.size() / 2;
            long n1 = list.get(t);
            long n2 = list.get(t-1);
            ans = n1 + n2;
        }else{
            return list.get(list.size() / 2);
        }
        return ans / 2.0000;
    }
}