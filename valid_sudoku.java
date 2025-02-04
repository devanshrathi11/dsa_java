public class valid_sudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9], col = new boolean[9][9], sub = new boolean[9][9];
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char c = board[i][j];
                if (c == '.') continue;
                int num = c - '0' - 1, k = i / 3 * 3 + j / 3;
                if (row[i][num] || col[j][num] || sub[k][num]) return false;
                row[i][num] = col[j][num] = sub[k][num] = true;
            }
        }
        return true;
    }
    
}
