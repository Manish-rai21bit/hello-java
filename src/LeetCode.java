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

    // 2. Given a 2D grid map, find the number of islands
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
}
