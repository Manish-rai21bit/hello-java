import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args){
        boolean isPizzaDelicious = true; // false
        byte b = 127; //10110110, 8 bits
        char c = 'Z';
        short s = 32767; // Small number 16 bit
        int i = 23949793; // large numbers 32 bits
        long l = 983497659722L; // 64 bits
        float f = 20.4f; // 32 bit
        double d = 20.4; // 64 bits

        System.out.println(isPizzaDelicious);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        // Get user input using Scanner
        System.out.println("input a string: ");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println(x);

        System.out.println("input a integer: ");
        int y = scanner.nextInt();
        System.out.println(y);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);

        int m = 5;
        double n = (double)  m/2;
        System.out.println(n);
    }
}

// boolean, byte, char, short, int, long, float and double