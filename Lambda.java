// lambda expressions works with only functional interface
// if we use lambda expression then it will increase the size of class Lambda but it will not create a new anonymous class file
// it save the amount of class files that are created when we compile 

@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface B {
    int add(int i, int j);
}

public class Lambda {
    public static void main(String[] args) {
        
        // if only one statement then we can remove the { }
        A obj = () -> {
            System.out.println("Hello");
        };
        obj.show();

        // behind the scene
        // A obj = new A() {
        //     public void show() {
        //         System.out.println("Hello, World!");
        //     }
        // };

        B obj1 = (i,j) -> i+j;
        System.out.println(obj1.add(10, 20));

    }
}
