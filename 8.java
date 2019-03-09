class Solution {
    public int myAtoi(String str) {
        if(str == "" || str == null) return 0;
        int start = 0,j,k,n = str.length();
        boolean positive;
        double ret;
        int[] nums = new int[n];
        
        start = 0;
        while(start < n && str.charAt(start) == ' ' ) {
            start++;
        }
        
        if(start == n || ((str.charAt(start) < '0' || str.charAt(start) > '9') && str.charAt(start) != '+' && str.charAt(start) != '-'))               return 0;
        
        positive = true;
        j = 0;
        k = 0;
        for(;start < n;start++) {
            if(j == 0 && str.charAt(start) == '-') { 
                positive = false;
                k++;
            } else if(j == 0 && str.charAt(start) == '+') {
                k++;
                continue;
            }else if(str.charAt(start) == ' ' || (str.charAt(start) < '0' || str.charAt(start) > '9')) { 
                start = n;
            } else {
                nums[j] = str.charAt(start) - '0';
                j++;
            }
             if(k == 2) return 0;
        }
        
        
        ret = 0;
        for(start = 0;start < j;start++) {
            ret += nums[start] * Math.pow(10,j - start - 1);
            if(!positive && -ret < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                else if(positive && ret > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        if(!positive) return (int)-ret;
            else return (int)ret;
        
    }
}