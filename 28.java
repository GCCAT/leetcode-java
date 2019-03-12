class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == null) return 0;
        if(haystack == null && needle != null) return -1;
        int n1 = haystack.length(),n2 = needle.length(),i,j,k;
        for(i = 0;i < n1 - n2 + 1;i++) {
            j = 0;
            k = i;
            while(j < n2) {
                if(haystack.charAt(i) == needle.charAt(j)) {
                    j++;
                    i++;
                }
                else break;
            }
            if(j == n2) return k;
            i = k;
        }
        return -1;
    }
}