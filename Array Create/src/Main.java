//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson array create

       /* int[] k = {1, 2, 3, 4, 5};
        int[] v = new int[]{1, 2, 3, 4, 5};
        int[] f = {};*/

        // System.out.println(k[0]);
        // System.out.println(v[0]);
        // System.out.println(f[0]); // error zero element not create

        // double

        /*double[] d = new double[]{9.8, 4, 5, 6, 2.3};
        double[] d1 = new double[]{};
        double[] d1 = new double[10]; // {0.0, 0.0, 0.0, 0.0, 0.0}
        double[] d2 = {};

        System.out.println(d[0]);
        System.out.println(d1[0]);
        System.out.println(d2[0]);*/

        // char

        /*char[]b = new char[3];

        System.out.println(b[0]); // spec
        */

        // boolean

        /*boolean[] b = new boolean[3];
        System.out.println(b[0]); // false*/

        // String

       /* String[] str = new String[3];
        System.out.println(str[0]); // null*/

        // Array length

        int[] k = {1, 2, 3, 4, 5, 5};

        for (int i = 0; i < k.length; i++) {
            System.out.printf("%d, ", k[i]);
        }

        // reverse array loop
        System.out.println();

        for (int i = k.length - 1; i >= 0; i--) {
            System.out.printf("%d, ", k[i]);
        }





    }
}