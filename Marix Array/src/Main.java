//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is matrix array

        // one line array

        int []k = {1,2,3,4};

        // two line array

        int [][]arr = {
                {3,2,4,5},
                {6,5,7,8},
        };

        // array address

        //System.out.println("arr = " + arr);
        // array line
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);*/
        //System.out.println(arr[0][0]);

        /*int []t = arr[0];
        System.out.println(t[0]);*/

        // matrix change line element

        arr[0][0] = -78;
        System.out.println(arr[0][0]);


    }
}