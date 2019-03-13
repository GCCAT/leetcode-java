class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length == 0)
            return result;
        Arrays.sort(nums);
        int[] used = new int[nums.length];
        //used 数组记录在当前排列中某个元素是否使用过。有重复元素，但只要重复元素的相对位置不变（用used判断），答案就产生重复。
        getResult(result,nums,new ArrayList<>(),used);
        return result;
    }
     
    public static void getResult(List<List<Integer>> result,int[] nums,ArrayList<Integer> ans,int[] used){
        if(ans.size() == nums.length){
            result.add(new ArrayList(ans));
            return ;
        }
        for(int i = 0;i < nums.length;i++){
            if(used[i] == 1) continue; //当前元素已用，考虑下一个
            if(i > 0 && used[i - 1] == 0 && nums[i] == nums[i - 1]) continue; 
            //两个相同元素，确定使用顺序，必须前面的用了后面的才能用。
            used[i] = 1;
            ans.add(nums[i]);
            getResult(result,nums,ans,used);
            //System.out.println("i = "+i+"  "+"ans.size()-1="+(ans.size()-1));
            ans.remove(ans.size()-1);
            used[i] = 0;
        }
    }
}