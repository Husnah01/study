public class MethodDemo {
    // Defining a method: Definition

    /*
     1. Method may have no parameters and no return statement
     2. Method may have parameters and no return statement
     3. Method may have no parameters and may have return statement
     4. Method may have parameters and may have return statement
    */

     /* 
    // 1. Method may have no parameters and no return statement
    public void Addition() {
        int num1 = 30; // compile time initialization
        int num2 = 20; // compile time initialization

        // performing addition operation
        int result = num1 + num2;
        System.out.println(result);
    } */



    // 2. Method may have parameters and no return statement
    public void Addition(int num1, int num2) {
        // performing addition operation
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        // creating an object of the class MethodDemo to access class members
        MethodDemo obj1 = new MethodDemo();

        // calling/invoking method: Addition
        obj1.Addition(30,20);    // calls the parameterized method
    }
}
