import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is Task Polindrom number

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        int x = input.nextInt();
        int p = x;

        int sum = 0;
        while (x != 0) {
            //int q = x % 10;
            sum = sum * 10 + x % 10;
            //System.out.println(q);
            x /= 10;
        }

        System.out.println(sum);

        if(p == sum){
            System.out.printf("This is number %d Polindrom number", p);
        }else {
            System.out.printf("This is number %d not Polindrom number", p);
        }



    }
}