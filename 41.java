class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0) return 1;
        Arrays.sort(nums);
        if(nums[0] > 1 || nums[nums.length - 1] < 0) return 1;
        int i = 0,flag = 0;
        while(i < nums.length) {
            if(nums[i] == 1) flag = 1;
            if(nums[i] > 1 && flag == 0) return 1;
            if(i + 1 < nums.length && nums[i] > 0 && nums[i + 1] - nums[i] > 1) return nums[i] + 1;
            i++;
        }
        return nums[nums.length - 1] + 1;
    }
}