import java.io.File;
import java.util.Arrays;

// in this task when I change "divider" to 0, ArithmeticException is caught
public class Array {
   /* public static void arrayMethod() {
        int[] array1;
        array1 = new int[3];
        array1[0] = 9;
        array1[1] = 27;
        array1[2] = 30;
        int divider = 3;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] / divider);
    */
    public static void methodDivider(int array[], int dividerValue) {
        int dividedResults[] = new int[array.length];
        try {
            for (int i = 0; i < array.length; i++) {
                int result = array[i] / dividerValue;
                dividedResults[i] = result;
            }
            System.out.println(Arrays.toString(dividedResults));
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException is caught");
        }
    }
    public static void main(String[] args) {
        int [] array = {9,27,30};
        methodDivider ( array,3);
    }
}


