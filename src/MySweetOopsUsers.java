public class MySweetOopsUsers {
    /*
    Class - blueprint, ex - cookie
    Instantiate - process of creating an object of a class (people)
    Objects - instance of a class. Objects are created as Variables. cookie
    fields - Variable inside a class. Created inside a class but not inside a method
    methods - define what an object can do. Called as function in python
    */
    public static void main(String[] args){
        User u = new User();
        u.lastName = "Rai";
        u.firstName = "Manish";
        System.out.println(u.firstName);
    }
}