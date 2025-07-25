import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson Array methods


        int []k = {2,1,3,5,64,0};
        //arrayPrint(k);

        String strK = Arrays.toString(k);
        System.out.println(strK);

        // sort method
        Arrays.sort(k);
        String sortedK = Arrays.toString(k);
        System.out.println(sortedK);

        String [] cars = {"AUDI", "MAZDA", "LADA", "CHEVROLET", "TOYOTA"};
       // arrayPrint(cars);

        String strC = Arrays.toString(cars);
        System.out.println(strC);




    }

    public static void arrayPrint(int ...n){
        for(int i : n){
            System.out.printf("%d, ", i);
        }
        System.out.println();
    }

    public static void arrayPrint(String ...n){
        for(String i : n){
            System.out.printf("%s, ", i);
        }
        System.out.println();
    }


}