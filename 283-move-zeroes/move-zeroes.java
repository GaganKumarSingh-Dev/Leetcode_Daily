class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] != 0) {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                start++;
            }
        }
    }
}