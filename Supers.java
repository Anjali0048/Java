class A {
    public A() {
        System.out.println("inside A");
    }
    public A(int n) {
        System.out.println("inside A(int n)");
    }
}

class B extends A {
    public B() {
        // super();   // its there already for every constructor which calls the parent's default constructor
        System.out.println("inside B");
    }
    public B(int n) {
        // super(n);    // but for parameterised constructor of parent to be called => we need to pass param to the super(); 
        this();     // this() will execute the constructor of the same class
        System.out.println("inside B(int n)");
    }
}

public class Supers {
    public static void main(String[] args) {
        // B obj = new B();
        B obj1 = new B(4);

        // new B();   // anonymous object
        
    }
}
