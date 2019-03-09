class Solution {
    public int reverse(int x) {
        if(x == -Math.pow(2,31))return 0;
        if(Math.abs(x) < 10) return x;
        int xx,i,n = 0;
        double ret;
        
        xx = x;
        while (x != 0) {
            x = x /10;
            n++;
        }
        
        x = xx;
        int[] xNums=new int[n];
        if(x < 0) x = - x;
        i = 0;
        while (x != 0) {
            xNums[i] = x % 10;
            x = x / 10;
            i++;
        }
        
        ret = 0;
        for(i = 0;i < n;i++) {
            ret = xNums[i] * Math.pow(10,n-i-1) + ret;
            if(ret > Math.pow(2,31)-1) return 0;
        }
        if(xx < 0) return (int)-ret;
        else return (int)ret;
    }
}