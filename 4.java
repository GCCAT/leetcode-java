class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int newLeft,newRight,second,third;
        if(m == 0) {
            if(n % 2 == 0) return (nums2[n / 2 - 1] + nums2[n / 2]) / 2.0;
                else return nums2[(n - 1) / 2];
        }
        if(n == 0) {
            if(m % 2 == 0) return (nums1[m / 2 - 1] + nums1[m / 2]) / 2.0;
                else return nums1[(m - 1) / 2];
        }
        
        if(m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tem = m;
            m = n;
            n = tem;
        }
        
        System.out.println("m=" + m + "n=" + n);
        int iMin = 0,iMax = m,i,j;
        while(iMin <= iMax) {
            i = (iMin + iMax)/2;
            j = (m + n) / 2 - i;
            if(i < iMax && j > 0 && nums2[j - 1] > nums1[i]) iMin = i + 1;
            else if(i > iMin && j < n && nums1[i - 1] > nums2[j]) iMax = i - 1;
            else {//i OK
                int maxLeft,minRight;
                if(i == 0) maxLeft = nums2[j - 1];
                else if(j == 0) maxLeft = nums1[i - 1];
                else maxLeft = Math.max(nums1[i-1],nums2[j-1]);
                
                
                if(i == m) minRight = nums2[j];
                else if(j == n) minRight = nums1[i];
                else minRight = Math.min(nums1[i],nums2[j]);
                
                if((m + n) % 2 == 1) return Math.max(maxLeft,minRight);
                else {
                    //if(m==1 && n>2 && maxLeft > minRight) return (nums2[j-1] + Math.max(nums2[j-2],minRight))/2.0;
                    return (maxLeft + minRight) / 2.0;
                }
            }
        }
        return 0.0;
    }
}