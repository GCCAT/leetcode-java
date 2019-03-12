class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0)return -1;
        if(nums.length == 1) {
            if(nums[0] == target) return 0;
                else return -1;
        }
        int n = nums.length,left = 0,right = n - 1,mid;
        while(left < right) {
            mid = (left + right)/2;
            if(nums[mid] == target) return mid;
            else if(nums[left] == target) return left;
            else if(nums[right] == target) return right;
            
            if((nums[mid] > target && nums[left] > target && nums[left] < nums[mid]) 
               || (nums[mid] < target && nums[left] < target && nums[left] < nums[mid]) 
               || (nums[mid] < target && nums[right] > target)) 
                left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}