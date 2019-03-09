class Solution {
    public int get_int(char c) {
        int ret = 0;
        switch(c) {
            case 'I': ret = 1;break;
            case 'V': ret =  5;break;
            case 'X': ret =  10;break;     
            case 'L': ret =  50;break;
            case 'C': ret =  100;break;
            case 'D': ret =  500;break;
            case 'M': ret =  1000;break;
        }
        return ret;
    }
    public int romanToInt(String s) {
        if(s == "") return 0;
        if(s.length() == 1)return get_int(s.charAt(0));
        int i = 0,sum = get_int(s.charAt(0));
        while(i < s.length() - 1) {
            if(get_int(s.charAt(i)) < get_int(s.charAt(i + 1)))
                sum = sum + get_int(s.charAt(i + 1)) - 2 * get_int(s.charAt(i));
            else 
                sum = sum + get_int(s.charAt(i + 1));
            i++;
        }
        return sum;
    }
}