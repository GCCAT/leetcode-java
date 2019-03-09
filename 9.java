class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int noteX = x,reverseX = 0;
        while(x != 0) {
            reverseX = x % 10 + 10 * reverseX;
            x /= 10;
        }
       
        if(reverseX == noteX) return true;
            else return false;
    }
}