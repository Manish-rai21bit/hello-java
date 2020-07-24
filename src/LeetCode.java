class LeetCode {
  // 1. Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    // 1. Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // 2. Given a 32-bit signed integer, reverse digits of an integer.
    public int reverse(int x) {
        int rev = 0;
        while(x!=0){
            int pop = x%10; //pop operation
            x = x/10;
            // identifying overflows
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev*10+pop; // push operation
        }
        return rev;
    }

    // 3. Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
    // run through half the length of number and see if the 1st half and and the reversed 2nd half match
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;


    // 4. Given a 2D grid map, find the number of islands
    public int numIslands(char[][] grid) {
        int cnt = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]=='1'){
                    cnt+=1;
                    callBFS(grid, i, j);
                }
            }
        }
        return count;

    // turn to zero all the once when it's reached
    public void callBFS(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0') return;
        grid[i][j] = '0';
        callBFS(grid, i+1, j);
        callBFS(grid, i-1, j);
        callBFS(grid, i, j+1);
        callBFS(grid, i, j-1);
    }

    // 5. Pascal's Triangle
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> tri = new ArrayList<>();
       if (numRows==0) return tri;

       // Then the 2nd row is alway 1
        tri.add(new ArrayList<>());
        tri.get(0).add(1);

       for(int i=1; i<numRows; i++){
           List<Integer> prev_row = tri.get(i-1);
           List<Integer> row = new ArrayList<>();

           row.add(1);

           for(int j=1; j<i; j++){
               row.add(prev_row.get(j-1)+prev_row.get(j));
           }
           row.add(1);
           tri.add(row);
       }
       return tri;
   }

   // 5.b. Approach II


   // 6. contains duplicate
   // 2 methods: dictionary or sorting
   public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i=0; i<nums.length; i++){
          if (numbers.contains(nums[i])) return true;
          numbers.add(nums[i]);
        }
        return false;
    }

    // Sorting the array methods
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++){
            if (nums[i]==nums[i+1]) return true;
        }
        return false;
    }

    // 7. To lower case
    public String toLowerCase(String str) {
        String result = "";
        for (char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                result = result+(char)(c+32);
            }
            else{
                result = result + c;
            }
        }
        return result;
    }
}
