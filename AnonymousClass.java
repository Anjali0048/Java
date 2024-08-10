class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A() 
        {
            public void show() {
                System.out.println("in AnonymousClass show");
            }
        };
        obj.show();

        // we can use anonymous inner class even if A is abstract class and void is abstract method
        
    }
}
