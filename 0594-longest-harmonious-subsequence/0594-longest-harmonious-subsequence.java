class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=0;
        int Max_Length=0;

        for(right=0;right<nums.length;right++){
        while(nums[right]-nums[left]>1){
            left++;
        }

        if(nums[right]-nums[left]==1){
            Max_Length=Math.max(Max_Length,right-left+1);
        }
        }

 return Max_Length;   }
}