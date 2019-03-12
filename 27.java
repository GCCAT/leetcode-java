class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int i = 0,j = 0,n = nums.length;
        while(i < n) {
            if(nums[i] == val) {
                i++;
            } else {
                nums[j] = nums[i];
                j++;
                i++;
            }
        }
        return j;
    }
}