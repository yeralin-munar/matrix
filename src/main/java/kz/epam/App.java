package kz.epam;

/**
 * Created by munar on 1/27/17.
 */
public class App {
    public static void main(String[] args) {
        int row = 2;
        int col = 3;
        Matrix matrix1 = new Matrix(row, col);
        Matrix matrix2 = new Matrix(col, row);
        matrix1.random();
        matrix2.random();
        System.out.println("Matrix 1:\n"+matrix1.str());
        System.out.println("Matrix 2:\n"+matrix2.str());
        System.out.println("Result matrix:\n"+matrix1.multiply(matrix2).str());
    }
}
