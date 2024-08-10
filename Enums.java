// use switch case in case of enums
// enums are class but they can't be extended

enum Status {
    Running, Failed, Pending, Success;
}

public class Enums {
    public static void main(String[] args) {

        Status s = Status.Failed;

        System.out.println(s.getClass().getSuperclass());

        System.out.println(s);
        System.out.println(s.ordinal());

        Status all[] = Status.values();
        for(Status i : all) {
            System.out.println(i.ordinal() + " : " + i);
        }

        
    }
}
