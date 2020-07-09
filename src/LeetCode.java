class LeetCode {
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
    }
}
