class Solution {
    public String countAndSay(int n) {
        StringBuilder[] count = new StringBuilder[30];
        count[0] = new StringBuilder();
        count[0].append("1");
        count[1] = new StringBuilder();
        count[1].append("11");
        int i,j,k;
        for(i = 2;i < n;i++){
            count[i] = new StringBuilder();
            j = 1;
            k = 1;
            while(j < count[i - 1].length()) {
                if(count[i - 1].charAt(j) != count[i - 1].charAt(j - 1)) {
                    count[i].append(k).append(count[i - 1].charAt(j - 1));
                    k = 1;
                } else k++;
                j++;         
            }
            count[i].append(k).append(count[i - 1].charAt(j - 1));
        }
        return count[n-1].toString();
    }
}