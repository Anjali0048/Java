public class ExceptionHandling {
    public static void main(String[] args) {
        
        int i=0;
        int j=0;
        try {
            j = 4/i;
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("Result: " + j);
        System.out.println("Hello");
    }
} 