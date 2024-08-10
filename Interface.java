interface A {

    int age = 34;     // should be final and static which is by defualt, but we need to specify the value
    String name = "Anjali";

    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {
    public void show() {
        System.out.println("show()");
    }
    public void config() {
        System.out.println("config()");
    }
    public void run() {
        System.out.println("run()");
    }
}

public class Interface {
    public static void main(String[] args) {
        
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.name + " : " + A.age);

        X obj1 = new B();
        obj1.run();
    }
}
