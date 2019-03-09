class Solution {
    public boolean isValid(String s) {
        if(s == null || s == "" || s.length() % 2 == 1) return false;
        int n,i;
        while(s.length() != 0){
            i = 0;
            n = s.length();
            while(i < s.length() - 1) {
            if((s.charAt(i) == '(' && s.charAt(i + 1) == ')') || (s.charAt(i) == '[' && s.charAt(i + 1) == ']') 
               || (s.charAt(i) == '{' && s.charAt(i + 1) == '}')) {
                if(i + 2 < s.length()) s = s.substring(0 , i) + s.substring(i + 2);
                else s = s.substring(0 , i);
            }
            i++;
            }
            if(s.length() == n) return false;
        }
        return true;
    }
}