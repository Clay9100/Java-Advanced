//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Polindrom number in create break



         // break

        /*for (int i = 2; i < 100; i++) {
            boolean tubmi = true;
            for (int j = 2; j < i ; j++) {
                if(i % j == 0) {
                    tubmi = false;
                    break;
                }
            }
            if (tubmi) {
                System.out.println(i);
            }
        }*/


        // continue

        step:

        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue step;
                }
            }
            System.out.println(i);
        }


    }
}