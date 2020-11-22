public class PrintSudoku {
    public static void printSudoku(SudokuModel sudokuModel) {
        for (int i = 0; i < 9; i++) {
            if(i==3||i==6)
                System.out.println();
            for (int j = 0; j < 9; j++) {
                if (j == 3 || j==6 )
                    System.out.print(" | ");
                int number = sudokuModel.getModel()[i][j];
                if (number == 0)
                    System.out.print("  ");
                else
                    System.out.print(" " + sudokuModel.getModel()[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
