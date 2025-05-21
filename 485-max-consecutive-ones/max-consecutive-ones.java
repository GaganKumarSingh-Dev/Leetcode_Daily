class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int key = 1;

        int counter = 0, max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n == key)
                counter++;
            max = Math.max(max, counter);
            if (n != key)
                counter = 0;
        }

        return max;
    }
}