//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson array index

        // int

        /*int[] elements = {19, 3, 4, 12, 53, 90};

        System.out.println(elements[0]);
        System.out.println(elements[1]);
        System.out.println(elements[2]);*/

        // String last index

        /*String[] cars = {"Lada", "Mazda", "Toyota", "Chevrolet"};

        System.out.println(cars[cars.length - 1]);*/

        // array length

        /*int[] nums = new int[]{1, 2, 3, 23, 76, -9, 56};

        System.out.println(nums.length);

        int i = 0;

        while (i < nums.length) {
            System.out.printf("%d, ", nums[i]);
            i++;
        }*/


        // array element change

        int[] nums = new int[]{1, 2, 3, 23, 76, -9, 56};

        //System.out.println(nums[0]);

        for (int num : nums) {
            System.out.printf("%d, ", num);
        }
        System.out.println();
        nums[0] = -90;
        //System.out.println(nums[0]);

        for (int num : nums) {
            System.out.printf("%d, ", num);
        }




    }
}