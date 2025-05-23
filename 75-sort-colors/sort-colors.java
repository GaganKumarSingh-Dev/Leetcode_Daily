class Solution {
    public void sortColors(int[] nums) {
        int[] countArr = { 0, 0, 0 };

        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0:
                    countArr[0]++;
                    break;
                case 1:
                    countArr[1]++;
                    break;
                case 2:
                    countArr[2]++;
                    break;
                default:
                    break;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (countArr[0] > 0) {
                nums[j] = 0;
                countArr[0]--;
                continue;
            } else if (countArr[1] > 0) {
                nums[j] = 1;
                countArr[1]--;
                continue;
            } else if (countArr[2] > 0) {
                nums[j] = 2;
                countArr[2]--;
                continue;
            } else {
                System.out.println("Array is empty");
            }
        }

        for (int n : nums)
            System.out.print(n + " ");

    }

}