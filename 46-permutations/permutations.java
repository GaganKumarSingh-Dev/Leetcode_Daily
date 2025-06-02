class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> arr = new ArrayList<>(Arrays.asList());
        for (int num : nums) arr.add(num);
        List<List<Integer>> arl = new ArrayList<>();
        permutation(arr, arr.size(), 0, arl);
        return arl;
    }

    static void permutation(List<Integer> arr, int n, int idx, List<List<Integer>> arl) {
        if(idx==n){
            arl.add(new ArrayList<>(arr));
            return;
        }

        for(int i=idx; i<n; i++) {
            int temp = arr.get(idx);
            arr.set(idx, arr.get(i));
            arr.set(i, temp);  
            
            permutation(arr, n, idx+1, arl);
            
            temp = arr.get(idx);
            arr.set(idx, arr.get(i));
            arr.set(i, temp);          
        }
    }
}
