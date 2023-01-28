public class Yalinki {
    public static void printPyramid(boolean m) {

        for (int i = 5; i > 0; i--) {
            if (m) {
                for (int j = 5; j > 0; j--) {
                    if (j <= i) {
                        System.out.print("2");
                    } else {
                        System.out.print(" ");
                    }
                }
                //if else (int c =1, c>0; c++) {

                }
            else {
                for (int j = 0; j < 5; j++) {
                    if (i > j) {
                        System.out.print("v");
                    } else {
                        System.out.print(" "); // might not even need
                    }
                }
            }
            System.out.println();

        }
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for(int c = 5; c > 0; c--)
        {
            for(int i=0; i < c-1; i++)
                System.out.print(" ");

            for(int p3=5; p3 > c-1; p3--)
                System.out.print("3");

            System.out.println();
        printPyramid(false); // A
        printPyramid(true);  // B


        }
    }

    }

