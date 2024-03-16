class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the values and their indices
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement for the current element
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If it does, return the indices of the complement and the current element
                return new int[]{map.get(complement), i};
            }
            // If the complement doesn't exist, put the current element and its index into the map
            map.put(nums[i], i);
        }
        
        // If no solution found, return an empty array
        return new int[0];
    }
}