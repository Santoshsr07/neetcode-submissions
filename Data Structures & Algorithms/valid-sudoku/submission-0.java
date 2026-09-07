class Solution {
    public boolean isValidSudoku(char[][] board) {

        boolean[][] raw = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] cell = new boolean[9][9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') continue;

                int num = board[i][j] - '1';
                int box = (i / 3) * 3 + (j / 3);

                if (raw[i][num] || col[j][num] || cell[box][num]) return false;

                raw[i][num] = true;
                col[j][num] = true;
                cell[box][num] = true;
            }
        }
        return true;
    }
}