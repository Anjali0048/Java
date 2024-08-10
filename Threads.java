class A extends Thread{
    public void run() {
        for(int i=0; i<100 ;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run() {
        for(int i=0; i<100 ;i++) {
            System.out.println("Helloooo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C implements Runnable{
    public void run() {
        for(int i=0; i<5 ;i++) {
            System.out.println("world");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());

        // obj1.start();
        // obj2.start();


        Runnable obj3 = new C();
        Thread t1 = new Thread(obj3);
        t1.start();

        // using lambda expression
        Runnable obj4 = () -> {
            for(int i=0; i<5 ;i++) {
                System.out.println("yooo");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        
        Thread t4 = new Thread(obj4);
        t4.start();
    }
}
