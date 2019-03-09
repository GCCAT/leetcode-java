class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int i,j,n = nums.length,left,right;
        List<List<Integer>> ls = new ArrayList<>();
        if(n < 4) return ls;
        for(i = 0;i < n;i++) if(nums[i] != 0)break;
        if(i == n && target == 0) {
            ls.add(Arrays.asList(0,0,0,0));
            return ls;
        }
        
        Arrays.sort(nums);
        for(i = 0;i< n - 3;i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(j = i + 1;j < n - 2;j++) {
                if(j != i + 1 && nums[j] == nums[j - 1]) continue;
                left = j + 1;
                right = n - 1;
                while(left < right) {
                    if(nums[left] + nums[right] + nums[i] + nums[j] == target) {
                        ls.add(Arrays.asList(nums[i],nums[j], nums[left], nums[right]));        
                        while(left < right && nums[left] == nums[left + 1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if(nums[left] + nums[right] + nums[i] + nums[j] < target) {
                        //while(left < right && nums[left] == nums[left + 1]) left++;
                        left++;
                    } else {
                        //while(left < right && nums[right] == nums[right - 1]) right--;
                        right--;
                    }
                }
            } 
        }
        return ls;
    }
}
