class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int ans = 0;
        for(int i = 0; i < tokens.length; i++){
            String c = tokens[i];
            if(c.equals("+")) {
                int a = s.pop() ;
                int b = s.pop();
                ans = b + a; 
                s.push(ans);
                }
            else if(c.equals("-")){
                int a = s.pop() ;
                int b = s.pop();
                ans = b - a; 
                s.push(ans);
                }
            else if(c.equals("*")) {
                int a = s.pop() ;
                int b = s.pop();
                ans = b * a; 
                s.push(ans);
                }
            else if(c.equals("/"))
            {
                int a = s.pop() ;
                int b = s.pop();
                ans = b / a; 
                s.push(ans);
                }
            else s.push(Integer.parseInt(c));
        }
        return s.peek();
    }
}