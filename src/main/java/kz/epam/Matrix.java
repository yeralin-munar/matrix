package kz.epam;

/**
 * Created by munar on 1/27/17.
 */
public class Matrix {
    private int[][] m;

    public Matrix(){

    }

    public Matrix(int row, int col){
        if (row == 0 || col == 0) {
            System.out.println("Row or col is null");
            return;
        }
        m = new int[row][col];
    }

    public Matrix(int[][] a){
        m = a;
    }

    public void setSize(int row, int col){
        m = new int[row][col];
    }

    public void setValue(int row, int col, int value){
        this.m[row][col] = value;
    }

    public void random(){
        int     row = getRow(),
                col =getCol();
        if (getRow() == 0 || getCol() == 0) {
            System.out.println("Matrix size is empty");
            return;
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++ ){
                setValue(i, j, (int)(Math.random()*row*col));
            }
        }
    }

    public String str(){
        String s="";
        int     row = m.length,
                col = m[0].length;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++ ){
                s += Integer.toString(getValue(i, j)) + "  ";
            }
            s += '\n';
        }
        return s;
    }

    private int getValue(int row, int col){
        return m[row][col];
    }

    public int getRow(){
        return m.length;
    }

    public int getCol(){
        return m[0].length;
    }

    public Matrix multiply(Matrix n){
        int     row = getRow(),
                col = n.getCol();
        Matrix res = new Matrix(row, col);
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++ ){
                int mul = 0;
                for (int r = 0; r < getCol(); r++){
                    mul += getValue(i, r) * n.getValue(r, j);
                }
                res.setValue(i, j, mul);
            }
        }
        return res;
    }


}
