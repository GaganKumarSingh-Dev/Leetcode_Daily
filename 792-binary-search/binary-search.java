class Solution {
    public int search(int[] nums, int target) {
        return binarySearchRecursive(nums, target, 0, nums.length-1);
    }

    static int binarySearchRecursive(int[] arr, int key, int start, int end) {
        int mid = start + (end - start)/2;
        if(start > end) return -1;
        if(arr[mid] == key) return mid;

        if(arr[mid] < key) start = mid + 1;
        else if(arr[mid] > key) end = mid - 1;

        return binarySearchRecursive(arr, key, start, end);
    }
}