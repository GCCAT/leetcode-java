class Solution {
    public int longestValidParentheses(String s) {
        if(s == null || s.length() < 2) return 0;
        int i = 0,beginIndex = 0,maxlength = 0;
        //stack 记录左括号 有左括号push 右括号pop
        //index 动态数组 记录当前栈内各元素下标 方便计算长度
        Stack left = new Stack();
        ArrayList<Integer> index = new ArrayList<Integer>();
        for(i = 0;i < s.length();i++) {
            if(s.charAt(i) == '(') {
                left.push(s.charAt(i));
                index.add(i);
            } else {
                if(left.empty()) beginIndex = i + 1; //当前没有左括号，右括号是多余的。下一个起始点到i+1
                else {
                    left.pop();
                    index.remove(index.size() - 1);
                    if(left.empty()) maxlength = Math.max(maxlength,i - beginIndex + 1);
                    else maxlength = Math.max(maxlength,i - index.get(index.size() - 1));
                }
            }
        }
        return maxlength;
    }
}