import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// task #3, with Java Streams
public class Flowers {
    String type;
    String color;
    int price;

    public Flowers(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Flowers{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    public static void main(String[] args) {
        Flowers fl1 = new Flowers("Rose", "red", 60);
        Flowers fl2 = new Flowers("Rose", "pink", 45);
        Flowers fl3 = new Flowers("Tulip", "pink", 25);
        Flowers fl4 = new Flowers("Lily", "white", 35);
        Flowers fl5 = new Flowers("Peony", "pink", 50);

        List<Flowers> flowers = new ArrayList();
        flowers.add(fl1);
        flowers.add(fl2);
        flowers.add(fl3);
        flowers.add(fl4);
        flowers.add(fl5);

        List<Flowers> flowersUpd = flowers.stream().filter(flower -> flower.color == "pink").collect(Collectors.toList());
        List<Flowers> flowersUpd2 = flowers.stream().filter(flower -> flower.price > 40).collect(Collectors.toList());

        System.out.println("All flowers " + flowers);
        System.out.println("Selected by color " + flowersUpd);
        System.out.println("Selected by price " + flowersUpd2);
    }
}
