package ThinkingInJava4thEd.k_Exceptions;

//p372
// Create a class with a main(0 that throws an object of class Exception inside a try block. Give the constructor for Exception a String argument. Catch the exception inside a
// catch clause and print the String argument. Add a finally clause and print a message to prove you were there.

public class T_01 {
    public static void main(String[] args) {
        try {
            throw new Exception("Error message");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Message from `finally`");
        }
    }
}
