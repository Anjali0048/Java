abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing music");
    } 
}

class Wagon extends Car {     // concrete class
    public void drive() {
        System.out.println("Driving");
    }
}

public class Abstract {
    public static void main(String[] args) {
        
        // cannot create object of abstract class
        // Car obj = new Car();

        // if an abstract method is defined in the parent class then it is compulsary to override it in the derived class

        Car obj = new Wagon();
        obj.drive();
        obj.playMusic();
    }
}
