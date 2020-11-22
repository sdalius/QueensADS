import static org.junit.jupiter.api.Assertions.*;

class SudokuSolverTest {

    @org.junit.jupiter.api.Test
    void testRow_OK_noError() {
        SudokuModel sudokuModel = makeModelNoError();
        SudokuSolver sudokuSolver = new SudokuSolver();
        assertTrue(sudokuSolver.ok(sudokuModel));
    }

    @org.junit.jupiter.api.Test
    void testRow_OK_noErrorEmpty() {
        SudokuModel sudokuModel = makeModelNoErrorEmpty();
        SudokuSolver sudokuSolver = new SudokuSolver();
        assertTrue(sudokuSolver.ok(sudokuModel));
    }

    @org.junit.jupiter.api.Test
    void test_OK_Error_row0() {
        SudokuModel sudokuModel = makeModelErrorRow0();
        SudokuSolver sudokuSolver = new SudokuSolver();
        assertFalse(sudokuSolver.ok(sudokuModel));
    }

    @org.junit.jupiter.api.Test
    void test_OK_Error_row5() {

        SudokuModel sudokuModel = makeModelErrorRow5();
        SudokuSolver sudokuSolver = new SudokuSolver();
        PrintSudoku.printSudoku(sudokuModel);
        assertFalse(sudokuSolver.ok(sudokuModel));
    }

    @org.junit.jupiter.api.Test
    void test_OK_Error_row8() {
        SudokuModel sudokuModel = makeModelErrorRow8();
        SudokuSolver sudokuSolver = new SudokuSolver();
        assertFalse(sudokuSolver.ok(sudokuModel));
    }

    @org.junit.jupiter.api.Test
    void test_OK_Error_col0() {
        SudokuModel sudokuModel = makeModelErrorCol0();
        SudokuSolver sudokuSolver = new SudokuSolver();
        assertFalse(sudokuSolver.ok(sudokuModel));
    }

    @org.junit.jupiter.api.Test
    void test_OK_Error_col5() {
        SudokuModel sudokuModel = makeModelErrorCol5();
        SudokuSolver sudokuSolver = new SudokuSolver();
        PrintSudoku.printSudoku(sudokuModel);
        assertFalse(sudokuSolver.ok(sudokuModel));
    }

    @org.junit.jupiter.api.Test
    void test_OK_Error_col8() {
        SudokuModel sudokuModel = makeModelErrorCol8();
        SudokuSolver sudokuSolver = new SudokuSolver();
        assertFalse(sudokuSolver.ok(sudokuModel));
    }


    @org.junit.jupiter.api.Test
    void test_OK_Error_Box0() {
        SudokuModel sudokuModel = makeModelErrorBox0();
        //PrintSoduko.printSoduko(sodukoModel);
        SudokuSolver sudokuSolver = new SudokuSolver();
        assertFalse(sudokuSolver.ok(sudokuModel));
    }

    @org.junit.jupiter.api.Test
    void test_OK_Error_Box5() {
        SudokuModel sudokuModel = makeModelErrorBox5();
        SudokuSolver sudokuSolver = new SudokuSolver();
        PrintSudoku.printSudoku(sudokuModel);
        assertFalse(sudokuSolver.ok(sudokuModel));
    }

    @org.junit.jupiter.api.Test
    void test_OK_Error_Box8() {
        SudokuModel sudokuModel = makeModelErrorBox8();
        SudokuSolver sudokuSolver = new SudokuSolver();
        assertFalse(sudokuSolver.ok(sudokuModel));
    }


    private SudokuModel makeModelNoError() {
        SudokuModel sudokuModel = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModel.setNumber(i, j, 0);
            }

        }
        sudokuModel.setNumber(0, 0, 5);
        sudokuModel.setNumber(0, 1, 3);
        sudokuModel.setNumber(0, 4, 7);

        sudokuModel.setNumber(1, 0, 6);
        sudokuModel.setNumber(1, 3, 1);
        sudokuModel.setNumber(1, 4, 9);
        sudokuModel.setNumber(1, 5, 5);

        sudokuModel.setNumber(2, 1, 9);
        sudokuModel.setNumber(2, 2, 8);
        sudokuModel.setNumber(2, 7, 6);

        sudokuModel.setNumber(3, 0, 8);
        sudokuModel.setNumber(3, 4, 6);
        sudokuModel.setNumber(3, 8, 3);

        sudokuModel.setNumber(4, 0, 4);
        sudokuModel.setNumber(4, 3, 8);
        sudokuModel.setNumber(4, 5, 3);
        sudokuModel.setNumber(4, 8, 1);

        sudokuModel.setNumber(5, 0, 7);
        sudokuModel.setNumber(5, 4, 2);
        sudokuModel.setNumber(5, 8, 6);

        sudokuModel.setNumber(6, 1, 6);
        sudokuModel.setNumber(6, 6, 2);
        sudokuModel.setNumber(6, 7, 8);

        sudokuModel.setNumber(7, 3, 4);
        sudokuModel.setNumber(7, 4, 1);
        sudokuModel.setNumber(7, 5, 9);
        sudokuModel.setNumber(7, 8, 5);

        sudokuModel.setNumber(8, 4, 8);
        sudokuModel.setNumber(8, 7, 7);
        sudokuModel.setNumber(8, 8, 9);

        return sudokuModel;
    }
    private SudokuModel makeModelNoErrorEmpty() {
        SudokuModel sudokuModel = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModel.setNumber(i, j, 0);
            }
        }
        return sudokuModel;
    }

    private SudokuModel makeModelErrorRow0() {
        SudokuModel sudokuModel = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModel.setNumber(i, j, 0);
            }

        }
        sudokuModel.setNumber(0, 0, 5);
        sudokuModel.setNumber(0, 1, 3);
        sudokuModel.setNumber(0, 4, 7);
        sudokuModel.setNumber(0, 6, 3);

        sudokuModel.setNumber(1, 0, 6);
        sudokuModel.setNumber(1, 3, 1);
        sudokuModel.setNumber(1, 4, 9);
        sudokuModel.setNumber(1, 5, 5);

        sudokuModel.setNumber(2, 1, 9);
        sudokuModel.setNumber(2, 2, 8);
        sudokuModel.setNumber(2, 7, 6);

        sudokuModel.setNumber(3, 0, 8);
        sudokuModel.setNumber(3, 4, 6);
        sudokuModel.setNumber(3, 8, 3);

        sudokuModel.setNumber(4, 0, 4);
        sudokuModel.setNumber(4, 3, 8);
        sudokuModel.setNumber(4, 5, 3);
        sudokuModel.setNumber(4, 8, 1);

        sudokuModel.setNumber(5, 0, 7);
        sudokuModel.setNumber(5, 4, 2);
        sudokuModel.setNumber(5, 8, 6);

        sudokuModel.setNumber(6, 1, 6);
        sudokuModel.setNumber(6, 6, 2);
        sudokuModel.setNumber(6, 7, 8);

        sudokuModel.setNumber(7, 3, 4);
        sudokuModel.setNumber(7, 4, 1);
        sudokuModel.setNumber(7, 5, 9);
        sudokuModel.setNumber(7, 8, 5);

        sudokuModel.setNumber(8, 4, 8);
        sudokuModel.setNumber(8, 7, 7);
        sudokuModel.setNumber(8, 8, 9);

        return sudokuModel;
    }
    private SudokuModel makeModelErrorRow5() {
        SudokuModel sudokuModel = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModel.setNumber(i, j, 0);
            }

        }
        sudokuModel.setNumber(0, 0, 5);
        sudokuModel.setNumber(0, 1, 3);
        sudokuModel.setNumber(0, 4, 7);
       // sodukoModel.setNumber(0, 6, 3);

        sudokuModel.setNumber(1, 0, 6);
        sudokuModel.setNumber(1, 3, 1);
        sudokuModel.setNumber(1, 4, 9);
        sudokuModel.setNumber(1, 5, 5);

        sudokuModel.setNumber(2, 1, 9);
        sudokuModel.setNumber(2, 2, 8);
        sudokuModel.setNumber(2, 7, 6);

        sudokuModel.setNumber(3, 0, 8);
        sudokuModel.setNumber(3, 4, 6);
        sudokuModel.setNumber(3, 8, 3);

        sudokuModel.setNumber(4, 0, 4);
        sudokuModel.setNumber(4, 3, 8);
        sudokuModel.setNumber(4, 5, 3);
        sudokuModel.setNumber(4, 8, 1);
        sudokuModel.setNumber(4, 6, 1);

        sudokuModel.setNumber(5, 0, 7);
        sudokuModel.setNumber(5, 4, 2);
        sudokuModel.setNumber(5, 8, 6);

        sudokuModel.setNumber(6, 1, 6);
        sudokuModel.setNumber(6, 6, 2);
        sudokuModel.setNumber(6, 7, 8);

        sudokuModel.setNumber(7, 3, 4);
        sudokuModel.setNumber(7, 4, 1);
        sudokuModel.setNumber(7, 5, 9);
        sudokuModel.setNumber(7, 8, 5);

        sudokuModel.setNumber(8, 4, 8);
        sudokuModel.setNumber(8, 7, 7);
        sudokuModel.setNumber(8, 8, 9);

        return sudokuModel;
    }
    private SudokuModel makeModelErrorRow8() {
        SudokuModel sudokuModel = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModel.setNumber(i, j, 0);
            }

        }
        sudokuModel.setNumber(0, 0, 5);
        sudokuModel.setNumber(0, 1, 3);
        sudokuModel.setNumber(0, 4, 7);
       // sodukoModel.setNumber(0, 6, 3);

        sudokuModel.setNumber(1, 0, 6);
        sudokuModel.setNumber(1, 3, 1);
        sudokuModel.setNumber(1, 4, 9);
        sudokuModel.setNumber(1, 5, 5);

        sudokuModel.setNumber(2, 1, 9);
        sudokuModel.setNumber(2, 2, 8);
        sudokuModel.setNumber(2, 7, 6);

        sudokuModel.setNumber(3, 0, 8);
        sudokuModel.setNumber(3, 4, 6);
        sudokuModel.setNumber(3, 8, 3);

        sudokuModel.setNumber(4, 0, 4);
        sudokuModel.setNumber(4, 3, 8);
        sudokuModel.setNumber(4, 5, 3);
        sudokuModel.setNumber(4, 8, 1);

        sudokuModel.setNumber(5, 0, 7);
        sudokuModel.setNumber(5, 4, 2);
        sudokuModel.setNumber(5, 8, 6);

        sudokuModel.setNumber(6, 1, 6);
        sudokuModel.setNumber(6, 6, 2);
        sudokuModel.setNumber(6, 7, 8);

        sudokuModel.setNumber(7, 3, 4);
        sudokuModel.setNumber(7, 4, 1);
        sudokuModel.setNumber(7, 5, 9);
        sudokuModel.setNumber(7, 8, 5);

        sudokuModel.setNumber(8, 0, 8);
        sudokuModel.setNumber(8, 4, 8);
        sudokuModel.setNumber(8, 7, 7);
        sudokuModel.setNumber(8, 8, 9);

        return sudokuModel;
    }

    private SudokuModel makeModelErrorCol0() {
        SudokuModel sudokuModel = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModel.setNumber(i, j, 0);
            }

        }
        sudokuModel.setNumber(0, 0, 5);
        sudokuModel.setNumber(0, 1, 3);
        sudokuModel.setNumber(0, 4, 7);
       // sodukoModel.setNumber(0, 6, 3);

        sudokuModel.setNumber(1, 0, 6);
        sudokuModel.setNumber(1, 3, 1);
        sudokuModel.setNumber(1, 4, 9);
        sudokuModel.setNumber(1, 5, 5);

        sudokuModel.setNumber(2, 1, 9);
        sudokuModel.setNumber(2, 2, 8);
        sudokuModel.setNumber(2, 7, 6);
        sudokuModel.setNumber(6, 2, 8);

        sudokuModel.setNumber(3, 0, 8);
        sudokuModel.setNumber(3, 4, 6);
        sudokuModel.setNumber(3, 8, 3);

        sudokuModel.setNumber(4, 0, 4);
        sudokuModel.setNumber(4, 3, 8);
        sudokuModel.setNumber(4, 5, 3);
        sudokuModel.setNumber(4, 8, 1);

        sudokuModel.setNumber(5, 0, 7);
        sudokuModel.setNumber(5, 4, 2);
        sudokuModel.setNumber(5, 8, 6);

        sudokuModel.setNumber(6, 1, 6);
        sudokuModel.setNumber(6, 6, 2);
        sudokuModel.setNumber(6, 7, 8);

        sudokuModel.setNumber(7, 3, 4);
        sudokuModel.setNumber(7, 4, 1);
        sudokuModel.setNumber(7, 5, 9);
        sudokuModel.setNumber(7, 8, 5);

        sudokuModel.setNumber(8, 4, 8);
        sudokuModel.setNumber(8, 7, 7);
        sudokuModel.setNumber(8, 8, 9);

        return sudokuModel;
    }
    private SudokuModel makeModelErrorCol5() {
        SudokuModel sudokuModel = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModel.setNumber(i, j, 0);
            }

        }
        sudokuModel.setNumber(0, 0, 5);
        sudokuModel.setNumber(0, 1, 3);
        sudokuModel.setNumber(0, 4, 7);
        // sodukoModel.setNumber(0, 6, 3);

        sudokuModel.setNumber(1, 0, 6);
        sudokuModel.setNumber(1, 3, 1);
        sudokuModel.setNumber(1, 4, 9);
        sudokuModel.setNumber(1, 5, 5);
        sudokuModel.setNumber(6, 5, 5);

        sudokuModel.setNumber(2, 1, 9);
        sudokuModel.setNumber(2, 2, 8);
        sudokuModel.setNumber(2, 7, 6);

        sudokuModel.setNumber(3, 0, 8);
        sudokuModel.setNumber(3, 4, 6);
        sudokuModel.setNumber(3, 8, 3);

        sudokuModel.setNumber(4, 0, 4);
        sudokuModel.setNumber(4, 3, 8);
        sudokuModel.setNumber(4, 5, 3);
        sudokuModel.setNumber(4, 8, 1);
        sudokuModel.setNumber(4, 6, 1);

        sudokuModel.setNumber(5, 0, 7);
        sudokuModel.setNumber(5, 4, 2);
        sudokuModel.setNumber(5, 8, 6);

        sudokuModel.setNumber(6, 1, 6);
        sudokuModel.setNumber(6, 6, 2);
        sudokuModel.setNumber(6, 7, 8);

        sudokuModel.setNumber(7, 3, 4);
        sudokuModel.setNumber(7, 4, 1);
        sudokuModel.setNumber(7, 5, 9);
        sudokuModel.setNumber(7, 8, 5);

        sudokuModel.setNumber(8, 4, 8);
        sudokuModel.setNumber(8, 7, 7);
        sudokuModel.setNumber(8, 8, 9);

        return sudokuModel;
    }
    private SudokuModel makeModelErrorCol8() {
        SudokuModel sudokuModel = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModel.setNumber(i, j, 0);
            }

        }
        sudokuModel.setNumber(0, 0, 5);
        sudokuModel.setNumber(0, 1, 3);
        sudokuModel.setNumber(0, 4, 7);
        // sodukoModel.setNumber(0, 6, 3);

        sudokuModel.setNumber(1, 0, 6);
        sudokuModel.setNumber(1, 3, 1);
        sudokuModel.setNumber(1, 4, 9);
        sudokuModel.setNumber(1, 5, 5);

        sudokuModel.setNumber(2, 1, 9);
        sudokuModel.setNumber(2, 2, 8);
        sudokuModel.setNumber(2, 7, 6);

        sudokuModel.setNumber(3, 0, 8);
        sudokuModel.setNumber(3, 4, 6);
        sudokuModel.setNumber(3, 8, 3);
        sudokuModel.setNumber(8, 8, 3);

        sudokuModel.setNumber(4, 0, 4);
        sudokuModel.setNumber(4, 3, 8);
        sudokuModel.setNumber(4, 5, 3);
        sudokuModel.setNumber(4, 8, 1);

        sudokuModel.setNumber(5, 0, 7);
        sudokuModel.setNumber(5, 4, 2);
        sudokuModel.setNumber(5, 8, 6);

        sudokuModel.setNumber(6, 1, 6);
        sudokuModel.setNumber(6, 6, 2);
        sudokuModel.setNumber(6, 7, 8);

        sudokuModel.setNumber(7, 3, 4);
        sudokuModel.setNumber(7, 4, 1);
        sudokuModel.setNumber(7, 5, 9);
        sudokuModel.setNumber(7, 8, 5);

        sudokuModel.setNumber(8, 0, 8);
        sudokuModel.setNumber(8, 4, 8);
        sudokuModel.setNumber(8, 7, 7);
        sudokuModel.setNumber(8, 8, 9);

        return sudokuModel;
    }

    private SudokuModel makeModelErrorBox0() {
        SudokuModel sudokuModel = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModel.setNumber(i, j, 0);
            }

        }
        sudokuModel.setNumber(0, 0, 5);
        sudokuModel.setNumber(0, 1, 3);
        sudokuModel.setNumber(0, 4, 7);
        sudokuModel.setNumber(1, 2, 5);

        sudokuModel.setNumber(1, 0, 6);
        sudokuModel.setNumber(1, 3, 1);
        sudokuModel.setNumber(1, 4, 9);
        sudokuModel.setNumber(1, 5, 5);

        sudokuModel.setNumber(2, 1, 9);
        sudokuModel.setNumber(2, 2, 8);
        sudokuModel.setNumber(2, 7, 6);

        sudokuModel.setNumber(3, 0, 8);
        sudokuModel.setNumber(3, 4, 6);
        sudokuModel.setNumber(3, 8, 3);

        sudokuModel.setNumber(4, 0, 4);
        sudokuModel.setNumber(4, 3, 8);
        sudokuModel.setNumber(4, 5, 3);
        sudokuModel.setNumber(4, 8, 1);

        sudokuModel.setNumber(5, 0, 7);
        sudokuModel.setNumber(5, 4, 2);
        sudokuModel.setNumber(5, 8, 6);

        sudokuModel.setNumber(6, 1, 6);
        sudokuModel.setNumber(6, 6, 2);
        sudokuModel.setNumber(6, 7, 8);

        sudokuModel.setNumber(7, 3, 4);
        sudokuModel.setNumber(7, 4, 1);
        sudokuModel.setNumber(7, 5, 9);
        sudokuModel.setNumber(7, 8, 5);

        sudokuModel.setNumber(8, 4, 8);
        sudokuModel.setNumber(8, 7, 7);
        sudokuModel.setNumber(8, 8, 9);

        return sudokuModel;
    }
    private SudokuModel makeModelErrorBox5() {
        SudokuModel sudokuModel = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModel.setNumber(i, j, 0);
            }

        }
        sudokuModel.setNumber(0, 0, 5);
        sudokuModel.setNumber(0, 1, 3);
        sudokuModel.setNumber(0, 4, 7);
        // sodukoModel.setNumber(0, 6, 3);

        sudokuModel.setNumber(1, 0, 6);
        sudokuModel.setNumber(1, 3, 1);
        sudokuModel.setNumber(1, 4, 9);
        sudokuModel.setNumber(1, 5, 5);

        sudokuModel.setNumber(2, 1, 9);
        sudokuModel.setNumber(2, 2, 8);
        sudokuModel.setNumber(2, 7, 6);

        sudokuModel.setNumber(3, 0, 8);
        sudokuModel.setNumber(3, 4, 6);
        sudokuModel.setNumber(3, 8, 3);
        sudokuModel.setNumber(4, 6, 3);

        sudokuModel.setNumber(4, 0, 4);
        sudokuModel.setNumber(4, 3, 8);
        sudokuModel.setNumber(4, 5, 3);
        sudokuModel.setNumber(4, 8, 1);


        sudokuModel.setNumber(5, 0, 7);
        sudokuModel.setNumber(5, 4, 2);
        sudokuModel.setNumber(5, 8, 6);

        sudokuModel.setNumber(6, 1, 6);
        sudokuModel.setNumber(6, 6, 2);
        sudokuModel.setNumber(6, 7, 8);

        sudokuModel.setNumber(7, 3, 4);
        sudokuModel.setNumber(7, 4, 1);
        sudokuModel.setNumber(7, 5, 9);
        sudokuModel.setNumber(7, 8, 5);

        sudokuModel.setNumber(8, 4, 8);
        sudokuModel.setNumber(8, 7, 7);
        sudokuModel.setNumber(8, 8, 9);

        return sudokuModel;
    }
    private SudokuModel makeModelErrorBox8() {
        SudokuModel sudokuModel = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModel.setNumber(i, j, 0);
            }

        }
        sudokuModel.setNumber(0, 0, 5);
        sudokuModel.setNumber(0, 1, 3);
        sudokuModel.setNumber(0, 4, 7);
        // sodukoModel.setNumber(0, 6, 3);

        sudokuModel.setNumber(1, 0, 6);
        sudokuModel.setNumber(1, 3, 1);
        sudokuModel.setNumber(1, 4, 9);
        sudokuModel.setNumber(1, 5, 5);

        sudokuModel.setNumber(2, 1, 9);
        sudokuModel.setNumber(2, 2, 8);
        sudokuModel.setNumber(2, 7, 6);

        sudokuModel.setNumber(3, 0, 8);
        sudokuModel.setNumber(3, 4, 6);
        sudokuModel.setNumber(3, 8, 3);

        sudokuModel.setNumber(4, 0, 4);
        sudokuModel.setNumber(4, 3, 8);
        sudokuModel.setNumber(4, 5, 3);
        sudokuModel.setNumber(4, 8, 1);

        sudokuModel.setNumber(5, 0, 7);
        sudokuModel.setNumber(5, 4, 2);
        sudokuModel.setNumber(5, 8, 6);

        sudokuModel.setNumber(6, 1, 6);
        sudokuModel.setNumber(6, 6, 2);
        sudokuModel.setNumber(6, 7, 8);

        sudokuModel.setNumber(7, 3, 4);
        sudokuModel.setNumber(7, 4, 1);
        sudokuModel.setNumber(7, 5, 9);
        sudokuModel.setNumber(7, 8, 5);

        sudokuModel.setNumber(6, 8, 9);
        sudokuModel.setNumber(8, 4, 8);
        sudokuModel.setNumber(8, 7, 7);
        sudokuModel.setNumber(8, 8, 9);

        return sudokuModel;
    }
}