class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        boolean bool = true;
        for(int i=0;i<n;i++){
            bool = true;
            for (int j = 0; j < n-1; j++) {
                int k = (j+i)%(n);
                int l = (j+i+1)%(n);
                if (nums[k] > nums[l]){
                    bool = false;
                    break;
                }
            }
            if(bool == true) return true;
        }
        return bool;
    }
}