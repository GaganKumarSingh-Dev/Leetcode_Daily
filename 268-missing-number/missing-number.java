class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0, xor2=0, j=0;
        for(int n: nums){
            xor1 = xor1 ^ n;
            xor2 = xor2 ^ j++;
        }
        xor2 = xor2 ^ j;
        return xor1^xor2;
    }
}