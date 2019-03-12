class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(candidates.length == 0) return result;
        Arrays.sort(candidates);
        getResult(candidates,target,0,result,new ArrayList<Integer>());
        return result;
    }
     
    public void getResult(int[] candidates, int target,int pos, List<List<Integer>> result,List<Integer> ans){
        for(int i = pos;i < candidates.length;i++){
           if(target == candidates[i]){
                ans.add(candidates[i]);
                result.add(new ArrayList(ans));
                ans.remove(ans.size() - 1);
                return;
           }
           else if(target > candidates[i]){
                ans.add(candidates[i]);
                getResult(candidates,target - candidates[i],i,result,ans);
                ans.remove(ans.size() - 1);
        }else
            return ;
       }
    }
}
