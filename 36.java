class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rowNumAppear = new int[9];
        int[] columnNumAppear = new int[9];
        int[] gridNumAppear = new int[9];
        
        int i,j,k,t;

        for(i = 0;i < 9;i++) {
            for(j = 0;j < 9;j++){
                if(board[i][j] != '.') {
                    k = board[i][j] - 1 - '0';
                    if(rowNumAppear[k] == 0) rowNumAppear[k] = 1;
                        else return false;
                }
                if(board[j][i] != '.') {
                    t = board[j][i] - 1 - '0';
                    if(columnNumAppear[t] == 0) columnNumAppear[t] = 1;
                        else return false;
                }
            }
            for(j = 0;j < 9;j++) {
                rowNumAppear[j] = 0;
                columnNumAppear[j] = 0;
            }
        }
        i = 0;
        j = 0;
        while(i < 9) {
            k = i;
            //第一二三列的三个3*3格子
            for(;i < k + 3;i++) {
                for(j = 0;j < 3;j++) {
                    if(board[i][j] != '.') {
                        t = board[i][j] - 1 - '0';
                        if(gridNumAppear[t] == 0) gridNumAppear[t] = 1;
                        else return false;
                    }
                }
            }
            for(t = 0;t < 9;t++) gridNumAppear[t] = 0;
            //第456列的三个3*3格子
            for(i = k;i < k + 3;i++) {
                for(j = 3;j < 6;j++) {
                    if(board[i][j] != '.') {
                        t = board[i][j] - 1 - '0';
                        System.out.println("t="+t);
                        if(gridNumAppear[t] == 0) gridNumAppear[t] = 1;
                        else return false;
                    }
                }
            }
            for(t = 0;t < 9;t++) gridNumAppear[t] = 0;
            
            //第789列的三个3*3格子
            for(i = k;i < k + 3;i++) {
                for(j = 6;j < 9;j++) {
                    if(board[i][j] != '.') {
                        t = board[i][j] - 1 - '0';
                        if(gridNumAppear[t] == 0) gridNumAppear[t] = 1;
                        else return false;
                    }
                }
            }
            for(t = 0;t < 9;t++) gridNumAppear[t] = 0;
        }
        return true;
    }
}