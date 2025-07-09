import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson matrix chess

        Scanner input = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = input.nextInt();
        System.out.print("Enter column: ");
        int column = input.nextInt();

        long[][] chess = new long[row][column];

        long s = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                chess[i][j] = s;
                if (s == 1) {
                    s = 2;
                } else {
                    s = s * 2;
                }
            }
        }

        PrintMatrix(chess, row, column);


    }

    public static void PrintMatrix(long[][] matrix, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}