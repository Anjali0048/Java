interface Computer {
    void model();
}

class Laptop implements Computer {
    public void model() {
        System.out.println("Laptop model");
    }
}

class Desktop implements Computer {
    public void model() {
        System.out.println("Desktop model");
    }
}

class Developer {
    public void develop(Computer c) {
        c.model();
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();

        Developer dev = new Developer();
        dev.develop(lap);
    }
}
