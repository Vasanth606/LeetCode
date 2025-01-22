class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        for(char c : s.toCharArray()){
            m.put(c,m.getOrDefault(c,0) + 1);
            if(m.get(c) == 1) q.add(c);
        }
        System.out.println(q);
        for(int i = 0; i < s.length(); i++){
            if(m.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}