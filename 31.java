class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length,i,j,rei = n,rej = -1,temp;
        i = n - 1;
        while(i > 0) {
            j = i - 1;
            while(j > -1) {
                if((nums[i] > nums[j]) && (i < rei) && (j > rej)) {
                    rei = i;
                    rej = j;
                } else j--;
            }
            if(rei - rej == 1)break;
            i--;
        }
                
        if(rej != -1) {
            temp = nums[rei];
            nums[rei] = nums[rej];
            nums[rej] = temp;
            Arrays.sort(nums,rej+1,n);
        } else Arrays.sort(nums);
    }
}