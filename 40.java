class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(candidates.length == 0) return result;
        Arrays.sort(candidates);
        getResult(candidates,target,0,result,new ArrayList<Integer>());
        return result;
    }
     
    public void getResult(int[] candidates, int target,int pos, List<List<Integer>> result,List<Integer> ans){
        for(int i = pos;i < candidates.length;i++){
           if(target == candidates[i]){
                //if(i > 0 && candidates[i] == candidates[i - 1]) continue;
                ans.add(candidates[i]);
                result.add(new ArrayList<Integer>(ans));
                ans.remove(ans.size() - 1);
                return;
           }
           else if(target > candidates[i]) {
                ans.add(candidates[i]);
                getResult(candidates,target - candidates[i],i + 1,result,ans);
                ans.remove(ans.size() - 1);
                while(i + 1 < candidates.length && candidates[i] == candidates[i + 1]) i++; 
           } else
                  return ;
        }
    }
}