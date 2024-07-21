class Student {
    int rollno;
    String name;
    int marks;
}

public class ArrayClass {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Rahul";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Satyam";
        s2.marks = 100;        

        Student stu[] = new Student[2];
        stu[0] = s1;
        stu[1] = s2;

        for(int i=0; i<stu.length; i++) {
            // System.out.println(stu[i].name + " : " + stu[i].marks);
        }

        for(Student i : stu) {
            System.out.println(i.name + " : " + i.marks);
        }

    }
}
