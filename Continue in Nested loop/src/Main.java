//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson continue in nested loop

        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 2){
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }*/

        for (int i = 0; i < 5; i++) {
            if(i == 1){
                continue;
            }
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " " + j);
            }
        }



    }
}