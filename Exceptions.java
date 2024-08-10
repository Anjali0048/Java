public class Exceptions {
    public static void main(String[] args) {
        
        int i=2;
        int j=0;
        int arr[] = new int[5];
        String str = null;
        try {
            System.out.println(str.length());
            j = 4/i;
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero : " + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("stay in your range ");
        }
        catch(Exception e){
            System.out.println("Something went wrong : " + e);
        }
        
        System.out.println("Result: " + j);
        System.out.println("Byee byee");
    }
}