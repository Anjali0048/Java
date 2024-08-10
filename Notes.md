
String buffer is thread safe while String Builder is not

class loads first and once only
then objects are instantiated

in psvm its static because so that we don't need to create object of the class
As static don't need any object to be instantiated

this refers to the current object

everytime we build an object => the constructor will be called

every constructor in java has a method super() which is the first statement

every class in java extends the Object class

if a class is decalred as final then no class can inherit from it 
final class Calc{

}

if a function is declread as final then noone can override the method
like in base class a function is declared as final 
so the derived class cannot override that function

every method in interface is public abstract by default
 
types of interfaces 
-> Normal
-> Functional/ SAM -> Single abstract method
-> Marker interface -> no method is declared in it

Exceptions
-> Compile-time error
-> Runtime error
-> Logical error

throw new Exception();
throw an exception and catch(){} will catch it

throws Exception -> throws exception to the calling function where try catch block is defined

BufferedReader bf = new BufferedReader(null)

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

finally block is used to close the connections or free up space

obj.getPriority() -> 1 to 10 threads priority 
                  -> by default = 5