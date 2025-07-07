//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // nested loop task
        // 1 + 22 + 333 + 4444 + 55555 ....


        long summa = 0;
        for (int i = 1; i <= 5 ; i++) {
            String s = "";
            for (int j = 1; j <= i ; j++) {
                s += i;
            }
            System.out.print(s + " + ");
            //System.out.println(s);
            summa += Integer.parseInt(s);
        }

        System.out.println("\nsumma = " + summa);


    }
}