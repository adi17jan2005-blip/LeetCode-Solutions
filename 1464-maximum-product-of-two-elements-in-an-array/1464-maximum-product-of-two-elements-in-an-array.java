class Solution {
    public int maxProduct(int[] nums) {
       int largest =nums[0];
       int secondl=-1;
       int n=nums.length;
       for(int i=1;i<n;i++){
        if(largest<=nums[i]){
            secondl=largest;
            largest=nums[i];
        }
        else if(largest>nums[i] && secondl<nums[i]){
            secondl=nums[i];
        }
       }
       return (largest-1)*(secondl-1);
    }
}