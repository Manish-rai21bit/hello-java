import javax.annotation.processing.SupportedSourceVersion;
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
        // Call methods
        // User user = new User(); // instantiating class in object
        // user.firstName = "Manish"; // access the property
        // user.lastName = "Rai";
        // System.out.println(user.getFullName());

        // 2.9 String Comparison
        String password = "let me in";
        System.out.println("Guess the password");

        Scanner scanner1 = new Scanner(System.in);
        String guess = scanner1.nextLine();

        System.out.println(password.equals(guess));
        // Primitives directly contains the objects
        // Objects don't contain objects but contain memory locations where objects are stored
        // So comparisons don't work with objects (a == b).
        // In these cases, it is recommended to use equals method

        // 2.15 Control Flow
        if(password.equals(guess)){
           // code to execute if true
            System.out.println("You guessed it correct");
        }
        else{
            System.out.println("You guessed it wrong");
            return; // stop the execution of program at this point.
        }

        // 2.22  Logical and Comparison operator
        System.out.println("How old are you?");

        Scanner scanner2 = new Scanner(System.in);
        int age = Integer.parseInt(scanner2.nextLine());

        System.out.println("Cats or dogs?");
        String animals = scanner2.nextLine();
        /* comparison operators
        * == equality
        * != inequality
        */

        /* logical operators
        * && and, this has higher precedence
        * || or
        * ! not (inverse of boolean)
        */
        if (age>12 && !animals.equals("dogs")){
            System.out.println("Welcome!");
        }

        // 2.30 Switch statement
        System.out.println("What's your name?");

        Scanner scanner3 = new Scanner(System.in);
        String name1 = scanner3.nextLine();

        switch(name1){
            case "Manish":
                //code
                System.out.println("Welcome man!");
                break; // without break the program will fallthrough to next case
            case "Beaula":
                System.out.println("Welcome beau!");
                break;
            default:
                System.out.println("Try again leter man!");
        }

        // 2.37 terniary/ conditional operator
        // operation ? true: false
        String name2 = "Kartik";
        String welcome2 = name2.equals("Kartik")? "lol": "not-lol";
        System.out.println(welcome2);

        // single line if

        // 2.45 loops
        /* icu
        * initialization
        * comparison
        * update
        */

        // While loop
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        // do-while loop - runs atleast once
        Scanner scanner4 = new Scanner(System.in);
        String guess1;
        do{
            System.out.println("Guess the password:");
            guess1 = scanner4.nextLine();
        } while(!guess1.equals(password));
        System.out.println("Welcome back!");

        // 2.57 More on loops
        /*
        for loop
        */
        for(int j=0; j< 4; j++){
            System.out.println(j);
        }

        // 3.02 Nested loops - same as python, R, etc.
        // print cube
        for(int k=9; k>=0; k--){
            for(int l=9; l>=0; l--){
                System.out.print(k + " ");
            }
            System.out.println();
        }

        // print pyramid
        for(int m=9; m>=0; m--){
            for(int n=m; n>=0; n--){
                System.out.print(n + " ");
            }
            System.out.println();
        }
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