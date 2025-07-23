
public class Main {
    public static void main(String[] args) {

        // this is lesson array sort

        int []k = {2,3,0,-5,4,11};

        for (int i : k) {
            System.out.print(i + ", ");
        }

        System.out.println();

        // liner sort
       /* for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length; j++) {
                if (k[i] < k[j]) {
                    int temp = k[i]; // swap element
                    k[i] = k[j];
                    k[j] = temp;
                }
            }
        }*/


        for (int i = 0; i < k.length - 1; i++) {
            for (int j = i + 1; j < k.length; j++) {
                if (k[i] > k[j]) {
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