class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return new ArrayList<String>();
        String[] numChar = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        int i,j,k,t;
        List<String> ret = new ArrayList<>();
        ret.add("");

        for(i = 0;i < digits.length();i++) {
            t = digits.charAt(i) - '0';
            if(t < 2) continue;
            List<String> cur = new ArrayList<String>();
            for(k = 0;k < ret.size(); k++) {
                for(j = 0;j < numChar[t].length();j++) {
                    cur.add(ret.get(k)+numChar[t].charAt(j));
                }
            }
                
            ret = cur;
        }
        return ret;
    }
}