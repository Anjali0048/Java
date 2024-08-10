enum Laptop {
    Mac(2000), Surface, ThinkPad(3000), XPS(1200);

    private int price;

    private Laptop() {
        price = 3000;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enums2 {
    public static void main(String[] args) {

        // Laptop lap = Laptop.Mac;
        // System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
