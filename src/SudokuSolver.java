public class SudokuSolver {

    public static void main(String args[]) {
        SudokuSolver sudokuSolver = new SudokuSolver();
        sudokuSolver.solve();
    }

    private void solve() {
        SudokuModel sudokuModel = new SudokuModel();

        sudokuModel.setNumber(0, 0, 8);
        sudokuModel.setNumber(0, 1, 0);
        sudokuModel.setNumber(0, 2, 7);
        sudokuModel.setNumber(0, 3, 1);
        sudokuModel.setNumber(0, 4, 5);
        sudokuModel.setNumber(0, 5, 0);
        sudokuModel.setNumber(0, 6, 0);
        sudokuModel.setNumber(0, 7, 9);
        sudokuModel.setNumber(0, 8, 6);

        sudokuModel.setNumber(1, 0, 0);
        sudokuModel.setNumber(1, 1, 6);
        sudokuModel.setNumber(1, 2, 5);
        sudokuModel.setNumber(1, 3, 3);
        sudokuModel.setNumber(1, 4, 0);
        sudokuModel.setNumber(1, 5, 7);
        sudokuModel.setNumber(1, 6, 1);
        sudokuModel.setNumber(1, 7, 4);
        sudokuModel.setNumber(1, 8, 0);

        sudokuModel.setNumber(2, 0, 3);
        sudokuModel.setNumber(2, 1, 4);
        sudokuModel.setNumber(2, 2, 1);
        sudokuModel.setNumber(2, 3, 0);
        sudokuModel.setNumber(2, 4, 8);
        sudokuModel.setNumber(2, 5, 0);
        sudokuModel.setNumber(2, 6, 7);
        sudokuModel.setNumber(2, 7, 0);
        sudokuModel.setNumber(2, 8, 2);

        sudokuModel.setNumber(3, 0, 5);
        sudokuModel.setNumber(3, 1, 9);
        sudokuModel.setNumber(3, 2, 3);
        sudokuModel.setNumber(3, 3, 4);
        sudokuModel.setNumber(3, 4, 6);
        sudokuModel.setNumber(3, 5, 8);
        sudokuModel.setNumber(3, 6, 2);
        sudokuModel.setNumber(3, 7, 7);
        sudokuModel.setNumber(3, 8, 0);

        sudokuModel.setNumber(4, 0, 4);
        sudokuModel.setNumber(4, 1, 0);
        sudokuModel.setNumber(4, 2, 0);
        sudokuModel.setNumber(4, 3, 0);
        sudokuModel.setNumber(4, 4, 1);
        sudokuModel.setNumber(4, 5, 0);
        sudokuModel.setNumber(4, 6, 0);
        sudokuModel.setNumber(4, 7, 0);
        sudokuModel.setNumber(4, 8, 9);

        sudokuModel.setNumber(5, 0, 0);
        sudokuModel.setNumber(5, 1, 1);
        sudokuModel.setNumber(5, 2, 8);
        sudokuModel.setNumber(5, 3, 9);
        sudokuModel.setNumber(5, 4, 7);
        sudokuModel.setNumber(5, 5, 2);
        sudokuModel.setNumber(5, 6, 4);
        sudokuModel.setNumber(5, 7, 3);
        sudokuModel.setNumber(5, 8, 5);

        sudokuModel.setNumber(6, 0, 7);
        sudokuModel.setNumber(6, 1, 0);
        sudokuModel.setNumber(6, 2, 6);
        sudokuModel.setNumber(6, 3, 0);
        sudokuModel.setNumber(6, 4, 3);
        sudokuModel.setNumber(6, 5, 0);
        sudokuModel.setNumber(6, 6, 9);
        sudokuModel.setNumber(6, 7, 1);
        sudokuModel.setNumber(6, 8, 4);

        sudokuModel.setNumber(7, 0, 0);
        sudokuModel.setNumber(7, 1, 5);
        sudokuModel.setNumber(7, 2, 4);
        sudokuModel.setNumber(7, 3, 7);
        sudokuModel.setNumber(7, 4, 0);
        sudokuModel.setNumber(7, 5, 6);
        sudokuModel.setNumber(7, 6, 8);
        sudokuModel.setNumber(7, 7, 2);
        sudokuModel.setNumber(7, 8, 0);

        sudokuModel.setNumber(8, 0, 2);
        sudokuModel.setNumber(8, 1, 3);
        sudokuModel.setNumber(8, 2, 0);
        sudokuModel.setNumber(8, 3, 0);
        sudokuModel.setNumber(8, 4, 4);
        sudokuModel.setNumber(8, 5, 1);
        sudokuModel.setNumber(8, 6, 5);
        sudokuModel.setNumber(8, 7, 0);
        sudokuModel.setNumber(8, 8, 7);

        System.out.println("\nThe Sudoku to solve:");
        PrintSudoku.printSudoku(sudokuModel);

        System.out.println("\n\nThe solution to Sudoku (with one copy):");
        PrintSudoku.printSudoku(recurcivSudokuSolverOneCopy(sudokuModel));

        System.out.println("\n\nThe solution to Sudoku (with copies):");
        recurcivSudokuSolver(sudokuModel);
    }

    private SudokuModel recurcivSudokuSolver(SudokuModel sudokuModel) {
        boolean solved = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudokuModel.getModel()[i][j] == 0) {
                    solved = false;
                }
            }
        }
        if (solved) {
            System.out.println("Found solution:");
            PrintSudoku.printSudoku(sudokuModel);
            System.exit(0);
        } else {
            // Find next move:
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {

                    if (sudokuModel.getNumber(i, j) == 0) {
                        for (int n = 1; n < 10; n++) {
                            SudokuModel sudokuModelTry = sudokuModel.copy();
                            sudokuModelTry.setNumber(i, j, n);
                            if (ok(sudokuModelTry)) {
                                recurcivSudokuSolver(sudokuModelTry);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private SudokuModel recurcivSudokuSolverOneCopy(SudokuModel sudokuModel) {
        boolean solved = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudokuModel.getModel()[i][j] == 0) {
                    solved = false;
                }
            }
        }
        if (solved) {
            return sudokuModel;
        } else {
            // Find next move:
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {

                    if (sudokuModel.getNumber(i, j) == 0) {
                        for (int n = 1; n < 10; n++) {
                            sudokuModel.setNumber(i, j, n);
                            if (ok(sudokuModel)) {
                                recurcivSudokuSolverOneCopy(sudokuModel);
                                sudokuModel.setNumber(i, j, 0);
                            }
                        }
                    }
                }
            }
        }
        return sudokuModel;
    }

    public boolean ok(SudokuModel sudokuModel) {

        // check rows
        for (int i = 0; i < 9; i++) {
            int arr[] = new int[10];
            for (int j = 0; j < 9; j++) {
                if (sudokuModel.getModel()[i][j] != 0 && arr[sudokuModel.getModel()[i][j]] == 1)
                    return false;
                else if (sudokuModel.getModel()[i][j] != 0)
                    arr[sudokuModel.getModel()[i][j]] = 1;
            }
        }

        // check columns
        for (int i = 0; i < 9; i++) {
            int arr[] = new int[10];
            for (int j = 0; j < 9; j++) {
                if (sudokuModel.getModel()[j][i] != 0 && arr[sudokuModel.getModel()[j][i]] == 1)
                    return false;
                else if (sudokuModel.getModel()[j][i] != 0)
                    arr[sudokuModel.getModel()[j][i]] = 1;


            }
        }

        // check boxes first row
        int arr[] = new int[10];
        for (int iO = 0; iO < 3; iO++) {

            for (int jO = 0; jO < 3; jO++) {
                if (sudokuModel.getModel()[iO][jO] != 0 && arr[sudokuModel.getModel()[iO][jO]] == 1)
                    return false;
                else if (sudokuModel.getModel()[iO][jO] != 0)
                    arr[sudokuModel.getModel()[iO][jO]] = 1;
            }
        }

        arr = new int[10];
        for (int iO = 0; iO < 3; iO++) {

            for (int jO = 3; jO < 6; jO++) {
                if (sudokuModel.getModel()[iO][jO] != 0 && arr[sudokuModel.getModel()[iO][jO]] == 1)
                    return false;
                else if (sudokuModel.getModel()[iO][jO] != 0)
                    arr[sudokuModel.getModel()[iO][jO]] = 1;
            }
        }

        arr = new int[10];
        for (int iO = 0; iO < 3; iO++) {

            for (int jO = 6; jO < 9; jO++) {
                if (sudokuModel.getModel()[iO][jO] != 0 && arr[sudokuModel.getModel()[iO][jO]] == 1)
                    return false;
                else if (sudokuModel.getModel()[iO][jO] != 0)
                    arr[sudokuModel.getModel()[iO][jO]] = 1;
            }
        }

        //check boxes second row
        arr = new int[10];
        for (int iO = 3; iO < 6; iO++) {

            for (int jO = 0; jO < 3; jO++) {
                if (sudokuModel.getModel()[iO][jO] != 0 && arr[sudokuModel.getModel()[iO][jO]] == 1)
                    return false;
                else if (sudokuModel.getModel()[iO][jO] != 0)
                    arr[sudokuModel.getModel()[iO][jO]] = 1;
            }
        }

        arr = new int[10];
        for (int iO = 3; iO < 6; iO++) {

            for (int jO = 3; jO < 6; jO++) {
                if (sudokuModel.getModel()[iO][jO] != 0 && arr[sudokuModel.getModel()[iO][jO]] == 1)
                    return false;
                else if (sudokuModel.getModel()[iO][jO] != 0)
                    arr[sudokuModel.getModel()[iO][jO]] = 1;
            }
        }

        arr = new int[10];
        for (int iO = 3; iO < 6; iO++) {

            for (int jO = 6; jO < 9; jO++) {
                if (sudokuModel.getModel()[iO][jO] != 0 && arr[sudokuModel.getModel()[iO][jO]] == 1)
                    return false;
                else if (sudokuModel.getModel()[iO][jO] != 0)
                    arr[sudokuModel.getModel()[iO][jO]] = 1;
            }
        }

        //check boxes third row
        arr = new int[10];
        for (int iO = 6; iO < 9; iO++) {
            for (int jO = 0; jO < 3; jO++) {
                if (sudokuModel.getModel()[iO][jO] != 0 && arr[sudokuModel.getModel()[iO][jO]] == 1)
                    return false;
                else if (sudokuModel.getModel()[iO][jO] != 0)
                    arr[sudokuModel.getModel()[iO][jO]] = 1;
            }
        }

        arr = new int[10];
        for (int iO = 6; iO < 9; iO++) {
            for (int jO = 3; jO < 6; jO++) {
                if (sudokuModel.getModel()[iO][jO] != 0 && arr[sudokuModel.getModel()[iO][jO]] == 1)
                    return false;
                else if (sudokuModel.getModel()[iO][jO] != 0)
                    arr[sudokuModel.getModel()[iO][jO]] = 1;
            }
        }

        arr = new int[10];
        for (int iO = 6; iO < 9; iO++) {
            for (int jO = 6; jO < 9; jO++) {
                if (sudokuModel.getModel()[iO][jO] != 0 && arr[sudokuModel.getModel()[iO][jO]] == 1)
                    return false;
                else if (sudokuModel.getModel()[iO][jO] != 0)
                    arr[sudokuModel.getModel()[iO][jO]] = 1;
            }
        }

        return true;
    }

}
