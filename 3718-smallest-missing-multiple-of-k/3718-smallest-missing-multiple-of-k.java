class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int j=1;
        while(!set.add(j*k)){
            j++;
         }
         return j*k;
        
    }
}