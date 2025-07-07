//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson Nested loop task 2

        // x ^ 0 + x ^ 1 + x ^ 3 + x ^ 4 + x ^ 5 .....

        int x = 2;
        int n = 3;
        int summa = 0;
        for (int i = 0; i <= n; i++) {
            int pow =1;
            for (int j = 1; j <= i; j++) {
                pow *= x;
            }
            //System.out.println(pow);
            summa += pow;
        }
        System.out.println("summa = " + summa);

    }
}