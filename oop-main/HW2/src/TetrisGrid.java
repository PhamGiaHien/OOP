import java.util.Scanner;

public class TetrisGrid {
    private boolean[][] tetris;

    TetrisGrid (boolean[][] grid){
        int height = grid[0].length;

        if (height >= 1) {
            this.tetris = grid;
        }
    }
    public boolean[][] getGrid(){
        return this.tetris;
    }

    void clearRows() {
        int row = tetris.length;
        int col = tetris[0].length;

        for (int i = 0; i < col; i++) {
            boolean checkFull = true;

            for (int j = 0; j < row; j++){
                if (!tetris[i][j]){
                    checkFull = false;
                    break;
                }
            }

            if (checkFull){
                for (int k = col - 1; k >= 1; k--){
                    for (int l = row - 1; l >= 1; l--){
                        tetris[k][l] = tetris[k][l-1];
                    }
                }
            }
        }

        for (int i = 0; i < col; i++){
            tetris[0][i] = false;
        }
    }

    public static void main(String[] args) {
        boolean[][] grid = new boolean[][] {
                {true, false, true},
                {true, true, true},
                {false, true, false}
        };
        TetrisGrid obj = new TetrisGrid(grid);

        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        obj.clearRows();
        System.out.println("after");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
