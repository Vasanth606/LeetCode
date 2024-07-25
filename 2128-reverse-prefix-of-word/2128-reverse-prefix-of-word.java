class Solution {
    public String reversePrefix(String word, char ch) {
        int s = word.length();
        String rev = "";
        String ans = "";
        for(int i = 0; i < s; i++){
            if(word.charAt(i) != ch){
                ans += word.charAt(i); 
            }
            else{
                ans += word.charAt(i);
                for(int j = 0; j < ans.length(); j++){
                    char c = ans.charAt(j);
                    rev = c + rev;
                }
            System.out.println(ans);
            System.out.println(rev);
            ans = rev;
            for(int j = i + 1; j < s; j++){
                ans += word.charAt(j);
            }
            break;
            }
        }
       
        return ans;
    }
}