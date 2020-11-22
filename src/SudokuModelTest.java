import static org.junit.jupiter.api.Assertions.*;

class SudokuModelTest {

    @org.junit.jupiter.api.Test
    void copyTest() {
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

        SudokuModel sudokuModelByCopy = sudokuModel.copy();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                assertTrue(sudokuModel.getModel()[i][j] == sudokuModelByCopy.getModel()[i][j]);
            }
        }
    }

    @org.junit.jupiter.api.Test
    void copyTestWithError() {
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

        SudokuModel sudokuModelByCopy = sudokuModel.copy();
        sudokuModelByCopy.setNumber(8, 5, 9);
        boolean isCopy = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(sudokuModel.getModel()[i][j] == sudokuModelByCopy.getModel()[i][j])
                    isCopy=false;
            }
        }
        assertFalse(isCopy);
    }

    @org.junit.jupiter.api.Test
    void copyTestTwo() {
        SudokuModel sudokuModel = new SudokuModel();
        SudokuModel sudokuModelByCopy = sudokuModel.copy();
        assertFalse(sudokuModel == sudokuModelByCopy);
    }
}