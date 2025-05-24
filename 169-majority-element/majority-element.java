class Solution {
    public int majorityElement(int[] nums) {
        int MIN_OCCURENCE = nums.length / 2; 

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i: nums) {
            if(hm.containsKey(i)) hm.replace(i, hm.get(i) + 1);
            else hm.put(i, 1);
        }
        
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()) 
            if(entry.getValue() > MIN_OCCURENCE)
                return entry.getKey();
        return -1;
    }
}