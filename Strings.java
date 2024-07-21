public class Strings {
    public static void main(String[] args) {

        String s = "Hello World";
        
        String name = new String("Anjali");
        // System.out.println("Hello " + name);
        // System.out.println(name.hashCode());
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat( " Singh"));

        String nam = "satyam";
        nam = nam + " thakur";
        // System.out.println(nam);

        String s1 = "Anjali";
        String s2 = "Anjali";
        // System.out.println(s1 == s2);    // true
        // System.out.println(s1 == name);  // false

        // string constant pool where all string values are stored

        // Strings are immutable 
        // Strings can be made mutable by using String Buffer and String Builder

        // String Buffers
        StringBuffer sb = new StringBuffer("Singh");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        sb.append(" Thakur");
        // System.out.println(sb);

        String str = sb.toString();
        // System.out.println(str);

        // sb.deleteCharAt(0);
        sb.insert(0, "Anjali ");
        sb.setLength(30);
        // System.out.println(sb);

        // String buffer is thread safe while String Builder is not


    }
}
