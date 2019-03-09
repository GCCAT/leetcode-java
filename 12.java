class Solution {
    public String intToRoman(int num) {
        if(num == 0)return null;
        int[] numBit = new int[4];
        String[][] value = new String[][]{
            {"","I", "II", "III", "IV", "V","VI", "VII", "VIII", "IX"},
            {"","X", "XX", "XXX", "XL", "L","LX", "LXX", "LXXX", "XC"},
            {"","C", "CC", "CCC", "CD", "D","DC", "DCC", "DCCC", "CM"},
            {"","M", "MM", "MMM"}
        };

        StringBuilder ret = new StringBuilder("");
        int i = 0;
        while(num != 0) {//numBit[0]存储最低位
            numBit[i] = num % 10;
            num /= 10;
            i++;
        }
        i = 3;
        while(numBit[i] == 0) i--;
        while(i > -1) {
            ret.append(value[i][numBit[i]]);
            i--;
        }
        return ret.toString();
    }
}