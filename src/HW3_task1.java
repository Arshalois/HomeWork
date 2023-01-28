public class HW3_task1 {
    static void maxLength(String a, String b, String c) {
        if (a.length() > b.length() && a.length() > c.length()) {
            System.out.println("Longest is " + a);
        } else if (b.length() > a.length() && b.length() > c.length()) {
            System.out.println("Longest is " + b);
        } else {
            System.out.println("Longest is " + c);
        }
    }

    public static void main(String[] args) {
        maxLength("Morning", "Afternoon", "Night");

    }
}