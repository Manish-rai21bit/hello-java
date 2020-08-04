class BigO{
  // Rules for calculating Big O
  // i. Consider the worst case scenario
  // ii. Remove Constants
  // iii. Different terms for inputs, ex - if there are 2 input variables with
  //    length 10 and 1000
  // iv. Drop Non Dormants

  // Big  O cheatsheet - https://www.bigocheatsheet.com

  // Q1. What is the Big O of the below function?
  // (Hint, you may want to go line by line)
  public int funChallenge(int input) {
    int a = 10; // O(1)
    a = 50 + 3; // O(1)

    for (int i = 0; i < input.length; i++) { // O(n)
      anotherFunction(); // O(n)
      boolean stranger = true; // O(n)
      a++; // O(n)
    }
    return a; // O(1)
  }
  // Big O = O(1) + O(1) + O(n) + O(n) + O(n) + O(1)
  // = O(4+4n) = O(n)

  // Q2. Nested loop's BigO

  // Space Complexity
  // What causes Space complexity?
  // Variables
  // Data Structures Function Call Allocations
  public List<Integer> booooo(n){
    // takes an array of n elements
    for (int i=0; i<n.length; i++){
      System.out.println("hallo!!!");
    }
  }
}
