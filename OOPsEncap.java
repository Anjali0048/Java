class Human {
    private int age;
    private String name;

    public Human() {
        System.out.println("in default constructor");
        age = 34;
        name = "John";
    }
    
    public Human(int a, String n) {
        System.out.println("in parameterized constructor");
        age = a;
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
    
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}

public class OOPsEncap {
    public static void main(String[] args) {

        Human obj = new Human(); 
        obj.setAge(4);
        obj.setName("Anjali");
        System.out.println(obj.getName() + " : " + obj.getAge());
        
        Human obj2 = new Human();
        System.out.println(obj2.getName() + " : " + obj2.getAge());
        
        Human obj3 = new Human(4, "Satyam");
        System.out.println(obj3.getName() + " : " + obj3.getAge());
    }
}
