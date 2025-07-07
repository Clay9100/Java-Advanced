import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // this is lesson geometric shape

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * * * *


        /*Scanner in = new Scanner(System.in);

        System.out.print("Enter row: ");

        int row = in.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }*/

        // * * * * * *
        // * * * * * *
        // * * * * * *
        // * * * * * *
        // * * * * * *

       /* Scanner in = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = in.nextInt();
        System.out.print("Enter column : ");
        int col = in.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }*/

        // * * * * * *
        // *         *
        // *         *
        // *         *
        // * * * * * *

       /* Scanner in = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = in.nextInt();
        System.out.print("Enter column : ");
        int col = in.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/


        // *
        // * *
        // *   *
        // *     *
        // *       *
        // * * * * * *

        /*Scanner in = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = in.nextInt();
        System.out.print("Enter col: ");
        int col = in.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j || j == 0 || i == row - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/


        //      *
        //     * *
        //    * * *
        //   * * * *
        //  * * * * *
        // * * * * * *

        Scanner in = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = in.nextInt();
        System.out.print("Enter col: ");
        int col = in.nextInt();

        for (int i = 0; i < row; i++) {

            for (int k = 0; k < row - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }



    }
}