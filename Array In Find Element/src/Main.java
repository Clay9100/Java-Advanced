import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // this is lesson array in find element

       /* int []k = {2,1,4,56,3,8,9,0};

        for (int i : k) {
            System.out.printf("%d, ", i);
        }

        System.out.print("\nEnter find element: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean check = false;
        for (int i : k) {
            if (i == n) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.printf("This is %d element find", n);
        } else {
            System.out.printf("This is %d not find element ", n);
        }*/

        // counter elements

        int[] k = {2, 1, 3, 56, 3, 8, 3, 0};

        for (int i : k) {
            System.out.printf("%d, ", i);
        }

        System.out.print("\nEnter counter elements: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int count = 0;
        for (int i : k) {
            if (i == n) {
                count++;
            }
        }

        System.out.printf("counter: %d ", count);





    }
}