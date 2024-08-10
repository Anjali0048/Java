// functional interface consists of only one method
@FunctionalInterface
interface A {
    void show();
}

// class B implements A {
//     public void show() {
//         System.out.println("Hello, World!");
//     }
// }

public class InterfaceFunctional {
    public static void main(String[] args) {
        
        // A obj = new B();
        // obj.show();

        A obj = new A() {
            public void show() {
                System.out.println("Hello, World!");
            }
        };
        obj.show();
    }
}
