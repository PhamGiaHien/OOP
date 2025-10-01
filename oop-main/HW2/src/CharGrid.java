import java.util.Scanner;

public class CharGrid {
    private char[][] grid;

    public CharGrid(char [][] g){
        this.grid = g;
    }
    int charArea(char ch){
        int row = grid.length;
        int col = grid[0].length;

        int minrow = row;
        int mincol = col;
        int maxrow = -1;
        int maxcol = -1;
        boolean check = false;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (grid[i][j] == ch){
                    if (minrow > i) minrow = i;
                    if (mincol > j) mincol = j;
                    if (maxrow < i) maxrow = i;
                    if (maxcol < j) maxcol = j;
                    check = true;
                }
            }
        }
        if (!check) return -1;
        return (maxrow - minrow + 1) * (maxcol - mincol + 1);
    }

    int countPlus(){
        int row = grid.length;
        int col = grid[0].length;

        int cnt = 0;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){

                Character ch = grid[i][j];
                int up = 0;
                int down = 0;
                int left = 0;
                int right = 0;

                for (int a = i - 1; a >= 0 && grid[a][j] == ch; a--) up++;
                for (int a = i + 1; a < row && grid[a][j] == ch; a++) down++;
                for (int b = i - 1; b >= 0 && grid[i][b] == ch; b--) left++;
                for (int b = i + 1; b < col && grid[i][b] == ch; b++) right++;

                int plus = Math.min(Math.min(up, down), Math.min(left, right));

                if (plus >= 1) cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'.','.','x','.','.'},
                {'.','.','x','x','.'},
                {'x','x','x','x','x'},
                {'.','.','x','x','.'},
                {'.','.','x','.','.'}
        };
        CharGrid obj = new CharGrid(grid);
        Scanner input = new Scanner(System.in);
        String c = input.next();
        Character ch = c.charAt(0);

        System.out.println(obj.charArea(ch));

        System.out.println(obj.countPlus());
    }
}
