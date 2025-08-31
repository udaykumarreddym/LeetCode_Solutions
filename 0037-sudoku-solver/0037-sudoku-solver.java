class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board);
    }
    private static boolean backtrack(char[][] board){
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c] == '.'){
                    for(char ch='1';ch <= '9';ch++){
                        if(isValid(board,r,c,ch)){
                            board[r][c] = ch;
                            if (backtrack(board)) {
                                return true;
                            }
                            board[r][c] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isValid(char[][] board,int r,int c,char ch){
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == ch || board[i][c] == ch) {
                return false;
            }
        }
        int boxRow = 3 * (r / 3);
        int boxCol = 3 * (c / 3);
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board[i][j] == ch) {
                    return false;
                }
            }
        }
        return true;
    }
}