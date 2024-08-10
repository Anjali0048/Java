class Calc {
    public int add(int a, int b) {
        return a+b;
    }
}

class AdvCalc extends Calc{
    public int add(int a, int b) {
        return a-b;
    }
}

public class Overriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(3,5));
    }
} 