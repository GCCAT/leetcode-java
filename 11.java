class Solution {
    public int maxArea(int[] height) {
        if(height.length == 0) return 0;
        int n = height.length,i,j,maxArea = 0;
        /*一开始写的，时长太高。。*/
        /*for(i = 0;i < n;i++) {
            for(j = n;j < n;j++) {
                maxArea = Math.max(maxArea,(j - i) * Math.min(height[i],height[j]));
                //System.out.print(maxArea+"   ");
            }
        }*/
        
        for(i = 0,j = n - 1;i < j;) {
            maxArea = Math.max(maxArea,(j - i) * Math.min(height[i],height[j]));
            if(height[i]>height[j]) j--;
            else i++;
        }
        return maxArea;
    }
}