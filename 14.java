class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        int n = strs.length,i,j,min_length;
        StringBuilder ret = new StringBuilder();
        
        min_length = strs[0].length();       
        for(i = 0;i < n;i++) {
            min_length = Math.min(min_length,strs[i].length());
            if(strs[i] == null) return null;
        }
        for(i = 0;i < min_length;i++) {
            for(j = 0;j < n - 1;j++) {
                if(strs[j].charAt(i) != strs[j + 1].charAt(i)) break;
            }
            if(j == n - 1)ret.append(strs[0].charAt(i));
                else break;
        }
        return ret.toString();
    }
}