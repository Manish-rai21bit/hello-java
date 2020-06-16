import java.lang.reflect.Array;
import java.util.*;

public class Advanced_data_structures {
    // index starts with 0
    public static void main(String[] args){
        // int[] grades = new int[10];
        int[] grades = {9, 9, 8, 8, 1, 2, 3, 4, 5, 10};
        System.out.println(grades[0]);

        try{
            System.out.println(grades[10]);
        } catch(Exception e){
            System.out.println(e);
        }

        // 1. print array
        System.out.println(Arrays.toString(grades));

        // Sort an array
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));

        // 2. compare arrays
        int[] grades1 = {1,2,3,5};
        int[] grades2 = {1,2,3,5};

        if(grades1==grades2){
            System.out.println("equals");
        }
        if(Arrays.equals(grades1, grades2)){
            System.out.println("equals finally");
        }
        // 3. fill an array with a value
        Arrays.fill(grades, 0);
        System.out.println(Arrays.toString(grades));

        // 4. 2D arrays
        // defining a 2D array
        // int[][] grades2D = new int[2][];
        System.out.println("4. 2D arrays");
        int[][] grades2D ={
                {1, 2},
                {3, 5, 4}
        };
        System.out.println(grades2D[1][2]);
        System.out.println(grades2D.length);
        // iterating over the loop
        for(int r=0; r<grades2D.length; r++){
            for(int c=0; c<grades2D[r].length; c++){
                System.out.print(grades2D[r][c] + " ");
            }
            System.out.println();
        }

        // 5. Array list - dynamic in size
        System.out.println("5. Array list - dynamic in size");
        List<Integer> gradesAL = new ArrayList<Integer>();
        // add elements to this list my using add method
        gradesAL.add(5);
        System.out.println(gradesAL.get(0)); // pass in index and get values
        System.out.println(gradesAL.indexOf(5)); // pass in value and get index
        System.out.println(gradesAL.isEmpty()); // check if the list is empty

        List<Integer> gradesAL2 = Arrays.asList(1,3,4,6); // Adding elements easily at once
        System.out.println(Arrays.toString(gradesAL2.toArray()));

        for(int i=0;i<gradesAL2.size();i++){
            gradesAL2.set(i, gradesAL2.get(i)*2); // multiply each element by 2
        }
        System.out.println(Arrays.toString(gradesAL2.toArray()));

        // Nested 2D list
        System.out.println("Nested 2D list");
        List<List<Integer>> gradesAL2d = new ArrayList<List<Integer>>();
        gradesAL2d.add(Arrays.asList(1, 2, 4));
        gradesAL2d.add(Arrays.asList(3, 2, 8));
        for (List<Integer> g : gradesAL2d){
            for(int g2 : g){
                System.out.print(g2 + " ");
            }
        }
        System.out.println();
    }
}

