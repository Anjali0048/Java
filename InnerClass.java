class A {
    int age;

    public void show () {
        System.out.println("A.show()");
    }

    class B {
        public void config() {
            System.out.println("B.config()");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();

        // A.B obj1 = new A.B(); this will work only when B is static class
        // we can't create outer class as static
        A.B obj1 = obj.new B();
        obj1.config();
    }
}
