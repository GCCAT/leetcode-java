class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        
        int i,flag,index,interval;
        for(i = 0;i < Math.ceil(numRows / 2.0);i++) {
            interval = 2 * numRows - 2 - 2 * i;
            flag = 1;
            for(index = i;index < s.length();) {
                ret.append(s.charAt(index));
                if(i > 0){
                    if(flag == 1)index = index + interval;
                    else index = index + 2 * i;
                    flag = -flag;
                } else {
                    index = index + interval;
                }
                
        }
        }
        for(;i < numRows;i++) {
            interval = 2 * numRows - 2 - 2 * (numRows - 1 - i);
            flag = 1;
            for(index = i;index < s.length();) {
                ret.append(s.charAt(index));
                if(i < numRows - 1) {
                    if(flag == 1)index = index + 2 * (numRows - 1 - i);
                    else index = index + interval; 
                    flag = -flag;
                } else {
                    index = index + interval;
                }
                
                  
        }
        }
            return ret.toString();
    }
}