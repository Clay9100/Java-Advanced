import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = input.nextInt();
        System.out.println("Enter finish: ");
        int finish = input.nextInt();

        for (int i = start; i <= finish; i++) {
            int temp = i;
            int summa = 0;
            while (temp != 0) {
               summa = summa * 10 + temp % 10;
               temp /= 10;
            }

            if(summa == i) {
                System.out.println(i);
            }

        }



    }
}