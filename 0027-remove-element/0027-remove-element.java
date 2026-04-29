class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // position for next valid element

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[k] = nums[j];
                k++;
            }
        }

        return k;
    }
}