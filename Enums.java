enum Status {
    Running, Failed, Pending, Success;
}

public class Enums {
    public static void main(String[] args) {
        int a = 5;
        Status s = Status.Failed;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status all[] = Status.values();
        for(Status i : all) {
            System.out.println(i.ordinal() + " : " + i);
        }
    }
}
