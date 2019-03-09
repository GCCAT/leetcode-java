class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int n = s.length(),i,j,maxLength = 0;
        int[] appearTable = new int[256];
        j = 0;
        for(i = 0;i < n;i++) {
            if(appearTable[s.charAt(i)] == 0) {
                appearTable[s.charAt(i)] = 1;
            }
                else {
                    maxLength = Math.max(maxLength,i - j);
                    while (s.charAt(i) != s.charAt(j)) {
                        appearTable[s.charAt(j)] = 0;
                        j++;
                    }
                    j++;
            }
        }
        maxLength = Math.max(maxLength,i - j);
        return maxLength;
    }
}