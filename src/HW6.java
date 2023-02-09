import java.util.*;
public class HW6 {
    public static void main(String[] args) {
        // task 1
        int[] array1 = new int[]{5, 7, 11, 20};
        Arrays.sort(array1);
        int minDiff = array1[1] - array1[0];
        for (int i = 2; i != array1.length; i++) {
            minDiff = Math.min(minDiff, array1[i] - array1[i - 1]);
        }
        System.out.println("The minimal difference is " + minDiff);

        //task 2
        List<String> books = new ArrayList<>(5);
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        books.add("Book5");

        Map<Integer, String> books1 = new HashMap<>();
        books1.put(0, "Book1");
        books1.put(1, "Book2");
        books1.put(2, "Book3");
        books1.put(3, "Book4");
        books1.put(4, "Book5");
        System.out.println(books1);
    }
}

