public class SudokuModel {
    private int model[][];
    private int row;
    private int col;

    public SudokuModel(){
        model = new int[9][9];
    }

    public int[][] getModel() {
        return model;
    }

    public void setModel(int[][] model) {
        this.model = model;
    }

    public void setNumber(int row, int col, int val){
        model[row][col]= val;
    }

    public int getNumber(int row, int col){
        return model[row][col];
    }

    public SudokuModel copy() {
        SudokuModel sudokuModelCopy = new SudokuModel();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudokuModelCopy.setNumber(i,j, model[i][j]);
            }
        }
        return sudokuModelCopy;
    }

}
