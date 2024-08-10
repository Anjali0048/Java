class Calc {
    public int add(int n1, int n2) {
        System.out.println("Calc add");
        return n1+n2;
    }
    public int sub(int n1, int n2) {
        return n1-n2;
    }
}

class AdvCalc extends Calc {
    public int mul(int n1, int n2) {
        return n1*n2;
    }
    public int div(int n1, int n2) {
        return n1/n2;
    }
}

class SciCal extends AdvCalc {
    public int add(int n1, int n2) {
        System.out.println("SciCal add");
        return n1+n2;
    }
    public double power(int n1, int n2) {
        return Math.pow(n1,n2);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Calc cal = new Calc();
        AdvCalc adv = new AdvCalc();
        SciCal sci = new SciCal();

        // System.out.println(adv.add(3,4));
        // System.out.println(cal.add(3,4));
        System.out.println(sci.add(3,4));
    }
}