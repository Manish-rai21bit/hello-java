class BigO{
  // Rules for calculating Big O
  // 1. Consider the worst case scenario
  // 2. Remove Constants
  // 3. Different terms for inputs
  // 4. Drop Non Dormants

  // What is the Big O of the below function?
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
}
