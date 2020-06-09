import java.util.Scanner;

public class VariableDeclaration { // Class and it's identifier
    public static final double PI = 3.14159; // Creating a global variable
    public static void main(String[] args) { //methods and it's identifier
        int x;
        x = 5;
        int y = 6;
        final int z = 8; // Create a constant
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

// variable creation - 2 step process:
// 1. Declaration
// 2. Initialization