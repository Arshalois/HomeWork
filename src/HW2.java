import java.util.Scanner;

public class HW2 {

    public static void homeWorkTask(int a) {
        a = 555;
        int sumOfThree = 5 + 5 + 5;
    }

    public static void homeWorkTask(String name, String lastname) {
        name = "John";
        lastname = "Smith";
        String fullName = name + lastname;
    }

    public static void homeWorkTask(boolean c, boolean d) {
        c = true;
        d = false;
    }

    public static void main(String[] args) {
        int sumOfThree = 5 + 5 + 5;
        System.out.println("Task 1: sumOfThreeNumbers = " + sumOfThree);

        String fullName = "John Smith";
        System.out.println("Task 2: fullNameLength = " + fullName.length());

        Scanner s = new Scanner(System.in);
        System.out.println("Task 3: Enter any number:");
        int X = s.nextInt();
        if (X > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}





