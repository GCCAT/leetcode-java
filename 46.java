class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length == 0)
            return result;
        getResult(result,nums,new ArrayList<Integer>());
        return result;
    }
     
    public static void getResult(List<List<Integer>> result,int[] nums,ArrayList<Integer> ans){
        //ans相当于一个临时数组（动态），当其长度增加到nums长度时，说明已经把nums里面元素全加进来了，便可续在result后面
        if(ans.size() == nums.length){
            result.add(new ArrayList(ans));
            return ; //回溯算法，返回上一层 
        }
        for(int i = 0;i < nums.length;i++){
            if(!ans.contains(nums[i])){
                ans.add(nums[i]);
                getResult(result,nums,ans);
                //System.out.println(ans);
                ans.remove((Integer)nums[i]);//回溯的精华所在
            }
        }   
    }
}