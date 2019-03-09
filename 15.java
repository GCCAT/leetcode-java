class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i,n = nums.length,left,right;
        List<List<Integer>> ls = new ArrayList<>();
        if(n < 3) return ls;
        for(i = 0;i < n;i++) if(nums[i] != 0)break;
        if(i == n) {
            ls.add(Arrays.asList(0,0,0));
            return ls;
        }
        
        Arrays.sort(nums);
        for(i = 0;i< n - 2;i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            left = i + 1;
            right = n - 1;
            while(left < right) {
                if(nums[left] + nums[right] == - nums[i]) {
                    ls.add(Arrays.asList(nums[i], nums[left], nums[right]));        
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if(nums[left] + nums[right] < - nums[i]) {
                    //while(left < right && nums[left] == nums[left + 1]) left++;
                    left++;
                } else {
                    //while(left < right && nums[right] == nums[right - 1]) right--;
                    right--;
                }
            } 
        }
        return ls;
    }
}