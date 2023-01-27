import java.util.Scanner;

public class HW2 {
    static void homeWorkTask(int A) {
        int sum = ((A % 10) + ((A / 10) % 10) + ((A / 100) % 10));
        System.out.println(sum);
    }
    static void homeWorkTask(String name, String lastname) {
        String fullName = name + lastname;
        int lengthOfFullName = fullName.length();
        System.out.println(lengthOfFullName);
    }
    static void homeWorkTask() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide the number: ");
        int number = userInput.nextInt();

        if (number > 0) {
            System.out.println("Your number is bigger than - 0");
        } else if (number == 0) {
            System.out.println("Your number is - 0 ");
        } else {
            System.out.println("Your number is less than - 0 ");
        }
    }
    public static void main(String args[]) {
        homeWorkTask(123);
        homeWorkTask("John", "Smith");
        homeWorkTask();
    }
}