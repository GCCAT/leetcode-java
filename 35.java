class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0 || target < nums[0]) return 0;
        
        int n = nums.length,i = 0;
        if(target > nums[n - 1]) return n;
        while (i < n) {
            if(nums[i] == target) return i;
            if(i > 0 && nums[i - 1] < target && nums[i] > target) return i;
            i++;
        }
        return 0;
    }
}