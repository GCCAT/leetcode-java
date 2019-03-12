class Solution {
    
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length,left = 0,right = n - 1,mid;
        int[] ret = new int[]{-1,-1};
        
        if(nums.length == 0) return ret;
        if(target < nums[0] || target > nums[n - 1]) return ret;
         
        while(left <= right) {
            mid = (left + right)/2;
            if(nums[mid] == target) {
                ret[0] = mid;
                ret[1] = mid;
            } else if(nums[left] == target) {
                ret[0] = left;
                ret[1] = left;
            } else if(nums[right] == target) {
                ret[0] = right;
                ret[1] = right;
            }
            
            if(ret[0] != -1) {
                while(ret[0] > -1 && nums[ret[0]] == target) ret[0]--;
                while(ret[1] < n && nums[ret[1]] == target) ret[1]++;
                ret[0]++;
                ret[1]--;
                return ret;
            }
            
            if(target > nums[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return ret;
    }
}