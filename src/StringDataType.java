public class StringDataType {
    public static void main(String[] args){
        // sting uses double quotes, char uses single quote
        String x = "hello\nManish"; // object - instance of a class
        System.out.println(x);
        System.out.println(x.charAt(0)); // String to Char

        // Concatenations of strings
        System.out.println(x+" Cow");
        System.out.println(x.concat(" Cow"));
        String name = "Rai";
        System.out.println(String.format("hello %s", name));
        // Get the length of a string
        System.out.println(name.length());

        // Check if a string contains some string
        System.out.println(x.contains("hello"));
        System.out.println(x.indexOf("hello"));

    }
}

// Can have special character in String
// Escape a special character by using double backslash