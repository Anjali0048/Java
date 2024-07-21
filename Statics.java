class Mobile {
    String brand;  // instance variables - belongs to object
    int price;
    static String name;  // belongs to class

    static {
        name = "Mobile";  // static block
        System.out.println("in static block");
    }

    public Mobile() {
        brand = "";
        price = 4000;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1() {
        // we cannot use non static variables in static methods
        // but we can use it indirectly in show2()
        System.out.println("in static method");
    }

    public static void show2(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}
public class Statics {
    public static void main(String[] args) {

        // Class.forName("Mobile");  // it will load the class if no objects are created and then only static block will be called
        
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 50000;
        Mobile.name = "smartphone";
        
        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 90000;
        // Mobile.name = "smartphone";

        m1.show();
        m2.show();
        Mobile.show1();

        Mobile.show2(m2);

    }
}
