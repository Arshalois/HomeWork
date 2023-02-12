import java.io.File;
// in this task when I change "divider" to 0, ArithmeticException is caught
public class Array {
    public static void arrayMethod() {
        int[] array1;
        array1 = new int[3];
        array1[0] = 9;
        array1[1] = 27;
        array1[2] = 30;
        int divider = 3;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] / divider);
        }
    }
    public static void main(String[] args) {
        try {
            arrayMethod();
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException");
        }
    }
}


