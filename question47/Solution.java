class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> count = new HashMap<>();
        
       
        for (int i = 0; i <= n - k; i++) {
            
            Set<Integer> window = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                window.add(nums[j]);
            }
            
            for (int num : window) {
                count.put(num, count.getOrDefault(num, 0) + 1);
            }
        }

       
        int largest = -1;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                largest = Math.max(largest, entry.getKey());
            }
        }

        return largest;
    }
}