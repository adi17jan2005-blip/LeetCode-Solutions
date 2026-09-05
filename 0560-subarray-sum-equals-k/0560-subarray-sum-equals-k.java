class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        int[] prefixSum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int j = 1; j <= n; j++) {
            for (int i = 0; i < j; i++) {
                if (prefixSum[j] - prefixSum[i] == k) {
                    count++;
                }
            }
        }

        return count;
    }
}