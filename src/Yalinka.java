public class Yalinka {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
        for (int i = 1; i <= 6 - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 6 - 1; k >= i; k--) {
                System.out.print("2");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("3");
            }
            System.out.println();
        }
    }
}