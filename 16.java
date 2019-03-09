class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int i,left,right,sum,min_diff = Integer.MAX_VALUE,ret = 0;
       
        Arrays.sort(nums);
        
        for(i = 0;i< nums.length - 2;i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            left = i + 1;
            right = nums.length - 1;
            while(left < right) {
                sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(sum - target) < min_diff) {
                    min_diff = Math.abs(sum - target);
                    ret = sum;
                    //while(left < right && nums[left] == nums[left + 1]) left++;
                    //这里不能这么用，因为这里是三数之和靠近某一个数字，而不是0，有可能是同一个数字加几次得到这个target
                    //eg： [-20,-19,-19,-19,-18,-18] -59 加上这段while答案就是-57，但正确答案应该是-58
                    //while(left < right && nums[right] == nums[right - 1]) right--;
                }
                
                if (sum - target == 0) return ret;
                else if(sum - target < 0) left++;
                else right--;
            } 
        }
        return ret;
    }
}