class A {
    public void show1() {
        System.out.println("A.show1()");
    }
}

class B extends A {
    public void show2() {
        System.out.println("B.show2()");
    }
}

public class Casting {
    public static void main(String[] args) {
        
        // upcasting
        A obj = (A) new B(); // this happens implicitly, no need to mention this
        obj.show1();
 
        // downcasting
        B obj1 = (B) obj;
        obj1.show2();
    }
}
