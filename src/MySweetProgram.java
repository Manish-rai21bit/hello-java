import java.util.Scanner;

public class MySweetProgram { // Class and it's identifier
    public static void main(String[] args) { //methods and it's identifier
        System.out.println("What is your name? ");

        // type identifier = new type();
        Scanner scanner = new Scanner(System.in); //creating a variable called scanner
        String name = scanner.nextLine();

        System.out.println("hallo "+ name+"!!!");
        // Creating a string variable
        String string = new String("This is a string");
        System.out.println(string + " :) ");

        int x = 5; // primitive data type
        Integer y = 5; // object (5 is autoboxing)
        System.out.println(x);
        System.out.println(y);

    }
}

// statically typed = variables are given data type upfront
// dynamically typed  = variables do not have types
// objects - instance of a class (class of data type)

// literals - the value

// variable - stores some value
// expression - evaluates to a value
// operator - work on operands to produce a value

// Class - Contains everything - has members
// methods - do something
// statements - Telling computer something
// arguments - What you pass to a method (part of calling)
// parameters - variables t store arguments (part of definition)
// properties - Store something

//access modifier (public) - Who can use?
// static - No instance of class is needed
// object - instance of class