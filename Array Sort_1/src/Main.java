//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson array sort

        int []k = {2,3,0,-5,4,11};

        for (int i : k) {
            System.out.print(i + ", ");
        }

        System.out.println();

        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                if (k[i] < k[j]) {
                    int temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;
                }
            }
        }

        for (int i : k) {
            System.out.print(i + ", ");
        }




    }
}