class Solution {
    public int matrixSum(int[][] nums) {
              for (int[] row : nums) {
            Arrays.sort(row);
        } int totalScore = 0;
        int rows = nums.length;
        int cols = nums[0].length;
     for (int j = 0; j < cols; j++) {
            int maxInStep = 0;
            for (int i = 0; i < rows; i++) {
                maxInStep = Math.max(maxInStep, nums[i][j]);
            }
            totalScore += maxInStep;
        }
        
        return totalScore;
  
    }
}