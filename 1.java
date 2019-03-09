class Solution {
    public int[] twoSum(int[] nums, int target) {
        int SIZE = 2,LENGTH = nums.length;
        int[] result = new int[SIZE];
        for (int i = 0;i < LENGTH;i++) {
            for (int j = i+1;j < LENGTH;j++) {
                if (nums[j] == target-nums[i]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}