class Solution {
    public String longestPalindrome(String s) {        
        if(s == null || s.length() < 2) return s;
        if(s.length() == 2) {
            if(s.charAt(0) == s.charAt(1)) return s;
            else return s.substring(0,1);
        }
        
        /*动态规划*/
        
        int n = s.length();
        boolean[][] flag = new boolean[n][n];
        int index = 0; //最长子串从index开始
        int max = 1; //长度为max
        for(int i=0;i<n;i++){
                flag[i][i] = true;
            if(i < n-1 && s.charAt(i) == s.charAt(i+1)) {
                flag[i][i+1] = true;
                index = i;
                max = 2;
            }
            
        }
        
        for(int i = 3;i <= s.length();i++){
            for(int j = 0;j <= s.length()-i;j++){
                if(flag[j+1][j+i-2] && s.charAt(j) == s.charAt(j+i-1)){
                    flag[j][j+i-1] = true;
                    index = j;
                    max = i;
                }
            }
        }
        
        return s.substring(index,index+max);
    }
}