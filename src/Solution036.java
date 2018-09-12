/**
 * 36. 有效的数独
 * Created by nanca on 9/12/2018.
 */
public class Solution036 {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][][] blocks = new int[3][3][9];


        int x = 0;
        int y = 0;

        for (int i = 0;i < 9; i++) {
            if ( i > 5) {
                x = 2;
            } else if (i > 2) {
                x = 1;
            } else {
                x = 0;
            }

            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if ('.' == c) {
                    continue;
                }
                //System.out.println(c);
                int n = c - '0';

                if (rows[i][n-1] == 0) {
                    rows[i][n-1] = n;
                } else {
                    //System.out.println("rows:" + rows[i][n-1]);
                    return false;
                }

                if (cols[n-1][j] == 0) {
                    cols[n-1][j] = n;
                } else {
                    //System.out.println("cols:" + cols[i][n-1]);
                    return false;
                }

                if ( j > 5) {
                    y = 2;
                } else if (j > 2) {
                    y = 1;
                } else {
                    y = 0;
                }
                if (blocks[x][y][n-1] == 0) {
                    blocks[x][y][n-1] = n;
                } else {
                    //System.out.println("blocks:" + " " + x + " " + y + " " + blocks[x][y][n-1]);
                    return false;
                }

            }
        }

        return true;
    }

    public boolean isValidSudoku2(char[][] board) {
        for (int i = 0; i < 9; i++){
            int[] row = new int[9];
            int[] line = new int[9];
            int[] three = new int[9];
            int RowIndex = 3 * (i / 3);
            int ColIndex = 3 * (i % 3);
            for (int j = 0; j < 9; j++){
                char cl = board[i][j];
                char cr = board[j][i];
                if (cl != '.'){
                    line[cl - '1']++;
                    if (line[cl - '1'] >= 2)
                        return false;
                }
                if (cr != '.'){
                    row[cr - '1']++;
                    if (row[cr - '1'] >= 2)
                        return false;
                }
                char c =board[RowIndex + j/3][ColIndex + j%3];
                if (c != '.'){
                    three[c - '1']++;
                    if (three[c - '1'] >=2)
                        return false;
                }
            }
        }
        return true;
    }
}
